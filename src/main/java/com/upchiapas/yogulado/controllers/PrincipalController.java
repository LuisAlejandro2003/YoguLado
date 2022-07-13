package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class PrincipalController {

    @FXML
    private Label bInicio;

    @FXML
    private Label blContacto;

    @FXML
    private Label lblSalir;

    @FXML
    private Label lbl_menu;
    @FXML
    private Button btn_admin;

    @FXML
    void lblContactoMouseClicked(MouseEvent event) {

    }

    @FXML
    void lblInicioMouseClicked(MouseEvent event) {

    }

    @FXML
    void lblSalirMouseClicked(MouseEvent event) {

    }

    @FXML
    void lbl_irMenuClicked(MouseEvent event) {
        Main.setFXML("Menu","Menu");
    }
    @FXML
    void btn_irAdmin(MouseEvent event) {
        Main.setFXML("admin-view","Administrador");
    }

}
