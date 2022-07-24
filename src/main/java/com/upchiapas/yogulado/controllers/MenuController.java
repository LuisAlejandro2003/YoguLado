package com.upchiapas.yogulado.controllers;
import com.upchiapas.yogulado.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button btnIrCarrito;

    @FXML
    void irCarritoMouseClicked(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Orden-view.fxml"));
        Parent root = null;
        try {
            root =loader.load();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        OrdenController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

}


