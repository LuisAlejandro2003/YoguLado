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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
