package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View vista){
        EditText nombreUsuarioEditText = findViewById(R.id.nombreUsuario);
        EditText cedulaUsuarioEditText = findViewById(R.id.cedulaUsuario);
        String nombreUsuario = nombreUsuarioEditText.getText().toString();
        String cedulaUsuario = cedulaUsuarioEditText.getText().toString();
        System.out.println(cedulaUsuario);
        if(!nombreUsuario.equals("") && !cedulaUsuario.equals("")){
            consumoPostJson(nombreUsuario,cedulaUsuario);
            Intent intencion = new Intent(getApplicationContext(), PreguntasApi.class);
            intencion.putExtra("nombreUsuario", nombreUsuario);
            intencion.putExtra("cedulaUsuario", cedulaUsuario);
            startActivity(intencion);
            finish();
        } else {
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe llenar los campos");
        }

    }
    public void consumoPostJson(String nombre,String cedula){
        System.out.println("Iniciando consumo");

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://192.168.143.31/preguntas/InsertUser.php";

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());
                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
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
                params.put("cedula",cedula );
                params.put("nombre",nombre);

                return params;
            }
        };

        queue.add(solicitud);
    }
}