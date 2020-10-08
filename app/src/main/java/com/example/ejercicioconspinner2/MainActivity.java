package com.example.ejercicioconspinner2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    static Integer[]  animales={
            0,
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.duck,
            R.drawable.fish,
            R.drawable.horse,
            R.drawable.parrot,
            R.drawable.pigeon,
            R.drawable.rabbit};
    static  String[] nombres={"ninguno","perro","pato","pez","caballo","loro","paloma","conejo"};

    Spinner sp1;
    Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1=(Spinner)findViewById(R.id.spinner);
        adaptador= new Adaptador(this,R.layout.spinner_view,nombres);
        sp1.setAdapter(adaptador);


    }
}