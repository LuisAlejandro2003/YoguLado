package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ContactoController {

    @FXML
    private Button btnInicio;

    @FXML
    void btnInicioMouseClicked(MouseEvent event) {
        Main.setFXML("Principal-view","Menu");
    }

    public void lblMenuMouseClicked(MouseEvent mouseEvent) {
    }
}
