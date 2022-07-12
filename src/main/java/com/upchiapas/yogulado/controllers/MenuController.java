package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class MenuController {
    ArrayList<Helado> listaHelado = new ArrayList<>();
    @FXML
    private Button btn_irCarrito;
    @FXML
    private TextArea txt_AreaImpresion;

   @FXML
    void irCarritoClicked(MouseEvent event) {
        Main.setFXML("Orden-view","Carrito");
    }

    @FXML
    void lbl_agregarOreo(MouseEvent event) {
        /*
        listaHelado.add(new Helado("Oreo", 80));
        txt_AreaImpresion.setText("");
        for (Helado helado:listaHelado) {
            txt_AreaImpresion.appendText(String.valueOf(helado.getSabor()) +""+ helado.getPrecio()+"\n");
        }*/
    }
}
