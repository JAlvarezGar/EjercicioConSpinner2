package com.example.ejercicioconspinner2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.example.ejercicioconspinner2.MainActivity.animales;
import static com.example.ejercicioconspinner2.MainActivity.nombres;

public class Adaptador extends ArrayAdapter<String> {

    static LayoutInflater inflater;

    public Adaptador(@NonNull Context context, int resource, @NonNull String[] objects) {
        super(context, resource, objects);
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return crearFilaPersonalizada(position, convertView, parent);
    }



    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return crearFilaPersonalizada(position, convertView, parent);
    }

    private static View crearFilaPersonalizada(int position, View convertView, ViewGroup parent) {

        View vista= inflater.inflate(R.layout.spinner_view,parent,false);
        TextView tv1= (TextView)vista.findViewById(R.id.descripcion);
        ImageView img1= (ImageView)vista.findViewById(R.id.imagen);
        tv1.setText(nombres[position]);
        img1.setImageResource(animales[position]);
        return vista;

    }
}
