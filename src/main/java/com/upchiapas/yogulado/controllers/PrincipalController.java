package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {

    @FXML
    private Label lblContacto;

    @FXML
    private Label lblInicio;

    @FXML
    private Label lblMenu;

    @FXML
    private Label lblSalir;

    @FXML
    void lblInicioMouse(MouseEvent event) {

    }

    @FXML
    void lblMenuMouseClicked(MouseEvent event) {
        FXMLLoader loader=new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        MenuController controladores=loader.getController();
        Parent root=null;
        try {
                root=loader.load();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        Scene scene=new Scene(root);
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void lblSalirMouseCliked(MouseEvent event) {
        System.exit(1);
    }

}
