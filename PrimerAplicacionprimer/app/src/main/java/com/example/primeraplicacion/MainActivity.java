package com.example.primeraplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btn_registrar;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_registrar = findViewById(R.id.add);
        radioGroup = findViewById(R.id.respuesta);
    }
    public void registrarPersona(View vista){

        Intent intencion = new Intent(getApplicationContext(),SegundaActividad.class);
        int radioButtonId = radioGroup.getCheckedRadioButtonId();

        if (radioButtonId != -1) {
            RadioButton respuesata = findViewById(radioButtonId);
            String opcionSeleccionada = respuesata.getText().toString();
            System.out.println("Opcion:" +opcionSeleccionada);
            intencion.putExtra("opcion1",opcionSeleccionada);
            startActivity(intencion);
            finish();

        }else{
            TextView alerta = findViewById(R.id.alerta);
            alerta.setText("Debe seleccionar una de las opciones para continuar ");
        }

    }

}