package com.umb.nietop.buscajuego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Formulario extends AppCompatActivity {

    EditText alias, juego, edad, horaDesde, horaHasta, mensaje;
    Spinner consola, genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        bindControles();
    }

    private void bindControles() {
        alias = findViewById(R.id.txtAlias);
        juego = findViewById(R.id.txtJuego);
        consola = findViewById(R.id.selConsola);
        genero = findViewById(R.id.selGenero);
        edad = findViewById(R.id.txtEdad);
        horaDesde = findViewById(R.id.txtHoraInicio);
        horaHasta = findViewById(R.id.txtHoraFinal);
        mensaje = findViewById(R.id.txtMensaje);
    }

    public void encontrarGrupo(View view) {
        DatosFormulario datos = extraerDatosFormulario();

        Intent verDatos = new Intent(this, Grupos.class);
        verDatos.putExtra("datos", datos);
        startActivity(verDatos);
    }

    private DatosFormulario extraerDatosFormulario() {
        DatosFormulario datos = new DatosFormulario()
                .conNombre(alias.getText().toString())
                .conJuego(juego.getText().toString())
                .conEdad(edad.getText().toString())
                .conHoraFinal(horaHasta.getText().toString())
                .conHoraInicio(horaDesde.getText().toString())
                .conMensaje(mensaje.getText().toString())
                .conConsola(consola.getSelectedItem().toString())
                .conGenero(genero.getSelectedItem().toString());

        return datos;

    }
}
