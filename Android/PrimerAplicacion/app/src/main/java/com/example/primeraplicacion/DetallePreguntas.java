package com.example.primeraplicacion;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.primeraplicacion.utils.config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class DetallePreguntas extends AppCompatActivity {

    private TableLayout tableLayoutDetalle;
    config dataConfig;

    String nombre;
    String cedula;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_preguntas);
        dataConfig = new config(getApplicationContext());
        tableLayoutDetalle = findViewById(R.id.tableLayoutDetalle);
        Bundle datosUsuario = getIntent().getExtras();
        if (datosUsuario != null) {
            SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
            cedula = archivo.getString("cedulaUsuario",null);
            nombre = archivo.getString("nombreUsuario",null);

            int idPuntaje = datosUsuario.getInt("id_puntaje");

            consumoPostJson(dataConfig.getEndPoint("/ObtenerPreguntasPuntaje.php"), String.valueOf(idPuntaje));
        } else {
            System.out.println("Error");
        }
    }

    public void consumoPostJson(String url, final String idPuntaje) {
        System.out.println("Iniciando consumo");

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    Log.d("DetallePreguntas", "El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    Log.d("DetallePreguntas", jsonObject.toString());

                    JSONArray registrosArray = jsonObject.getJSONArray("registros");

                    for (int i = 0; i < registrosArray.length(); i++) {
                        JSONObject registro = registrosArray.getJSONObject(i);

                        String descripcion = registro.getString("descripcion");
                        String respuesta = registro.getString("respuesta");
                        String solucion = obtenerSolucion(i);

                        TableRow row = new TableRow(DetallePreguntas.this);
                        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT);
                        row.setLayoutParams(lp);

                        agregarTextView(row, descripcion, Gravity.CENTER);
                        agregarTextView(row, respuesta, Gravity.CENTER);
                        agregarTextView(row, solucion, Gravity.CENTER);

                        if (tableLayoutDetalle != null) {
                            tableLayoutDetalle.addView(row);
                        } else {
                            Log.e("DetallePreguntas", "tableLayout es nulo al intentar agregar una fila");
                        }
                    }

                } catch (JSONException e) {
                    Log.e("DetallePreguntas", "El servidor POST responde con un error:");
                    Log.e("DetallePreguntas", e.getMessage());
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println("El servidor POST responde con un error:");
                        System.out.println(error.getMessage());
                    }
                }) {
            @Override
            public String getBodyContentType() {
                return "application/json; charset=utf-8";
            }

            @Override
            public byte[] getBody() {
                try {
                    JSONObject jsonParams = new JSONObject();
                    jsonParams.put("id_puntaje", idPuntaje);
                    return jsonParams.toString().getBytes("utf-8");
                } catch (JSONException e) {
                    System.out.println("Error al construir el cuerpo de la solicitud JSON");
                    return null;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        queue.add(solicitud);
    }
    private String obtenerSolucion(int index) {
        String[] soluciones = {"No", "1917", "1776", "Amazonas", "Hierro", "Africa", "Tokio", "Gabriel García Marquez", "8", "Vincent van Gogh"};

        if (index >= 0 && index < soluciones.length) {
            return soluciones[index];
        } else {
            return "";
        }
    }

    private void agregarTextView(TableRow row, String texto, int gravedad) {
        TextView textView = new TextView(this);
        textView.setText(texto);
        textView.setGravity(gravedad);
        textView.setMaxLines(2);
        textView.setTextSize(14);
        int margenInferior = getResources().getDimensionPixelSize(R.dimen.margen_inferior_entre_filas);
        textView.setPadding(0, 0, 0, margenInferior);

        TableRow.LayoutParams params = new TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 2);
        textView.setLayoutParams(params);

        row.addView(textView);
    }





}
