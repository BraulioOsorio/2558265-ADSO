package com.example.pokeapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;
import java.util.List;

public class AdaptadorImagenes extends RecyclerView.Adapter<AdaptadorImagenes.ViewHolder> {
    List<Habilidades> listahabilidades;
    private Instant Glide;

    public AdaptadorImagenes(List<Habilidades> listahabilidades) {
        this.listahabilidades = listahabilidades;
    }


    @NonNull
    @Override
    public AdaptadorImagenes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidades,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagenes.ViewHolder holder, int position) {
        Habilidades temporal = listahabilidades.get(position);
        //holder.cargarPokemones(temporal);
    }

    @Override
    public int getItemCount() {
        return listahabilidades.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView etqNumeroPokemon;
        TextView etqNombre;
        ImageView btnPropiedades;

        Context contexto;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            etqNombre = itemView.findViewById(R.id.etqNombre);
            etqNumeroPokemon = itemView.findViewById(R.id.etqNumeroPokemon);
            btnPropiedades = itemView.findViewById(R.id.btnPropiedades);
            contexto = itemView.getContext();


        }


    }
}
