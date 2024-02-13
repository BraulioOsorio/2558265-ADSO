package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cuestionario.utils.Config;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Iniciar_cuestionario extends AppCompatActivity {
    TextView etq_nombre_usuario;
    TextView etq_fecha_incio;
    Config dataConfig;
    String id_usuario;
    String fecha_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_cuestionario);
        dataConfig = new Config(getApplicationContext());
        etq_nombre_usuario = findViewById(R.id.etq_nombre_usuario);
        etq_fecha_incio = findViewById(R.id.etq_fecha_incio);

        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        etq_nombre_usuario.setText(archivo.getString("nombres", null));
        id_usuario = archivo.getString("id_usuario", null);
        getFecha();
    }


    public void confirmarCuestionario(View v) {
        nuevoCuestionario(id_usuario, fecha_inicio);
    }


    public  void getFecha(){
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println("Fecha y hora actual con segundos: " + formattedDate);

        fecha_inicio = formattedDate;

        etq_fecha_incio.setText(formattedDate);

    }


    public void nuevoCuestionario(String id_usuario, String fecha_inicio) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/createCuestionario.php");

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
                        String id_cuestionario = jsonObject.getString("id_cuestionario");
                        activity_preguntas(id_cuestionario);
                    } else {
                        System.out.println("Algo salio mal en el consumo del api de nuevoCuestionario");
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
                params.put("id_usuario", id_usuario);
                params.put("fecha_inicio", fecha_inicio);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void activity_preguntas(String id_cuestionario){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.putString("id_cuestionario", id_cuestionario);
        editor.putString("fecha_inicio_cuestionario", fecha_inicio);
        editor.apply();

        Intent intecion = new Intent(getApplicationContext(), Responder_preguntas.class);
        startActivity(intecion);
        finish();
    }
}