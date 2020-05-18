package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< Updated upstream
=======
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
>>>>>>> Stashed changes

public class Cocina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocina);
<<<<<<< Updated upstream
=======

        ListView CocinaListaLV = findViewById(R.id.CocinaListaLV);

        View headerDeLista = LayoutInflater
                .from(getApplicationContext())
                .inflate(R.layout.fila_cocina,CocinaListaLV,false);

        TextView medida1 = headerDeLista.findViewById(R.id.medida1TV);
        TextView medida2 = headerDeLista.findViewById(R.id.medida2TV);
        TextView medida3 = headerDeLista.findViewById(R.id.medida3TV);

        medida1.setText("1 TAZA");
        medida2.setText("1/2 TAZA");
        medida3.setText("1/4 TAZA");


        CocinaListaLV.addHeaderView(headerDeLista);

        List<MedidaCocina> listaMedidasCocina = new ArrayList<>();



        listaMedidasCocina.add(new MedidaCocina(getText(R.string.flour).toString(), "120g", "60g", "30g"));
        listaMedidasCocina.add(new MedidaCocina("Azucar", "120g", "60g", "30g"));




        CocinaAdapter adaptadorDeListaCocina = new CocinaAdapter(getApplicationContext(), listaMedidasCocina);

        CocinaListaLV.setAdapter(adaptadorDeListaCocina);



>>>>>>> Stashed changes
    }
}
