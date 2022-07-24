package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PrincipalController {
    @FXML
    private Label lblContacto;
    @FXML
    private Label lblSalir;
    @FXML
    private Label lblMenu;
    @FXML
    private Button btnAdmin;

    @FXML
    void lblMenuMouseClicked(MouseEvent event) {
        Main.setFXML("Menu-view","Menu");
    }
    @FXML
    void lblContactoMouseClicked(MouseEvent event) {
    }
    @FXML
    void lblSalirMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btnAdminMouseClicked(MouseEvent event) {
        Main.setFXML("Login-view","Administrador");
    }

}

