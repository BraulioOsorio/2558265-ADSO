package com.example.pokeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
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
import java.util.List;

public class DetallePokemon extends AppCompatActivity {
    TextView etqNombre;
    String urlBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);
        etqNombre = findViewById(R.id.nombreP);
        Bundle datos = getIntent().getExtras();
        String nombreM = datos.getString("nombre").toUpperCase();
        urlBase = datos.getString("url").toUpperCase();

        etqNombre.setText(nombreM);
        consumoGetJson(urlBase);
    }

    public void consumoGetJson(String url){
        System.out.println("Iniciando consumo");

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());


        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                List<Pokemon> listaPoke = new ArrayList<>();
                try {
                    List<Habilidades> habilidades = new ArrayList<>();
                    String peso = response.getString("heigth");
                    String altura = response.getString("weigth");
                    JSONArray abilitiesArray =  response.getJSONArray("abilities");
                    JSONArray results = response.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject abilityObj = abilitiesArray.getJSONObject(i);

                        JSONObject ability = abilityObj.getJSONObject("ability");

                        String name = ability.getString("name");

                        String url = ability.getString("url");

                        System.out.println("Nombre de la habilidad: " + name);
                        System.out.println("URL de la habilidad: " + url);
                        Habilidades habilidad = new Habilidades(name, url,peso,altura);
                        habilidades.add(habilidad);
                    }

                }catch (JSONException e){
                    throw new RuntimeException(e);

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });

        queue.add(solicitud);
    }
}