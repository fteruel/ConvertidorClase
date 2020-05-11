package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Peso extends AppCompatActivity {

EditText entradaPesoET;
Float intermedioDE;
Float resultadoA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        entradaPesoET = findViewById(R.id.entradaPesoET);
    }



    public void convertirPeso(View view) {

        RadioGroup PesoDeRB = findViewById(R.id.PesoDeRB);
        int seleccionadoDEID = PesoDeRB.getCheckedRadioButtonId();

        RadioGroup PesoARB = findViewById(R.id.PesoARB);
        int seleccionadoAID = PesoARB.getCheckedRadioButtonId();


        String entradaPesoSTR = entradaPesoET.getText().toString();


        if(entradaPesoSTR.isEmpty()){
            Toast.makeText(this, "Ingresar valor", Toast.LENGTH_SHORT).show();
            return;
        }


        Float entradaPesoFLT = Float.parseFloat(entradaPesoSTR);


        switch(seleccionadoDEID) {
            case R.id.KGDE:
                 intermedioDE = entradaPesoFLT;
                 break;
            case R.id.GDE:
                intermedioDE = entradaPesoFLT / 1000;
                break;
            case R.id.LIBRADE:
                intermedioDE = entradaPesoFLT / 2.205f;
                break;
        }


        switch(seleccionadoAID) {
            case R.id.KGA:
                resultadoA = intermedioDE;
                break;
            case R.id.GA:
                resultadoA = intermedioDE * 1000;
                break;
            case R.id.LIBRAA:
                resultadoA = intermedioDE * 2.205f;
                break;
        }

        TextView resultadoPesoTV = findViewById(R.id.resultadoPesoTV);

        resultadoPesoTV.setText(resultadoA.toString());




    }
}
