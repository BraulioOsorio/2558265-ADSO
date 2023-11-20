package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Pregunta8 extends AppCompatActivity {


    RadioGroup radioGroup;
    ArrayList<String> opciones;
    ArrayList<String> actividades;
    Button pregunta8_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta8);
        pregunta8_btn = findViewById(R.id.respuesta8);
        opciones = getIntent().getStringArrayListExtra("opciones");
        actividades = getIntent().getStringArrayListExtra("actividades");
        radioGroup = findViewById(R.id.respuesta_8);
    }
    public void Preguntaa8(View vista){




        Intent intencion;
        if (actividades.isEmpty()) {
            intencion = new Intent(getApplicationContext(), Respuestas.class);
        } else {
            Collections.shuffle(actividades);

            String siguienteActividad = actividades.get(0);
            actividades.remove(siguienteActividad);
            intencion = new Intent(this, getClass(siguienteActividad));
        }
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesta = findViewById(radioButtonId);
            String opcionSeleccionada = respuesta.getText().toString();
            opciones.add(opcionSeleccionada);
            intencion.putStringArrayListExtra("actividades", actividades);
            intencion.putStringArrayListExtra("opciones", opciones);

            startActivity(intencion);
            finish();

        }else{
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }

    }
    private Class<?> getClass(String className) {
        try {
            return Class.forName("com.example.primeraplicacion." + className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}