package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cuestionario.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Responder_preguntas extends AppCompatActivity {
    TextView etq_nombre_usuario;
    TextView etq_f_inicio;
    TextView etq_pregunta_act;
    TextView etq_desc_pregunta;
    ImageView img_pregunta;
    RadioGroup radio_group;
    String id_cuestionario;
    String nombre_usuario;
    String fecha_inicio;
    Config dataConfig;
    int contadorPreguntas;
    ArrayList<Integer> listaIds;
    int id_correcta;
    String id_pregunta;
    int cantidad_preguntas;
    int cant_ok;
    int cant_error;
    String fecha_fin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responder_preguntas);
        //------------------------------------------------------
        dataConfig = new Config(getApplicationContext());
        etq_nombre_usuario = findViewById(R.id.etq_nombre_usuario);
        etq_f_inicio = findViewById(R.id.etq_f_inicio);
        etq_pregunta_act = findViewById(R.id.etq_pregunta_act);
        etq_desc_pregunta = findViewById(R.id.etq_desc_pregunta);
        img_pregunta = findViewById(R.id.img_pregunta);
        radio_group = findViewById(R.id.radio_group);
        contadorPreguntas = 0;
        listaIds = new ArrayList<>();
        id_correcta = 0;
        id_pregunta = "";
        cantidad_preguntas = 0;
        cant_ok = 0;
        cant_error = 0;
        fecha_fin = "";
        //------------------------------------------------------
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        id_cuestionario = archivo.getString("id_cuestionario", null);
        nombre_usuario = archivo.getString("nombres", null);
        fecha_inicio = archivo.getString("fecha_inicio_cuestionario", null);
        //------------------------------------------------------
        consumoImagen("https://st3.depositphotos.com/6723736/12729/v/450/depositphotos_127297230-stock-illustration-download-sign-load-icon-load.jpg");
        nuevoCuestionario(id_cuestionario);
    }

    public  void siguientePregunta(View v){
        if (comprobarRespuesta()){
            if(listaIds.size()>9){
                Intent intecion = new Intent(getApplicationContext(), ResumenUsuario.class);
                startActivity(intecion);
                finish();
            }else{
                consumoImagen("https://st3.depositphotos.com/6723736/12729/v/450/depositphotos_127297230-stock-illustration-download-sign-load-icon-load.jpg");
                nuevoCuestionario(id_cuestionario);
            }
        }else{
            Toast.makeText(getApplicationContext(), "Seleccione una opción", Toast.LENGTH_LONG).show();
        }
    }

    public  boolean comprobarRespuesta(){
        int idRadioButton = radio_group.getCheckedRadioButtonId();
        radio_group.clearCheck();
        if (idRadioButton != -1){
            String respuesta_usuario = "";
            RadioButton radioButtonSeleccionado = findViewById(idRadioButton);
            String textoSeleccionado = radioButtonSeleccionado.getText().toString();

            if (idRadioButton == id_correcta){
                respuesta_usuario = "OK";
                cant_ok ++;
            }else{
                respuesta_usuario = "ERROR";
                cant_error ++;
            }
            cantidad_preguntas ++;
            fecha_fin  = listaIds.size()>9 ? getFecha() : "";
            almacenarRespuesta(id_cuestionario, id_pregunta, textoSeleccionado, respuesta_usuario);
            updateCuestionario(String.valueOf(cantidad_preguntas), String.valueOf(cant_ok), String.valueOf(cant_error), id_cuestionario, fecha_fin);
            return true;
        }else{
            return  false;
        }
    }

    public  String getFecha(){
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println("Fecha y hora actual con segundos: " + formattedDate);

        return formattedDate;

    }


    public void nuevoCuestionario(String id_cuestionario) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/getOtherPregunta.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());
                    boolean status = jsonObject.getBoolean("status");
                    if (status) {
                        //Se llama la funcion para imprimir los datos en pantalla
                        JSONObject pregunta = jsonObject.getJSONObject("pregunta");
                        String id_pregunta = pregunta.getString("id");

                        if (validarId(id_pregunta)){
                            JSONArray opciones = jsonObject.getJSONArray("opciones");
                            contadorPreguntas++;
                            printDetallePregunta(pregunta, opciones);
                        }

                    } else {
                        volverResumen();
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
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void almacenarRespuesta(String id_cuestionario, String id_pregunta, String respuesta, String estado) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/almacenarRespuesta.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());
                    boolean status = jsonObject.getBoolean("status");
                    if (status) {
                        System.out.println("Si se hizo el insert");
                    } else {
                        System.out.println("El status del insert dio false");
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
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_cuestionario", id_cuestionario);
                params.put("id_pregunta", id_pregunta);
                params.put("respuesta", respuesta);
                params.put("estado", estado);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void updateCuestionario(String cant_preguntas, String cant_ok, String cant_error, String id_cuestionario, String fecha_fin) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/updateCuestionario.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());
                    boolean status = jsonObject.getBoolean("status");
                    if (status) {
                        System.out.println("Si se hizo el insert");
                    } else {
                        System.out.println("El status del insert dio false");
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
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("cant_preguntas", cant_preguntas);
                params.put("cant_ok", cant_ok);
                params.put("cant_error", cant_error);
                params.put("id_cuestionario", id_cuestionario);
                params.put("fecha_fin", fecha_fin);
                return params;
            }
        };

        queue.add(solicitud);
    }


    public boolean validarId(String id){
        int idPreunta = Integer.parseInt(id);

        if (listaIds.contains(idPreunta)){
            nuevoCuestionario(id_cuestionario);
            return false;
        }else{
            listaIds.add(idPreunta);
            return  true;
        }
    }


    public void printDetallePregunta(JSONObject pregunta, JSONArray opciones){
        try {
            etq_nombre_usuario.setText(nombre_usuario);
            etq_f_inicio.setText(fecha_inicio);
            etq_pregunta_act.setText(String.valueOf(contadorPreguntas));
            etq_desc_pregunta.setText(pregunta.getString("descripcion"));
            consumoImagen(pregunta.getString("url_imagen"));
            id_correcta = pregunta.getInt("id_correcta");
            id_pregunta = pregunta.getString("id");

            radio_group.removeAllViews();
            for (int i=0; i<opciones.length(); i++){
                JSONObject opcion = opciones.getJSONObject(i);
                int id_opcion = opcion.getInt("id");

                RadioButton radioButton = new RadioButton(getApplicationContext());
                radioButton.setText(opcion.getString("descripcion"));
                radioButton.setTextColor(Color.BLACK);
                radioButton.setId(id_opcion);



                int colorId = ContextCompat.getColor(this, R.color.black);
                ColorStateList colorStateList = ColorStateList.valueOf(colorId);
                radioButton.setButtonTintList(colorStateList);

                radio_group.addView(radioButton);
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }

    public  void  volverResumen(){
        Intent intecion = new Intent(getApplicationContext(), ResumenUsuario.class);
        startActivity(intecion);
        finish();
    }

    public void consumoImagen(String url){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        ImageRequest solicitud = new ImageRequest(
                url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        // Set the image in the ImageView.
                        img_pregunta.setImageBitmap(bitmap);
                    }
                },
                0, 0, null, // maxWidth, maxHeight, decodeConfig;
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Handle the error.
                    }
                });

        queue.add(solicitud);
    }
}