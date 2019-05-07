package com.umb.nietop.buscajuego;

import java.io.Serializable;

public class DatosFormulario implements Serializable {

    private String nombre;
    private String juego;
    private String genero;
    private String edad;
    private String horaInicio;
    private String horaFinal;
    private String mensaje;
    private String consola;

    public String getNombre() {
        return nombre;
    }

    public DatosFormulario conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getJuego() {
        return juego;
    }

    public DatosFormulario conJuego(String juego) {
        this.juego = juego;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public DatosFormulario conGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public String getEdad() {
        return edad;
    }

    public DatosFormulario conEdad(String edad) {
        this.edad = edad;
        return this;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public DatosFormulario conHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
        return this;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public DatosFormulario conHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
        return this;
    }

    public String getMensaje() {
        return mensaje;
    }

    public DatosFormulario conMensaje(String mensaje) {
        this.mensaje = mensaje;
        return this;
    }

    public DatosFormulario conConsola(String consola) {
        this.consola = consola;
        return this;
    }

    public String getConsola() {
        return this.consola;
    }

}
