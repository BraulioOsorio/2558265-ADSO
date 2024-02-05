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

public class Pregunta1 extends AppCompatActivity {


    Button btn_registrar;
    RadioGroup radioGroup;
    ArrayList<String> opciones = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        btn_registrar = findViewById(R.id.add);
        radioGroup = findViewById(R.id.respuesta);
    }
    public void registrarPersona(View vista){
        ArrayList<String> actividades = new ArrayList<>();
        actividades.add("Pregunta2");
        actividades.add("Pregunta3");
        actividades.add("Pregunta4");
        actividades.add("Pregunta5");
        actividades.add("Pregunta6");
        actividades.add("Pregunta7");
        actividades.add("Pregunta8");
        actividades.add("Pregunta9");
        actividades.add("Pregunta10");


        Collections.shuffle(actividades);

        String siguienteActividad = actividades.get(0);
        actividades.remove(siguienteActividad);
        Intent intencion = new Intent(this, getClass(siguienteActividad));


        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {

            RadioButton respuesata = findViewById(radioButtonId);
            String opcionSeleccionada = respuesata.getText().toString();
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