package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


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

    public void seleccionadoDe(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        String entradaPesoSTR = entradaPesoET.getText().toString();
        Float entradaPesoFLT = Float.parseFloat(entradaPesoSTR);

        switch(view.getId()) {
            case R.id.KGDE:
                if (checked)
                    intermedioDE = entradaPesoFLT;
                    break;
            case R.id.GDE:
                if (checked)
                    intermedioDE = entradaPesoFLT / 1000;
                    break;
            case R.id.LIBRADE:
                if (checked)
                    intermedioDE = entradaPesoFLT / 2.205f;
                break;
        }




    }

    public void seleccionadoA(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.KGA:
                if (checked)
                    resultadoA = intermedioDE;
                break;
            case R.id.GA:
                if (checked)
                    resultadoA = intermedioDE * 1000;
                break;
            case R.id.LIBRAA:
                if (checked)
                    resultadoA = intermedioDE * 2.205f;
                break;
        }





    }

    public void convertirPeso(View view) {

        TextView resultadoPesoTV = findViewById(R.id.resultadoPesoTV);

        resultadoPesoTV.setText(resultadoA.toString());


    }
}
