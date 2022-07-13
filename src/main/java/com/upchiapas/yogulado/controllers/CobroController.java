package com.upchiapas.yogulado.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CobroController {
    OrdenController ordenController = new OrdenController();

    @FXML
    private Button btn_verTotal;

    @FXML
    private Label lbl_total;

    @FXML
    void btn_imprimirTotal(MouseEvent event) {
        double total= ordenController.getTotal();
        lbl_total.setText(String.valueOf(total));
        lbl_total.setVisible(true);
    }

}

