package com.example.counters;

public class Alumno {
    public Alumno(String nombre, String correo) {
        Nombre = nombre;
        this.correo = correo;
    }

    private String Nombre;

    private String correo;

    public String getNombre(){
        return Nombre;
    }

    public String getCorreo(){
        return correo;
    }
}
