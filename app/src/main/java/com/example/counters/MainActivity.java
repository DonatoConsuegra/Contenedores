package com.example.counters;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String[] datos = new String[]{"Primero",
                "Segundo",
                "Tercero",
                "Cuarto", "Quinto", "Sexto", "Séptimo", "Octavo", "Noveno", "Décimo"};
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, datos);

        AutoCompleteTextView textView =
                findViewById(R.id.ListaCursos);
        textView.setAdapter(adapter);

        /*
        //String[] datoslista = new String[]{"CONSUEGRA GONZALEZ DONATO SEBASTIAN",
       //         "FRANCO ZAMORA JAIR ALEXANDER",
        //        "ORTEGA RIZZO ANGEL MATHIAS",
         //       "PALLO PINTO JENNYFER NAYELI",
         //       "VILLAO ZAMORA MARCOS ADRIAN"
          //      };

        ArrayAdapter<String> adaptador2 = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datoslista);
        */

        Alumno[] alumnos=
                new Alumno[]{
                        new Alumno("Banchon Carolay Damars","carolay@uteq,edu.ec"),
                        new Alumno("Donato Consuegra González", "dconsuegrag2@uteq.edu.ec"),
                        new Alumno("Banchon Carolay Damars","carolay@uteq,edu.ec"),
                        new Alumno("Donato Consuegra González", "dconsuegrag2@uteq.edu.ec"),
                        new Alumno("Banchon Carolay Damars","carolay@uteq,edu.ec"),
                        new Alumno("Donato Consuegra González", "dconsuegrag2@uteq.edu.ec")
                };

        AdaptadorAlumnos adaptadorAlumnos
                =new AdaptadorAlumnos(this,alumnos);

        ListView lstOpciones =
                (ListView)findViewById(R.id.listaAlumnos);
        lstOpciones.setAdapter(adaptadorAlumnos);
        lstOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Toast.makeText(getApplicationContext(), "Alumno Seleccionado" +
                                adapterView.getItemAtPosition(pos).toString()
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}