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

import static com.upchiapas.yogulado.Main.listaClientes;  //Import predeterminado


public class OrdenController {

    // private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    Main main = new Main();
    @FXML
    private Button btn_agregarVainilla;

    @FXML
    private Button btn_agregarZarzamora;

    @FXML
    private Button btn_zarzamora;
    @FXML
    private Button btn_finalizar;

    @FXML
    private Button btn_oreo;

    @FXML
    private TextArea txt_areaPedido;

    @FXML
    private TextField txt_nombreCliente;


    private double total=0;

    public  static ArrayList<Helado> listaHeladosTemporal = new ArrayList<>();

    @FXML
    void btn_agregarOreo(MouseEvent event) {
        total+=80.0;
        listaHeladosTemporal.add(addHeladoOreo());
        txt_areaPedido.appendText(String.valueOf("\nOreo \n "));
        txt_areaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private Helado addHeladoOreo(){
        return new Helado("Oreo",80);
    }

    @FXML
    void irCarritoClicked(MouseEvent event) {

    }

    public void btn_agregarZarzamora(MouseEvent mouseEvent) {
        total+=120.0;
        listaHeladosTemporal.add(addHeladoZarzamora());
        txt_areaPedido.appendText(String.valueOf("\nZarzamora \n "));
        txt_areaPedido.appendText("    total:  "+ String.valueOf(total));


    }

    private Helado addHeladoZarzamora(){
        return new Helado("Zarzamora",80);
    }

    @FXML
    void btn_agregarVainilla(MouseEvent event) {
        total+=85.0;
        listaHeladosTemporal.add(addHeladoVainilla());
        txt_areaPedido.appendText(String.valueOf("\nVainilla \n "));
        txt_areaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private Helado addHeladoVainilla(){
        return new Helado("Vainilla",85);
    }
    public void btn_irFinalizarClicked(MouseEvent mouseEvent) {
        if(Objects.equals(txt_nombreCliente.getText(), "")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ingrese el nombre de cliente");
            alert.showAndWait();
        } else {
            String nombre= this.txt_nombreCliente.getText();
            Cliente cliente = new Cliente(nombre,listaHeladosTemporal);
            listaClientes.add(cliente);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Correcto");
            alert.setContentText("Orden generado con exito");
            alert.showAndWait();
            txt_nombreCliente.setText(" ");
            txt_areaPedido.setText(" ");
            /*Main.setFXML("principal-view","Inicio");
            Stage stage = (Stage) this.btn_finalizar.getScene().getWindow();
            stage.close();
            listaHeladosTemporal.clear();*/
        }
    }
    public void btn_irInicio(MouseEvent mouseEvent) {
        Main.setFXML("principal-view","Inicio");
        Stage stage = (Stage) this.btn_oreo.getScene().getWindow();
        stage.close();
        listaHeladosTemporal.clear();
    }
    @FXML
    public double getTotal() {
        return total;
    }
}
