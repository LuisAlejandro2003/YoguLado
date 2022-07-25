package com.upchiapas.yogulado.models;

import java.time.LocalDate;
import java.util.ArrayList;


public class Cliente {
    private static int index = 0;
    private int id;
    private String nombre;

    private LocalDate fecha;
    private ArrayList<Helado> listaHelados = new ArrayList<>();

    public Cliente(String nombre , ArrayList<Helado> listaHeladosTemporal , LocalDate fecha) {
        index++;
        this.id = index;
        this.nombre = nombre;

        for (Helado helado : listaHeladosTemporal){
            listaHelados.add(helado);
        }
        this.fecha=fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Helado> getHelado(){
        return listaHelados;
    }
}
