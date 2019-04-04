package com.example.autocompletetextviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mostrarDato;
    private AutoCompleteTextView colorAutoComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mostrarDato = findViewById(R.id.txtCapturaDato);
            colorAutoComplete = findViewById(R.id.autCompleteColores);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.
                createFromResource(this, R.array.colores,
                        android.R.layout.simple_list_item_1);

        colorAutoComplete.setAdapter(adaptador);

        colorAutoComplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mostrarDato.setText("Tu color favorito es el "+parent.getItemAtPosition(position).toString());
            }
        });
    }
}
