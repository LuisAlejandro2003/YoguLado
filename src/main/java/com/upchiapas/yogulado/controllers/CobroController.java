package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CobroController {


    @FXML
    private Button btnVerTotal;

    @FXML
    private Label lblImprimirTotal;
    OrdenController ordenController = new OrdenController();
    private double total = ordenController.getTotal();

    @FXML
    private TextField txtTotal;
    private double pago;

    @FXML
    void btnPagarMouseClicked(MouseEvent event) {
        pago= Double.parseDouble(txtTotal.getText());
        if (pago>total){
            double cambio;
            cambio= pago-total;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Correcto");
            alert.setContentText("su cambio es: " + cambio);
            alert.showAndWait();
            txtTotal.setText("");
            Main.setFXML("Principal-view","Inicio");
            Stage stage = (Stage) this.btnVerTotal.getScene().getWindow();
            stage.close();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Pago invalido");
            alert.setContentText("Ingrese una cantidad valida");
            alert.showAndWait();
            txtTotal.setText("");
        }
    }
    @FXML
    void imprimirOnMouseMoved(MouseEvent event) {
        lblImprimirTotal.setText("$"+String.valueOf(total));
        lblImprimirTotal.setVisible(true);
    }
}
