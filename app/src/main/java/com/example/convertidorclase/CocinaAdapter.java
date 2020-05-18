package com.example.convertidorclase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CocinaAdapter extends ArrayAdapter<MedidaCocina> {


    public CocinaAdapter(@NonNull Context context, @NonNull List<MedidaCocina> medidasCocina) {
        super(context, 0, medidasCocina);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View ItemLista = convertView;
        if(ItemLista == null)
            ItemLista = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.fila_cocina, parent, false);

        //busco la medida actual

        MedidaCocina medidaActual = getItem(position);

        //traigo los TextView de fila_cocina

        TextView NombreTV = ItemLista.findViewById(R.id.NombreUnidadTV);
        TextView medida1TV = ItemLista.findViewById(R.id.medida1TV);
        TextView medida2TV = ItemLista.findViewById(R.id.medida2TV);
        TextView medida3TV = ItemLista.findViewById(R.id.medida3TV);


        //cargo la instancia de fila_cocina con los datos correspondientes

        NombreTV .setText(medidaActual.getNombre());
        medida1TV.setText(medidaActual.getMedida1());
        medida2TV.setText(medidaActual.getMedida2());
        medida3TV.setText(medidaActual.getMedida3());


        return super.getView(position, convertView, parent);
    }
}
