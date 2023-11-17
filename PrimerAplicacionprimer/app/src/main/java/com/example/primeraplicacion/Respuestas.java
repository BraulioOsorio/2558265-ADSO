package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Respuestas extends AppCompatActivity {

    String[] respuestas = new String[10];
    String[] respuestasCorrectas = {"No","1776","Amazonas","Oxígeno","África","Tokio","Gabriel García","8","Vincent van Gogh","1917"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);
        Intent intent = getIntent();
        for (int i = 1; i <= 10; i++) {
            respuestas[i - 1] = intent.getStringExtra("opcion" + i);
        }
        int puntaje = 0;
        for (int i = 1; i <= 10; i++) {
            int idTextView = getResources().getIdentifier("respuesta" + i, "id", getPackageName());


            if (idTextView != 0) {
                TextView etiquetaResultado = findViewById(idTextView);
                String respuesta = respuestas[i - 1];
                String soluciones= respuestasCorrectas[i - 1];
                if(respuesta.equals(soluciones)){
                    //"\n"
                    puntaje = puntaje + 1;
                    etiquetaResultado.setText("Pregunta "+i+": "+respuesta+". \n La respuesta es correcta\n ");
                }else{
                    etiquetaResultado.setText("Pregunta "+i+": "+respuesta+". \n La respuesta es incorrecta \n");
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
