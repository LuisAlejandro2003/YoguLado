package com.upchiapas.yogulado.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private static int index = 0;
    private int id;
    private String nombre;
    private ArrayList<Helado> listaHelados = new ArrayList<>();

    public Cliente(String nombre) {
        index++;
        this.id = index;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean addHelado(Helado helado){
        return listaHelados.add(helado);
    }

    public Helado getFirstHelado(){
        Helado helado = null;
        if (!listaHelados.isEmpty())
            helado = listaHelados   .get(0);
        return helado;
    }
    public ArrayList<Helado> getPets(){
        return listaHelados;
    }
}
