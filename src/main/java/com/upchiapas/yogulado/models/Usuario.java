package com.upchiapas.yogulado.models;

public class Usuario {
    private String nombre;
    private String usuarioNombre;
    private String contrasenia;

    public Usuario(String nombre, String usuarioNombre, String contrasenia) {
        this.nombre = nombre;
        this.usuarioNombre = usuarioNombre;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

}
