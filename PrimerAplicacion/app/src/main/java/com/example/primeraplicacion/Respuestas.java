package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Respuestas extends AppCompatActivity {

    String[] respuestas = new String[10];
    String[] respuestasCorrectas = {"No","1776","Amazonas","Oxígeno","África","Tokio","Gabriel García","8","Vincent van Gogh","1917"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);
        ArrayList<String> opciones = getIntent().getStringArrayListExtra("opciones");

        for (int i = 0; i < opciones.size(); i++) {
            if (i < respuestas.length) {

                respuestas[i] = opciones.get(i);
            }
        }
        int puntaje = 0;
        for (int i = 1; i <= 10; i++) {
            int idTextView = getResources().getIdentifier("respuesta" + i, "id", getPackageName());


            if (idTextView != 0) {
                TextView etiquetaResultado = findViewById(idTextView);
                String respuesta = respuestas[i - 1];

                for(int f = 1; f <= 10; f++){
                    String soluciones = respuestasCorrectas[f - 1];
                    if(respuesta.equals(soluciones)){
                        //"\n"
                        puntaje = puntaje + 1;
                        etiquetaResultado.setText("Pregunta "+i+": "+respuesta+". \n La respuesta es correcta\n ");

                    }else{
                        etiquetaResultado.setText("Pregunta "+i+": "+respuesta+". \n La respuesta es incorrecta \n");
                    }
                }



            }
        }
        TextView puntajes = findViewById(R.id.puntaje);
        if (puntaje >= 5){
            puntajes.setText("Usted gano con un puntaje de: "+puntaje);
        }else if(puntaje < 5){
            puntajes.setText("Usted perdio con un puntaje de: "+puntaje);
        }
    }
}
