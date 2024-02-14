package com.example.pokeapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DetallePokemon extends AppCompatActivity {
    TextView etqNombre;
    String urlBase;
    RecyclerView recyclerView;
    ImageView loadingImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);
        etqNombre = findViewById(R.id.nombreP);
        loadingImageView = findViewById(R.id.loadingImageView);

        Bundle datos = getIntent().getExtras();
        String nombreM = datos.getString("nombre").toUpperCase();
        urlBase = datos.getString("url");

        etqNombre.setText(nombreM);
        consumoGetJson(urlBase);
    }

    public void consumoGetJson(String url) {
        System.out.println("Iniciando consumo");

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        JsonObjectRequest solicitud = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                try {
                    String peso = response.getString("height");
                    String altura = response.getString("weight");
                    JSONArray abilitiesArray = response.getJSONArray("abilities");
                    List<String> nombreHabilidades = new ArrayList<>();

                    for (int i = 0; i < abilitiesArray.length(); i++) {
                        JSONObject abilityObj = abilitiesArray.getJSONObject(i);
                        JSONObject ability = abilityObj.getJSONObject("ability");
                        String name = ability.getString("name");
                        nombreHabilidades.add(name);
                    }
                    sacarImagenes(response);
                    Habilidades habilidades = new Habilidades(nombreHabilidades, peso, altura);
                    loadingImageView.setVisibility(View.VISIBLE);

                    Glide.with(DetallePokemon.this)
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
                                    recyclerView = findViewById(R.id.recyclerhabilidades);
                                    recyclerView.setLayoutManager(new LinearLayoutManager((getApplicationContext())));

                                    AdaptadorHabilidades adaptador = new AdaptadorHabilidades(habilidades);
                                    recyclerView.setAdapter(adaptador);


                                    loadingImageView.setVisibility(View.GONE);
                                }
                            },
                            500
                    );


                } catch (JSONException e) {
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
    public void sacarImagenes(JSONObject response) throws JSONException {
        JSONObject spritesObject = response.getJSONObject("sprites");
        String[] datos = {
                "back_default",
                "back_female",
                "back_shiny",
                "back_shiny_female",
                "front_default",
                "front_female",
                "front_shiny",
                "front_shiny_female"
        };

        List<String> imagenes = new ArrayList<>();

        for (String dato : datos) {
            String url = spritesObject.optString(dato, null);
            if (url != null && !url.equalsIgnoreCase("null") && !url.endsWith(".gif") && !url.endsWith(".svg")) {
                imagenes.add(url);

            }
        }

        JSONObject otherObject = spritesObject.optJSONObject("other");

        if (otherObject != null) {
            Iterator<String> otherKeys = otherObject.keys();
            while (otherKeys.hasNext()) {
                String key = otherKeys.next();
                JSONObject innerObject = otherObject.optJSONObject(key);

                if (innerObject != null) {
                    Iterator<String> innerKeys = innerObject.keys();
                    while (innerKeys.hasNext()) {
                        String innerKey = innerKeys.next();
                        String url = innerObject.optString(innerKey, null);

                        if (url != null && !url.equalsIgnoreCase("null") && !url.endsWith(".svg")) {
                            imagenes.add(url);
                        }
                    }
                } else {
                    String url = otherObject.optString(key, null);
                    if (url != null && !url.equalsIgnoreCase("null") && !url.endsWith(".gif") && !url.endsWith(".svg")) {
                        imagenes.add(url);
                    }
                }
            }
        }
        Collections.shuffle(imagenes);




        recyclerView = findViewById(R.id.recyclerFotos);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        AdaptadorImagenes adaptador = new AdaptadorImagenes(imagenes);
        recyclerView.setAdapter(adaptador);

    }

}