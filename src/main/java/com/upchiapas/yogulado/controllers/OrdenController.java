package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

import static com.upchiapas.yogulado.Main.listaClientes;

public class OrdenController {

    @FXML
    private TextArea txtAreaPedido;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnOreo;

    @FXML
    private Button btnVainilla;

    @FXML
    private Button btnZarzamora;

    @FXML
    private TextField txtNombreCliente;

    private double total=0;

    public  static ArrayList<Helado> listaHeladosTemporal = new ArrayList<>();

    @FXML
    void btnAgregarOreoMouseClicked(MouseEvent event) {
        total+=80.0;
        listaHeladosTemporal.add(addHeladoOreo());
        txtAreaPedido.appendText(String.valueOf("\nOreo \n "));
        txtAreaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private Helado addHeladoOreo(){
        return new Helado("Oreo",80);
    }

    @FXML
    void btnAgregarVainillaMouseClicked(MouseEvent event) {
        total+=85.0;
        listaHeladosTemporal.add(addHeladoVainilla());
        txtAreaPedido.appendText(String.valueOf("\nVainilla \n "));
        txtAreaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private Helado addHeladoVainilla(){
        return new Helado("Vainilla",85);
    }


    @FXML
    void btnAgregarZarzamoraMouseClicked(MouseEvent event) {
        total+=120.0;
        listaHeladosTemporal.add(addHeladoZarzamora());
        txtAreaPedido.appendText(String.valueOf("\nZarzamora \n "));
        txtAreaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private Helado addHeladoZarzamora(){
        return new Helado("Zarzamora",80);
    }

    @FXML
    void btnFinalizarMouseClicked(MouseEvent event) {
        if(Objects.equals(txtNombreCliente.getText(), "")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ingrese el nombre de cliente");
            alert.showAndWait();
        } else {
            String nombre= this.txtNombreCliente.getText();
            Cliente cliente = new Cliente(nombre,listaHeladosTemporal);
            listaClientes.add(cliente);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Correcto");
            alert.setContentText("Orden generado con exito");
            alert.showAndWait();
            txtNombreCliente.setText(" ");
            txtAreaPedido.setText(" ");
            //Main.setFXML("Cobro-view","Cobro");
            Main.setFXML("Principal-view","Cobro");
            Stage stage = (Stage) this.btnFinalizar.getScene().getWindow();
            stage.close();
            listaHeladosTemporal.clear();
        }
    }

    @FXML
    void btnInicioMouseClicked(MouseEvent event) {
        Main.setFXML("Principal-view","Inicio");
        Stage stage = (Stage) this.btnInicio.getScene().getWindow();
        stage.close();
        listaHeladosTemporal.clear();
    }
    public double getTotal() {
        return total;
    }
}
