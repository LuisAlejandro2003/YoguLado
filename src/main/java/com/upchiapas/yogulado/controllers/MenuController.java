package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MenuController {

    @FXML
    private Button btn_irCarrito;
    @FXML
    private TextArea txt_AreaImpresion;

   @FXML
    void irCarritoClicked(MouseEvent event) {
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
      // Main.setFXML("Orden-view","Carrito");
    }

    @FXML
    void lbl_agregarOreo(MouseEvent event) {

    }


}
