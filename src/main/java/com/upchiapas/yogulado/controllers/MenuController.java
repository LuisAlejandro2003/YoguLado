package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button btn_irCarrito;

   @FXML
    void irCarritoClicked(MouseEvent event) {
        Main.setFXML("Orden-view","Carrito");
    }
}
