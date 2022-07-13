package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import static com.upchiapas.yogulado.Main.listaClientes;

public class AdminController {

    @FXML
    private Button btn_ventas;

    @FXML
    private TextArea txtArea_ventas;

    @FXML
    void btn_verVentas(MouseEvent event) {
        for (Cliente cliente : listaClientes){
            txtArea_ventas.setText("");
            for (Helado helado: cliente.getHelado()) {
                txtArea_ventas.appendText(String.valueOf( helado.getId() + " " + helado.getSabor()) + " " + helado.getPrecio()+ "\n");
            }
        }
    }

}
