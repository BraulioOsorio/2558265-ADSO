package com.example.pokeapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Instant;
import java.util.List;

public class  AdaptadorHabilidades extends RecyclerView.Adapter<AdaptadorHabilidades.ViewHolder> {
    Habilidades habilidades;
    private Instant Glide;

    public AdaptadorHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }


    @NonNull

    public AdaptadorHabilidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidades,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Habilidades temporal = habilidades;
        holder.cargarHabilidades(temporal);
    }




    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView etqAltura;
        TextView etqPeso;
        LinearLayout containerHabilidades;

        Context contexto;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            etqAltura = itemView.findViewById(R.id.etqAltura);
            etqPeso = itemView.findViewById(R.id.etqPeso);
            containerHabilidades = itemView.findViewById(R.id.containerHabilidades);
            contexto = itemView.getContext();


        }
        public void cargarHabilidades(Habilidades temporal) {
            etqPeso.setText(temporal.getAltura());
            etqAltura.setText(temporal.getPeso());

            List<String> nombresHabilidades = temporal.getNombresHabilidades();
            LinearLayout containerHabilidades = itemView.findViewById(R.id.containerHabilidades);
            containerHabilidades.removeAllViews();

            for (String habilidad : nombresHabilidades) {

                TextView textView = new TextView(contexto);
                textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                textView.setText(habilidad);
                textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
                textView.setTextColor(Color.BLACK);
                textView.setPadding(50, 0, 0, 0);
                containerHabilidades.addView(textView);

                View separator = new View(contexto);
                separator.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 3));
                separator.setBackgroundColor(Color.BLACK);
                containerHabilidades.addView(separator);
            }
        }




    }
}
