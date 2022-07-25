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

        Main.setFXML("Orden-view","YoguLado");
      
    }

}


