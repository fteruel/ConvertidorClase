package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.nio.channels.FileLock;

public class Presion extends AppCompatActivity {

    EditText unidadPresion;
    TextView resultadoPresion;
    Float convertidoA;
    Float resultadoFLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presion);

        unidadPresion = findViewById(R.id.unidadPresion);
        resultadoPresion = findViewById(R.id.resultadoPresion);
    }

    public void ConvertirDe(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        String unidadSTR = unidadPresion.getText().toString();
        Float unidadFLT = Float.parseFloat(unidadSTR);


        switch(view.getId()) {
            case R.id.kgDe:
                if (checked)
                    convertidoA = unidadFLT;

                    break;
            case R.id.GDe:
                if (checked)
                    convertidoA = unidadFLT*1000;
                    break;
        }


    }

    public void ConvertirA(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        String unidadSTR = unidadPresion.getText().toString();
        Float unidadFLT = Float.parseFloat(unidadSTR);


        switch(view.getId()) {
            case R.id.KgA:
                if (checked)
                    resultadoFLT = unidadFLT;

                break;
            case R.id.GA:
                if (checked)
                    resultadoFLT = unidadFLT/1000;
                break;
        }




    }


    public void mostrarResultado(View view) {

        resultadoPresion.setText(resultadoFLT.toString());
    }
}
