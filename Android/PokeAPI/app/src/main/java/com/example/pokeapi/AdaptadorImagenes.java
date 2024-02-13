package com.example.pokeapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;

import java.util.List;

public class AdaptadorImagenes extends RecyclerView.Adapter<AdaptadorImagenes.ViewHolder> {
    List<String> imagenes;
    Context mContext;

    public AdaptadorImagenes(List<String> imagenes) {
        this.imagenes = imagenes;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String url = imagenes.get(position);
        holder.consumoImagen(url);
    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPokemon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPokemon = itemView.findViewById(R.id.imgPokemon);
            mContext = itemView.getContext();
        }

        public void consumoImagen(String url){
            RequestQueue queue = Volley.newRequestQueue(mContext.getApplicationContext());
            if(url.endsWith(".gif")){
                Glide.with(mContext)
                .asGif()
                .load(url)
                .into(new ImageViewTarget<GifDrawable>(imgPokemon) {
                    @Override
                    protected void setResource(GifDrawable resource) {
                        if (resource != null){
                            imgPokemon.setImageDrawable(resource);
                            resource.start(); // Inicia la animación del GIF
                        }else{
                            System.out.println("resource es nulo");
                        }
                    }
                });
            }else{
                ImageRequest solicitud = new ImageRequest(
                        url,
                        new Response.Listener<Bitmap>() {
                            @Override
                            public void onResponse(Bitmap bitmap) {
                                // Set the image in the ImageView.
                                imgPokemon.setImageBitmap(bitmap);

                            }
                        },
                        0, 0, null, // maxWidth, maxHeight, decodeConfig;
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                // Handle the error.
                            }
                        });

                queue.add(solicitud);

            }
        }
    }
}



