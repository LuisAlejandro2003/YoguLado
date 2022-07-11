package com.upchiapas.yogulado.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PrincipalController {

    @FXML
    private Label bInicio;

    @FXML
    private Label blContacto;

    @FXML
    private Label blMenu;

    @FXML
    private Label lblSalir;

    @FXML
    void lbMenuMouseClicked(MouseEvent event) {

    }

    @FXML
    void lblContactoMouseClicked(MouseEvent event) {

    }

    @FXML
    void lblInicioMouseClicked(MouseEvent event) {

    }

    @FXML
    void lblSalirMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}

