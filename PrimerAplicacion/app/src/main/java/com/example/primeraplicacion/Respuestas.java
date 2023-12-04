package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Respuestas extends AppCompatActivity {

    String[] respuestas = new String[10];
    String[] respuestasCorrectas = {"No","1776","Amazonas","Hierro","Africa","Tokio","Gabriel García Marquez","8","Vincent van Gogh","1917"};
    String nombre;
    String cedula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        // Obtener respuestas y datos del usuario desde el Intent
        ArrayList<String> opciones = getIntent().getStringArrayListExtra("opciones");
        Bundle datosUsuario = getIntent().getExtras();
        nombre = datosUsuario.getString("nombreUsuario");
        cedula = datosUsuario.getString("cedulaUsuario");

        // Almacenar respuestas en el array
        for (int i = 0; i < opciones.size() && i < respuestas.length; i++) {
            respuestas[i] = opciones.get(i);
        }

        // Verificar respuestas y calcular puntaje
        int puntaje = 0;
        for (int i = 0; i < respuestas.length; i++) {
            boolean correcta = false;

            if (respuestas[i] != null) {
                String respuesta = respuestas[i];

                for (int f = 0; f < respuestasCorrectas.length; f++) {
                    String solucion = respuestasCorrectas[f];

                    if (respuesta.equals(solucion)) {
                        correcta = true;
                        break;
                    }
                }

                TextView etiquetaResultado = findViewById(getResources().getIdentifier("respuesta" + (i + 1), "id", getPackageName()));

                if (etiquetaResultado != null) {
                    if (correcta) {
                        puntaje = puntaje + 1;
                        etiquetaResultado.setText("Pregunta " + (i + 1) + ": " + respuesta + ". \n La respuesta es correcta\n ");
                    } else {
                        etiquetaResultado.setText("Pregunta " + (i + 1) + ": " + respuesta + ". \n La respuesta es incorrecta \n");
                    }
                }
            }
        }

        // Mostrar puntaje
        TextView puntajes = findViewById(R.id.puntaje);

        if (puntaje >= 5) {
            puntajes.setText("Usted ganó con un puntaje de: " + puntaje);
        } else {
            puntajes.setText("Usted perdió con un puntaje de: " + puntaje);
        }

        // Enviar respuestas y puntaje al servidor PHP
        enviarRespuestasYPuntaje(cedula, convertirRespuestasAMap(), puntaje);
    }
    private Map<String, String> convertirRespuestasAMap() {
        Map<String, String> respuestasMap = new HashMap<>();
        for (int i = 0; i < respuestas.length; i++) {
            respuestasMap.put(String.valueOf(i + 1), respuestas[i]);
        }
        return respuestasMap;
    }

    public void enviarRespuestasYPuntaje(String cedula, Map<String, String> respuestas, int puntaje) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://192.168.143.31/preguntas/InsertRespuestas.php";

        JSONObject jsonBody = new JSONObject();
        try {
            jsonBody.put("cedula", cedula);
            jsonBody.put("respuestas", new JSONObject(respuestas));
            jsonBody.put("puntaje", puntaje);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonBody,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        System.out.println("El servidor POST responde OK");
                        System.out.println(response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println("El servidor POST responde con un error:");
                        System.out.println(error.getMessage());
                    }
                });

        queue.add(jsonObjectRequest);
    }

}
