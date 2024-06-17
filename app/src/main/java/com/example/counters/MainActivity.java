package com.example.counters;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

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


        String[] datoslista = new String[]{"CONSUEGRA GONZALEZ DONATO SEBASTIAN",
                "FRANCO ZAMORA JAIR ALEXANDER",
                "ORTEGA RIZZO ANGEL MATHIAS",
                "PALLO PINTO JENNYFER NAYELI",
                "VILLAO ZAMORA MARCOS ADRIAN"
                };

        ArrayAdapter<String> adaptador2 = new
                ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datoslista);


        ListView lstOpciones =
                (ListView)findViewById(R.id.listaAlumnos);
        lstOpciones.setAdapter(adaptador2);


    }
}