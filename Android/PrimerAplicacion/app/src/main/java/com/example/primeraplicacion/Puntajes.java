package com.example.primeraplicacion;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.primeraplicacion.utils.config;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Puntajes extends AppCompatActivity {

    private TableLayout tableLayout;

    String nombre;
    String cedula;
    config dataConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntajes);

        tableLayout = findViewById(R.id.tableLayout);

        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        cedula = archivo.getString("cedulaUsuario",null);
        nombre = archivo.getString("nombreUsuario",null);
        FloatingActionButton btn_salir = findViewById(R.id.salirBoton);
        FloatingActionButton btn_comenzar = findViewById(R.id.comenzarBoton);
        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });

        btn_comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comenzar();
            }
        });

        dataConfig = new config(getApplicationContext());
        obtenerPuntajes(dataConfig.getEndPoint("/ObtenerPuntajes.php"), String.valueOf(cedula));

    }

    public void abrirModal(View view, int id) {
        Intent intent = new Intent(getApplicationContext(), DetallePreguntas.class);
        intent.putExtra("id_puntaje", id);
        startActivity(intent);
    }

    public void comenzar() {
        System.out.println("SSS"+cedula);

        Intent intencion = new Intent(getApplicationContext(), PreguntasApi.class);
        intencion.putExtra("nombreUsuario", nombre);
        intencion.putExtra("cedulaUsuario", cedula);
        startActivity(intencion);
        finish();
    }
    public void salir() {

        SharedPreferences sharedPreferences = getSharedPreferences("app_preguntas",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();

        Intent intencion = new Intent(getApplicationContext(), Login.class);
        startActivity(intencion);
        finish();
    }

    public void obtenerPuntajes(String url, final String cedula) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext()) ;

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        procesarRespuesta(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        error.printStackTrace();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<>();
                params.put("cedula", cedula);
                return params;
            }
        };

        queue.add(stringRequest);
    }

    private void procesarRespuesta(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);

            JSONArray puntajesArray = jsonObject.getJSONArray("puntajes");
            for (int i = 0; i < puntajesArray.length(); i++) {
                JSONObject puntaje = puntajesArray.getJSONObject(i);

                String nombre = puntaje.getString("nombre");
                String puntajeStr = puntaje.getString("puntaje");
                String fecha = puntaje.getString("fecha");
                int idPuntaje = puntaje.getInt("id_puntaje");

                TableRow row = new TableRow(Puntajes.this);

                // Configuración para el TextView de Nombre
                TextView tvNombre = new TextView(Puntajes.this);
                tvNombre.setText(nombre);
                tvNombre.setTypeface(null, Typeface.BOLD); // Hace el texto en negrita
                tvNombre.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                TableRow.LayoutParams layoutParamsNombre = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
                layoutParamsNombre.setMargins(25, 25, 0, 25);
                tvNombre.setLayoutParams(layoutParamsNombre);
                tvNombre.setGravity(View.TEXT_ALIGNMENT_CENTER);
                row.addView(tvNombre);

                // Configuración para el TextView de Puntaje
                TextView tvPuntaje = new TextView(Puntajes.this);
                tvPuntaje.setText(puntajeStr);
                tvPuntaje.setGravity(View.TEXT_ALIGNMENT_CENTER);
                tvPuntaje.setTypeface(null, Typeface.BOLD);
                tvPuntaje.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                TableRow.LayoutParams layoutParamspuntaje = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
                layoutParamspuntaje.setMargins(0, 25, 0, 25);
                tvNombre.setLayoutParams(layoutParamspuntaje);
                row.addView(tvPuntaje);

                // Configuración para el TextView de Fecha
                TextView tvFecha = new TextView(Puntajes.this);
                tvFecha.setText(fecha);
                tvFecha.setGravity(View.TEXT_ALIGNMENT_CENTER);
                tvFecha.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
                tvFecha.setTypeface(null, Typeface.BOLD);
                TableRow.LayoutParams layoutParamsfecha = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
                layoutParamspuntaje.setMargins(0, 25, 0, 25);
                tvNombre.setLayoutParams(layoutParamsfecha);
                row.addView(tvFecha);

                Button btnVerPreguntas = new Button(Puntajes.this);
                btnVerPreguntas.setText("Ver Preguntas");
                btnVerPreguntas.setTag(idPuntaje);

                // Configuración del estilo para el botón
                btnVerPreguntas.setBackgroundResource(R.drawable.colorboton); // Define tu propio drawable para el fondo del botón
                btnVerPreguntas.setTextColor(getResources().getColor(R.color.colorTextoBoton)); // Color del texto
                btnVerPreguntas.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12); // Tamaño del texto

                // Configuración del margen para el botón Ver Preguntas
                TableRow.LayoutParams btnLayoutParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
                btnLayoutParams.setMargins(0, 10, 25, 25);
                btnVerPreguntas.setLayoutParams(btnLayoutParams);

                btnVerPreguntas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        abrirModal(v, idPuntaje);
                    }
                });

                // Agregar vistas a la fila
                row.addView(btnVerPreguntas);

                // Agregar la fila a la tabla
                tableLayout.addView(row);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
