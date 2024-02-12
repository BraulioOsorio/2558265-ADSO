package com.example.pokeapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.time.Instant;
import java.util.List;
import android.widget.ImageView;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder> {

    List<Pokemon> listaPokemon;
    private Instant Glide;

    public AdaptadorPokemon(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }


    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPokemon.ViewHolder holder, int position) {
        Pokemon temporal = listaPokemon.get(position);
        holder.cargarPokemones(temporal);
    }

    @Override
    public int getItemCount() {
        return listaPokemon.size();
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

        public void cargarPokemones(Pokemon poketemp){
            String nombreM = poketemp.getNombre().toUpperCase();
            etqNombre.setText(nombreM);

            etqNumeroPokemon.setText(poketemp.getNumero());


            btnPropiedades.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String nombre = poketemp.getNombre();
                    String url = poketemp.getUrl();

                    Intent intencion = new Intent(contexto,DetallePokemon.class);
                    intencion.putExtra("nombre",nombre);
                    intencion.putExtra("url",url);


                    contexto.startActivity(intencion);
                }
            });
        }
    }
}
