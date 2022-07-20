package com.upchiapas.yogulado.models;

import java.util.ArrayList;


public class Cliente {
    private static int index = 0;
    private int id;
    private String nombre;
    private ArrayList<Helado> listaHelados = new ArrayList<>();

    public Cliente(String nombre , ArrayList<Helado> listaHeladosTemporal) {
        index++;
        this.id = index;
        this.nombre = nombre;
        for (Helado helado : listaHeladosTemporal){
            listaHelados.add(helado);
        }
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

    public ArrayList<Helado> getHelado(){
        return listaHelados;
    }
}
