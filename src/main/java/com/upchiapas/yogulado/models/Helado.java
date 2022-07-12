package com.upchiapas.yogulado.models;

import java.time.LocalDate;

public class Helado {
    private static int index = 0;
    protected int id;
    protected String sabor;
    protected double precio;

    public Helado(String sabor, double precio) {
        index++;
        this.id = index;
        this.sabor = sabor;
        this.precio = precio;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Helado.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
