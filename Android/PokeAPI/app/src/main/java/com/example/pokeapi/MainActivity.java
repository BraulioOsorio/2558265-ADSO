package com.example.pokeapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
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
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

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
    ImageView loadingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        loadingImageView = findViewById(R.id.loadingImageView);
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
                List<Pokemon> listaPoke = new ArrayList<>();
                try {
                    siguiente = response.getString("next");
                    anterior = response.getString("previous");
                    if(anterior.equalsIgnoreCase("null")){
                        pre.setEnabled(false);
                        pre.setTextColor(Color.WHITE);
                        pre.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                    }else{
                        pre.setEnabled(true);
                        pre.setTextColor(Color.WHITE);
                        pre.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));

                        Uri uri = Uri.parse(anterior);
                        String offset = uri.getQueryParameter("offset");
                        String limit = uri.getQueryParameter("limit");

                        int offsetInt = Integer.parseInt(offset);
                        int limitInt = Integer.parseInt(limit);

                        if(limitInt == 2){
                            offsetInt -= 18;
                            limitInt = 20;
                            System.out.println("Url dañada "+anterior);

                            anterior = "https://pokeapi.co/api/v2/pokemon?offset=" + offsetInt + "&limit=" + limitInt;
                            System.out.println("Url nueva "+anterior);
                        }


                    }
                    if(siguiente.equalsIgnoreCase("null")){
                        next.setEnabled(false);
                        next.setTextColor(Color.WHITE);
                        next.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                    }else{
                        next.setEnabled(true);
                        next.setTextColor(Color.WHITE);
                        next.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));

                    }
                    JSONArray results = response.getJSONArray("results");

                    for (int i = 0; i < results.length(); i++) {
                        JSONObject pokemon = results.getJSONObject(i);
                        String nombre = pokemon.getString("name");

                        String url = pokemon.getString("url");

                        String[] partesURL = url.split("/");
                        String ultimoNumero = partesURL[partesURL.length - 1];

                        int numero  = Integer.parseInt(ultimoNumero);
                        if (numero > 10000){
                            numero = numero - 8975;
                        }

                        String ceros = (numero<10)?"000":(numero<100)?"00":(numero<1000)?"0":"";
                        String numeroCon = ceros+numero;

                        listaPoke.add(new Pokemon(numeroCon, nombre, url));

                    }
                    loadingImageView.setVisibility(View.VISIBLE);

                    Glide.with(MainActivity.this)
                            .asGif()
                            .load(R.drawable.loading_pokeball)
                            .into(new SimpleTarget<GifDrawable>() {
                                @Override
                                public void onResourceReady(@NonNull GifDrawable resource, @Nullable Transition<? super GifDrawable> transition) {

                                    loadingImageView.setImageDrawable(resource);

                                    resource.start();
                                }
                            });

                    new android.os.Handler().postDelayed(
                            new Runnable() {
                                public void run() {
                                    recyclerView = findViewById(R.id.recyclerPersonas);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

                                    AdaptadorPokemon adaptador = new AdaptadorPokemon(listaPoke);
                                    recyclerView.setAdapter(adaptador);


                                    loadingImageView.setVisibility(View.GONE);
                                }
                            },
                            500
                    );
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