package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pregunta9 extends AppCompatActivity {


    RadioGroup radioGroup;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    String respuesta4;
    String respuesta5;
    String respuesta6;
    String respuesta7;
    String respuesta8;
    Button pregunta9_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta9);
        pregunta9_btn = findViewById(R.id.respuesta9);
        Bundle datos = getIntent().getExtras();
        respuesta1 = datos.getString("opcion1");
        respuesta2 = datos.getString("opcion2");
        respuesta3 = datos.getString("opcion3");
        respuesta4 = datos.getString("opcion4");
        respuesta5 = datos.getString("opcion5");
        respuesta6 = datos.getString("opcion6");
        respuesta7 = datos.getString("opcion7");
        respuesta8 = datos.getString("opcion8");
        radioGroup = findViewById(R.id.respuesta_9);
    }
    public void Preguntaa9(View vista){

        Intent intencion = new Intent(getApplicationContext(),Pregunta10.class);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesta = findViewById(radioButtonId);
            String opcionSeleccionada = respuesta.getText().toString();
            intencion.putExtra("opcion1",this.respuesta1);
            intencion.putExtra("opcion2",this.respuesta2);
            intencion.putExtra("opcion3",this.respuesta3);
            intencion.putExtra("opcion4",this.respuesta4);
            intencion.putExtra("opcion5",this.respuesta5);
            intencion.putExtra("opcion6",this.respuesta6);
            intencion.putExtra("opcion7",this.respuesta7);
            intencion.putExtra("opcion8",this.respuesta8);
            intencion.putExtra("opcion9",opcionSeleccionada);

            startActivity(intencion);
            finish();

        }else{
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }

    }

}