package com.example.pokeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

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

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String siguiente;
    String anterior;
    Button pre;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        String baseUrl = "https://pokeapi.co/api/v2/pokemon";
        consumoGetJson(baseUrl);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consumoGetJson(siguiente);
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                consumoGetJson(anterior);
            }
        });


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
                    siguiente = response.getString("next");
                    anterior = response.getString("previous");
                    if(anterior.equalsIgnoreCase("null")){
                        pre.setEnabled(false);
                    }else{
                        pre.setEnabled(true);
                    }
                    if(siguiente.equalsIgnoreCase("null")){
                        next.setEnabled(false);
                    }else{
                        next.setEnabled(true);
                    }
                    JSONArray results = response.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject pokemon = results.getJSONObject(i);
                        String nombre = pokemon.getString("name");

                        String url = pokemon.getString("url");

                        String[] partesURL = url.split("/");
                        String ultimoNumero = partesURL[partesURL.length - 1];

                        int numero  = Integer.parseInt(ultimoNumero);

                        String ceros = (numero<10)?"000":(numero<100)?"00":(numero<1000)?"0":"";
                        String numeroCon = ceros+numero;

                        listaPoke.add(new Pokemon(numeroCon, nombre, url));

                    }
                    recyclerView = findViewById(R.id.recyclerPersonas);
                    recyclerView.setLayoutManager(new LinearLayoutManager((getApplicationContext())));

                    AdaptadorPokemon adaptador = new AdaptadorPokemon(listaPoke);
                    recyclerView.setAdapter(adaptador);
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