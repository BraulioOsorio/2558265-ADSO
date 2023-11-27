package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Respuestas extends AppCompatActivity {

    String[] respuestas = new String[10];
    String[] respuestasCorrectas = {"No","1776","Amazonas","OxIgeno","Africa","Tokio","Gabriel García Marquez","8","Vincent van Gogh","1917"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);
        ArrayList<String> opciones = getIntent().getStringArrayListExtra("opciones");

        for (int i = 0; i < opciones.size() && i < respuestas.length; i++) {
            respuestas[i] = opciones.get(i);
        }

        int puntaje = 0;

        for (int i = 0; i < respuestas.length; i++) {
            boolean correcta = false;

            if (respuestas[i] != null) {
                String respuesta = respuestas[i];

                for (int f = 0; f < respuestasCorrectas.length; f++) {
                    String solucion = respuestasCorrectas[f];

                    if (respuesta.equals(solucion)) {
                        correcta = true;
                        break;
                    }
                }

                TextView etiquetaResultado = findViewById(getResources().getIdentifier("respuesta" + (i + 1), "id", getPackageName()));

                if (etiquetaResultado != null) {
                    if (correcta) {
                        puntaje = puntaje + 1;
                        etiquetaResultado.setText("Pregunta " + (i + 1) + ": " + respuesta + ". \n La respuesta es correcta\n ");
                    } else {
                        etiquetaResultado.setText("Pregunta " + (i + 1) + ": " + respuesta + ". \n La respuesta es incorrecta \n");
                    }
                }
            }
        }

        TextView puntajes = findViewById(R.id.puntaje);

        if (puntaje >= 5) {
            puntajes.setText("Usted ganó con un puntaje de: " + puntaje);
        } else {
            puntajes.setText("Usted perdió con un puntaje de: " + puntaje);
        }
    }

}
