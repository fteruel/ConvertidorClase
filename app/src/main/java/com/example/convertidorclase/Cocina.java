package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Cocina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocina);

        ListView CocinaListaLV = findViewById(R.id.CocinaListaLV);

        List<String> listaCocina = new ArrayList<String>();

        listaCocina.add("azucar");
        listaCocina.add("harina");

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),
                                                                R.layout.fila_cocina, R.id.tituloFila,
                                                                listaCocina);
        CocinaListaLV.setAdapter(adaptador);


    }
}
