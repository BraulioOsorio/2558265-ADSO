package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {


    RadioGroup radioGroup;
    String respuesta1;
    Button pregunta2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        pregunta2_btn = findViewById(R.id.respuesta2);
        Bundle datos =getIntent().getExtras();
        respuesta1 = datos.getString("opcion1");
        radioGroup = findViewById(R.id.respuesta_2);
    }
    public void Pregunta2(View vista){

        Intent intencion = new Intent(getApplicationContext(),Pregunta3.class);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesta = findViewById(radioButtonId);
            String opcionSeleccionada = respuesta.getText().toString();

            intencion.putExtra("opcion1",this.respuesta1);
            intencion.putExtra("opcion2",opcionSeleccionada);

            startActivity(intencion);
            finish();

        }else{
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }

    }

}