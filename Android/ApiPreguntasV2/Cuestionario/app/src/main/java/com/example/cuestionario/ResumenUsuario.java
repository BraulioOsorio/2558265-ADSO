package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class ResumenUsuario extends AppCompatActivity {

    String id_usuario;
    String nombres;
    TextView etq_usuario;
    LinearLayout layoutCuestionarios;
    Config dataConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_usuario);
        etq_usuario = findViewById(R.id.etq_usuario);
        layoutCuestionarios = findViewById(R.id.layoutCuestionarios);
        dataConfig = new Config(getApplicationContext());

        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        id_usuario = archivo.getString("id_usuario", null);
        nombres = archivo.getString("nombres", null);

        etq_usuario.setText(nombres);

        FloatingActionButton btn_cerrarSesion = findViewById(R.id.btn_cerrarSesion);
        btn_cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cerrarSesion();
            }
        });

        FloatingActionButton btn_comenzar = findViewById(R.id.btn_comenzar);

        btn_comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarActivityIniciarCuestionario();
            }
        });

        obtenerCuestionarios(id_usuario);
    }

    public  void cerrarSesion(){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.apply();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);
        finish();
    }

    public  void cambiarActivityIniciarCuestionario(){

        Intent intecion = new Intent(getApplicationContext(), Iniciar_cuestionario.class);
        startActivity(intecion);
        finish();
    }

    public void obtenerCuestionarios(String id_usuario){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/getCuestionarios.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());

                    cargarResumen(jsonObject.getJSONArray("resumen"));
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
                params.put("id_usuario", id_usuario);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public  void cargarResumen(JSONArray datos){
        Drawable backGroundDrw = getResources().getDrawable(R.drawable.background_layout);

        try {
            for(int i=0; i<datos.length(); i++){
                JSONObject cuestionarios = datos.getJSONObject(i);
                String id_cuestionario = cuestionarios.getString("id");
                String fecha_inicio = cuestionarios.getString("fecha_inicio");
                String fecha_fin = cuestionarios.getString("fecha_fin");
                String cant_preguntas = cuestionarios.getString("cant_preguntas");
                String cant_ok = cuestionarios.getString("cant_ok");
                String cant_error = cuestionarios.getString("cant_error");

                TextView etiqueta = new TextView(getApplicationContext());

                etiqueta.setText("N° "+(i+1)+"\n");
                etiqueta.append("Fecha inicio: "+cuestionarios.getString("fecha_inicio")+"\n");
                etiqueta.append("Preguntas: "+cuestionarios.getString("cant_preguntas")+"\n");
                etiqueta.append("Correctas: "+cuestionarios.getString("cant_ok")+" - ");
                etiqueta.append("Erroneas: "+cuestionarios.getString("cant_error")+"\n");
                etiqueta.setTextColor(Color.BLACK);
                etiqueta.setTextSize(20);
                etiqueta.setPadding(25, 25, 0, 0);

                etiqueta.setBackground(backGroundDrw);
                //Asi se crea el margin para la etiqueta, mediante parametros, unos lineas mas abajo se agrega a la etiqueta
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                //Por aquí
                params.setMargins(0,0,0,30);
                etiqueta.setLayoutParams(params);


                int finalI = i;
                etiqueta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.out.println("Se hizo click en el textView");
                        cambiarActivity(id_cuestionario, fecha_inicio, fecha_fin, cant_preguntas, cant_ok, cant_error);
                    }
                });

                layoutCuestionarios.addView(etiqueta);
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }



    public void cambiarActivity(String id_cuestionario, String fecha_inicio, String fecha_fin, String cant_preguntas, String cant_ok, String cant_error){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.putString("id_cuestionario", id_cuestionario);
        editor.putString("fecha_inicio_bd", fecha_inicio);
        editor.putString("fecha_fin", fecha_fin);
        editor.putString("cant_preguntas", cant_preguntas);
        editor.putString("cant_ok", cant_ok);
        editor.putString("cant_error", cant_error);
        editor.apply();

        Intent intecion = new Intent(getApplicationContext(), DetalleCuestionario.class);
        startActivity(intecion);
        finish();
    }


}