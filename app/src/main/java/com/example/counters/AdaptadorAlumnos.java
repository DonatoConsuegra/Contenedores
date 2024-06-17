package com.example.counters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class AdaptadorAlumnos extends ArrayAdapter<Alumno> {
        public AdaptadorAlumnos(Context context, Alumno[] datos) {
            super(context, R.layout.personalizado, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.personalizado, null);

            TextView txtNombre = (TextView)item.findViewById(R.id.LblNombre);
            txtNombre.setText(getItem(position).getNombre());

            TextView txtCorreo = (TextView)item.findViewById(R.id.LblEmail);
            txtCorreo.setText(getItem(position).getCorreo());

            return(item);
        }

}
