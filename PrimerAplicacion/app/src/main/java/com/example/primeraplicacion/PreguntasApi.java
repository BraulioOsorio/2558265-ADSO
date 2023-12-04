package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PreguntasApi extends AppCompatActivity {

    TextView TextoDescripcion;
    RadioGroup Respuesta;
    Button buttonResponder;
    List<Pregunta> preguntas;
    int preguntaActualIndex;
    ArrayList<String> respuestasUsuario;
    String nombre;
    String cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_api);

        TextoDescripcion = findViewById(R.id.descripcion);
        Respuesta = findViewById(R.id.respuesta);
        buttonResponder = findViewById(R.id.respuestaa);

        preguntas = new ArrayList<>();
        respuestasUsuario = new ArrayList<>();
        cargarPreguntasAleatorias();
        Bundle datosUsuario = getIntent().getExtras();
        nombre = datosUsuario.getString("nombreUsuario");
        cedula = datosUsuario.getString("cedulaUsuario");


        buttonResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preguntaa();
            }
        });
    }

    private void cargarPreguntasAleatorias() {
        RequestQueue queue = Volley.newRequestQueue(this);
        //Sena 192.168.143.31
        //Casa 192.168.1.7
        String url = "http://192.168.143.31/preguntas/ObtenerPregunta.php";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray preguntasArray = response.getJSONArray("preguntas");
                            List<Pregunta> preguntasAleatorias = new ArrayList<>();

                            for (int i = 0; i < preguntasArray.length(); i++) {
                                JSONObject preguntaJson = preguntasArray.getJSONObject(i);
                                int idPregunta = preguntaJson.getInt("id_pregunta");
                                String descripcion = preguntaJson.getString("descripcion");

                                List<String> opciones = new ArrayList<>();
                                for (int j = 1; j <= 4; j++) {
                                    String opcion = preguntaJson.getString("opcion" + j);
                                    opciones.add(opcion);
                                }

                                int imagenResourceId = getResources().getIdentifier("imagen" + idPregunta, "drawable", getPackageName());

                                preguntasAleatorias.add(new Pregunta(descripcion, opciones, imagenResourceId));
                            }

                            Collections.shuffle(preguntasAleatorias);

                            preguntas.clear();
                            preguntas.addAll(preguntasAleatorias);

                            mostrarPreguntaActual();
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("Error JSON", "Error al procesar la respuesta JSON");
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                        Log.e("Error Volley", "Error en la solicitud Volley");
                    }
                });

        queue.add(jsonObjectRequest);
    }

    private void mostrarPreguntaActual() {
        if (preguntaActualIndex < preguntas.size()) {
            Pregunta preguntaActual = preguntas.get(preguntaActualIndex);

            TextoDescripcion.setText(preguntaActual.getDescripcion());
            ImageView imageView = findViewById(R.id.imagenPregunta);
            imageView.setImageResource(preguntaActual.getImagenResourceId());

            Respuesta.removeAllViews();

            for (String respuesta : preguntaActual.getRespuestas()) {
                if(!respuesta.equals("null")){
                    RadioButton radioButton = new RadioButton(getApplicationContext());
                    radioButton.setTextColor(getResources().getColor(R.color.black));
                    radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

                    radioButton.setText(respuesta);
                    Respuesta.addView(radioButton);
                }

            }
        } else {
            irARespuestas();
        }
    }

    private void irARespuestas() {
        Intent intencion = new Intent(getApplicationContext(), Respuestas.class);
        intencion.putStringArrayListExtra("opciones", respuestasUsuario);
        intencion.putExtra("nombreUsuario", nombre);
        intencion.putExtra("cedulaUsuario", cedula);
        startActivity(intencion);
        finish();
    }

    private void Preguntaa() {
        int radioButtonId = Respuesta.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesta = findViewById(radioButtonId);
            String opcionSeleccionada = respuesta.getText().toString();
            respuestasUsuario.add(opcionSeleccionada);
            preguntaActualIndex++;
            System.out.println("Seleccionada: "+opcionSeleccionada);
            mostrarPreguntaActual();
        } else {
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }
    }





}
