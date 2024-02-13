package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cuestionario.utils.Config;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText campo_correo;
    EditText campo_password;
    Config dataConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo_correo = findViewById(R.id.campo_correo);
        campo_password = findViewById(R.id.campo_password);

        dataConfig = new Config(getApplicationContext());

        validarSesion();
    }


    public  void validarUsuario(View vista){
        String correo = campo_correo.getText().toString();
        String password = campo_password.getText().toString();

        if(!correo.equals("") && !password.equals("")){
            apiValidarUsuario(correo, password);
        }else{
            Toast.makeText(getApplicationContext(), "Datos obligatorios", Toast.LENGTH_LONG).show();
        }
    }

    public void apiValidarUsuario(String correo, String password){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = dataConfig.getEndPoint("/validarUsuario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject datos = new JSONObject(response);
                    if (datos.getBoolean("status")){
                        cambiarActivity(datos.getJSONObject("usuario").getString("id_usuario"), datos.getJSONObject("usuario").getString("nombres"));
                    }else{
                        Toast.makeText(getApplicationContext(), "Usuario no encontrado", Toast.LENGTH_LONG).show();
                    }
                    System.out.println("El servidor POST responde OK");
                    System.out.println(response);
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(jsonObject.toString());
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
                params.put("correo", correo);
                params.put("password", password);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void cambiarActivity(String id_usuario, String nombres){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.putString("id_usuario", id_usuario);
        editor.putString("nombres", nombres);
        editor.apply();

        Intent intecion = new Intent(getApplicationContext(), ResumenUsuario.class);
        startActivity(intecion);
        finish();
    }

    //Función para validar sesion
    public void validarSesion(){
        SharedPreferences archivo = getSharedPreferences("app_preguntas", Context.MODE_PRIVATE);
        String idUsuario = archivo.getString("id_usuario", null);
        String nombres = archivo.getString("nombres", null);

        if(idUsuario != null && nombres != null){
            Intent intecion = new Intent(getApplicationContext(), ResumenUsuario.class);
            startActivity(intecion);
            finish();
        }
    }
}