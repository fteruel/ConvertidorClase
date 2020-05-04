package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LanzarPeso(View view) {
        Intent lanzarPeso = new Intent(MainActivity.this, Peso.class);
        startActivity(lanzarPeso);
    }

    public void LanzarDistancia(View view) {
        Intent lanzarDistancia = new Intent(MainActivity.this, Distancia.class);
        startActivity(lanzarDistancia);
    }

    public void LanzarVolumen(View view) {
        Intent lanzarVolumen = new Intent(MainActivity.this, Volumen.class);
        startActivity(lanzarVolumen);
    }

    public void LanzarCocina(View view) {
        Intent lanzarCocina = new Intent(MainActivity.this, Cocina.class);
        startActivity(lanzarCocina);
    }

    public void LanzarTemperatura(View view) {
        Intent lanzarTemperatura = new Intent(MainActivity.this, Temperatura.class);
        startActivity(lanzarTemperatura);
    }

    public void LanzarPresion(View view) {
        Intent lanzarPresion = new Intent(MainActivity.this, Presion.class);
        startActivity(lanzarPresion);
    }
}

