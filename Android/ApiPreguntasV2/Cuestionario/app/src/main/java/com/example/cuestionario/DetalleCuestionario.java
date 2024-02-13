package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cuestionario.utils.Config;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class DetalleCuestionario extends AppCompatActivity {
    String id_cuestionario;
    TextView etq_nombre;
    TextView etq_fecha_incio;
    TextView etq_fecha_fin;
    TextView etq_cant_preguntas;
    TextView etq_correctas;
    TextView etq_incorrectas;
    Config dataConfig;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuestionario);
        linearLayout = findViewById(R.id.linearLayout);
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_fecha_incio = findViewById(R.id.etq_fecha_incio);
        etq_fecha_fin = findViewById(R.id.etq_fecha_fin);
        etq_cant_preguntas = findViewById(R.id.etq_cant_preguntas);
        etq_correctas = findViewById(R.id.etq_correctas);
        etq_incorrectas = findViewById(R.id.etq_incorrectas);
        //---------------------------------------------------
        FloatingActionButton btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volverActivity();
            }
        });
        //---------------------------------------------------
        dataConfig = new Config(getApplicationContext());
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        id_cuestionario = archivo.getString("id_cuestionario", null);
        ObtenerDetalleCuestionarios(id_cuestionario);
        System.out.println("id_cuestionario: "+id_cuestionario);
        printDatosHeader();
    }


    public  void ObtenerDetalleCuestionarios(String id_cuestionario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/getRespuestas.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());

                    boolean status = jsonObject.getBoolean("status");

                    if (status){
                        printDetalleCuest(jsonObject.getJSONArray("respuestas"));
                    }else{
                        System.out.println("Hubieron problemas en el api");
                    }

                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void printDatosHeader(){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        etq_nombre.setText(archivo.getString("nombres", null));
        etq_fecha_incio.setText(archivo.getString("fecha_inicio_bd", null));
        etq_fecha_fin.setText(archivo.getString("fecha_fin", null));
        etq_cant_preguntas.setText(archivo.getString("cant_preguntas", null));
        etq_correctas.setText(archivo.getString("cant_ok", null));
        etq_incorrectas.setText(archivo.getString("cant_error", null));
    }

    public void printDetalleCuest(JSONArray respuestas){
        System.out.println(respuestas);

        try {
            for (int i=0; i<respuestas.length(); i++){
                JSONObject respuesta = respuestas.getJSONObject(i);
                JSONArray opciones = respuesta.getJSONArray("opciones");

                String respuestaUsuario = respuesta.getJSONObject("pregunta").getString("respuesta");
                String estadoRes = respuesta.getJSONObject("pregunta").getString("estado");

                TextView etq_nPregunta = new TextView(getApplicationContext());
                TextView etq_detalle = new TextView(getApplicationContext());

                etq_nPregunta.setText("Pregunta: "+(i+1));
                etq_nPregunta.setTextColor(Color.BLACK);
                etq_nPregunta.setTextSize(20);

                etq_detalle.setText(respuesta.getJSONObject("pregunta").getString("descripcion")+"\n");


                etq_detalle.setTextColor(Color.BLACK);
                etq_detalle.setTextSize(18);
                linearLayout.addView(etq_nPregunta);
                linearLayout.addView(etq_detalle);

                for (int j=0; j<opciones.length(); j++){
                    JSONObject opcion = opciones.getJSONObject(j);
                    TextView opcionSelect = new TextView(getApplicationContext());
                    opcionSelect.append("   • "+opcion.getString("descripcion")+"\n");
                    if (opcion.getString("descripcion").equalsIgnoreCase(respuestaUsuario)){
                        if (estadoRes.equalsIgnoreCase("OK")){
                            opcionSelect.setTextColor(Color.GREEN);
                        } else if (estadoRes.equalsIgnoreCase("ERROR")) {
                            opcionSelect.setTextColor(Color.RED);
                        }
                    }else{
                        opcionSelect.setTextColor(Color.BLACK);
                    }
                    linearLayout.addView(opcionSelect);
                }
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public  void volverActivity(){
        Intent intencion = new Intent(getApplicationContext(), ResumenUsuario.class);
        startActivity(intencion);
        finish();
    }
}