package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

public class Presion extends AppCompatActivity {

    Spinner PresionDeSP;
    Spinner PresionASP;
    Float intermedioFLT;
    Float resultadoFLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presion);


        //Creo lista de unidades de presion a usar
        List<String> unidadesDePresion = new ArrayList<String>();

        unidadesDePresion.add("Pascal");
        unidadesDePresion.add("Bar");
        unidadesDePresion.add("KiloPascal");
        unidadesDePresion.add("MegaPascal");
        unidadesDePresion.add("PSI");
        unidadesDePresion.add("Kg/cm²");
        unidadesDePresion.add("inHg");
        unidadesDePresion.add("ATM");


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),
                                                    android.R.layout.simple_spinner_dropdown_item,
                                                    unidadesDePresion);

        PresionDeSP = findViewById(R.id.PresionDeSP);
        PresionASP = findViewById(R.id.PresionASP);

        PresionDeSP.setAdapter(adaptador);
        PresionASP.setAdapter(adaptador);

    }

    public void convertirPresion(View view) {

        String seleccionadoDe = PresionDeSP.getSelectedItem().toString();
        String seleccionadoA = PresionASP.getSelectedItem().toString();

        if(seleccionadoA.isEmpty() || seleccionadoDe.isEmpty()){
            Toast.makeText(getApplicationContext(), "Por favor seleccionar Medidas", Toast.LENGTH_LONG).show();
            return;
        }



        switch (seleccionadoDe){
            case ("Pascal"):
                intermedioFLT = 2f;

        }






    }
}
