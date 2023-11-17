package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Respuestas extends AppCompatActivity {



    String respuesta1;
    String respuesta2;
    String respuesta3;
    String respuesta4;
    String respuesta5;
    String respuesta6;
    String respuesta7;
    String respuesta8;
    String respuesta9;
    String respuesta10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        Bundle datos = getIntent().getExtras();
        respuesta1 = datos.getString("opcion1");
        respuesta2 = datos.getString("opcion2");
        respuesta3 = datos.getString("opcion3");
        respuesta4 = datos.getString("opcion4");
        respuesta5 = datos.getString("opcion5");
        respuesta6 = datos.getString("opcion6");
        respuesta7 = datos.getString("opcion7");
        respuesta8 = datos.getString("opcion8");
        respuesta9 = datos.getString("opcion9");
        respuesta10 = datos.getString("opcion10");
        for (int i = 1; i <= 10; i++) {
            TextView etiquetaResultado = findViewById(R.id.respuesta1);
            etiquetaResultado.setText(respuesta1);
        }


    }




}