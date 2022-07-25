package com.upchiapas.yogulado.models;
import java.util.ArrayList;

public class ValidarUsuario {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public ValidarUsuario() {
        usuarios.add(new Usuario("Nancy Jimenez", "nancy", "1234"));
    }

    public boolean validarUsusario(String usuarioNombre, String contrasenia) {
        boolean bandera=false; Usuario usuario=encontrarUsuario(usuarioNombre);
        if (usuario!=null && usuario.getContrasenia().equals(contrasenia))
            bandera=true;
        return bandera;
    }
    private Usuario encontrarUsuario(String usuarioNombre) { //Recorre todos los elementos del arreglo y retorna el objeto
        Usuario usuario = null;
        int i = 0;
        boolean bandera = false;
        while (!bandera && i < usuarios.size()) {
            if (usuarios.get(i).getUsuarioNombre().equals(usuarioNombre)) {
                usuario = usuarios.get(i);
                bandera = true;
            }
            i++;
        }
        return usuario;
    }
}
