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

        List<MedidaCocina> listaCocina = new ArrayList<>();

        listaCocina.add(new MedidaCocina("Harina", "140g", "70g", "35g"));
        listaCocina.add(new MedidaCocina("Azucar", "200g", "100", "50g"));

        CocinaAdapter adaptador = new CocinaAdapter(getApplicationContext(), listaCocina);

        CocinaListaLV.setAdapter(adaptador);


    }
}
