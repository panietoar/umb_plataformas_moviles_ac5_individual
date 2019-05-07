package com.umb.nietop.buscajuego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Grupos extends AppCompatActivity {

    TextView alias, juego, consola, edad, genero, horaDesde, horaHasta, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupos);
        bindControles();

        Intent verDatos = getIntent();
        DatosFormulario datos = (DatosFormulario) verDatos.getSerializableExtra("datos");

        ponerDatos(datos);

    }

    private void bindControles() {
        alias = findViewById(R.id.lblAlias);
        juego = findViewById(R.id.lblJuego);
        consola = findViewById(R.id.lblConsola);
        genero = findViewById(R.id.lblGenero);
        horaDesde = findViewById(R.id.lblDesde);
        horaHasta = findViewById(R.id.lblHasta);
        mensaje = findViewById(R.id.lblMensaje);
    }

    private void ponerDatos(DatosFormulario datos) {
        alias.setText(datos.getNombre());
        juego.setText(datos.getJuego());
        consola.setText(datos.getConsola());
        genero.setText(datos.getGenero());
        horaDesde.setText(datos.getHoraInicio());
        horaHasta.setText(datos.getHoraFinal());
        mensaje.setText(datos.getMensaje());
    }
}