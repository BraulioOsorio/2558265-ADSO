package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pregunta3 extends AppCompatActivity {


    RadioGroup radioGroup;
    String respuesta1;
    String respuesta2;
    Button pregunta3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        pregunta3_btn = findViewById(R.id.respuesta3);
        Bundle datos =getIntent().getExtras();
        respuesta1 = datos.getString("opcion1");
        respuesta2 = datos.getString("opcion2");
        radioGroup = findViewById(R.id.respuesta_3);
    }
    public void Preguntaa3(View vista){

        Intent intencion = new Intent(getApplicationContext(),Pregunta4.class);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesta = findViewById(radioButtonId);
            String opcionSeleccionada = respuesta.getText().toString();
            System.out.println(respuesta1);
            System.out.println(respuesta2);
            System.out.println(opcionSeleccionada);
            intencion.putExtra("opcion1",this.respuesta1);
            intencion.putExtra("opcion2",this.respuesta2);
            intencion.putExtra("opcion3",opcionSeleccionada);

            startActivity(intencion);
            finish();

        }else{
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }

    }

}