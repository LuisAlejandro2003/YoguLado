package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

import static com.upchiapas.yogulado.Main.listaClientes;
import static com.upchiapas.yogulado.Main.loadFXML;

public class OrdenController {
    int indice=0;

    @FXML
    private TextArea txtAreaPedido;

    @FXML
    private Button btnDeshacer;


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

    public static double total;


    public  static ArrayList<Helado> listaHeladosTemporal = new ArrayList<>();

    @FXML
    void btnAgregarOreoMouseClicked(MouseEvent event) {
        indice+=1;
        total=0.0;
        listaHeladosTemporal.add(addHeladoOreo());
        txtAreaPedido.clear();
        for (Helado helado : listaHeladosTemporal){
            txtAreaPedido.appendText(String.valueOf(helado.getSabor()+ " "+ helado.getPrecio()+"\n"));
            total+=helado.getPrecio();
        }
        txtAreaPedido.appendText("Este es el total: " + String.valueOf(total));

    }
    private Helado addHeladoOreo(){
        return new Helado("Oreo",80);
    }

    @FXML
    void btnAgregarVainillaMouseClicked(MouseEvent event) {
        indice+=1;
        total=0.0;
        listaHeladosTemporal.add(addHeladoVainilla());
        txtAreaPedido.clear();
        for (Helado helado : listaHeladosTemporal){
            txtAreaPedido.appendText(String.valueOf(helado.getSabor()+ " "+ helado.getPrecio()+"\n"));
            total+=helado.getPrecio();
        }
        txtAreaPedido.appendText("Este es el total: " + String.valueOf(total));
    }
    private Helado addHeladoVainilla(){
        return new Helado("Vainilla",85);
    }


    @FXML
    void btnAgregarZarzamoraMouseClicked(MouseEvent event) {
        indice+=1;
        total=0.0;
        listaHeladosTemporal.add(addHeladoZarzamora());
        txtAreaPedido.clear();
        for (Helado helado : listaHeladosTemporal){
            txtAreaPedido.appendText(String.valueOf(helado.getSabor()+ " "+ helado.getPrecio()+"\n"));
            total+=helado.getPrecio();
        }
        txtAreaPedido.appendText("Este es el total: " + String.valueOf(total));
    }
    private Helado addHeladoZarzamora(){
        return new Helado("Zarzamora",120);
    }

    @FXML
    void btnFinalizarMouseClicked(MouseEvent event) throws IOException {
        if(Objects.equals(txtNombreCliente.getText(), "")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ingrese el nombre de cliente");
            alert.showAndWait();
        } else {
            if (txtAreaPedido.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("No eligio sus helados");
                alert.showAndWait();
            }
            else {
               total=0;
                String nombre= this.txtNombreCliente.getText();
                Cliente cliente = new Cliente(nombre,listaHeladosTemporal, LocalDate.now());
                listaClientes.add(cliente);
                txtNombreCliente.setText(" ");
                txtAreaPedido.setText(" ");

                for (Helado helado : listaHeladosTemporal){
                    txtAreaPedido.appendText(String.valueOf(helado.getSabor()+ " "+ helado.getPrecio()+"\n"));
                    total+=helado.getPrecio();
                }
                txtAreaPedido.appendText("Este es el total: " + String.valueOf(total));
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("Cobro-view.fxml"));
                Parent root = null;
                try {
                    root = loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                CobroController controlador = loader.getController();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();
                listaHeladosTemporal.clear();
                total=0;
            }
        }
    }
    @FXML
    void btnDeshacerMouseClicked(MouseEvent event) {
        if (indice==-1){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No ha ordenado nada");
            alert.showAndWait();
        }
        else
            indice-=1;
        total=0;
        txtAreaPedido.clear();

        listaHeladosTemporal.remove(indice);
        for (Helado helado : listaHeladosTemporal){
            txtAreaPedido.appendText(String.valueOf(helado.getSabor()+ " "+ helado.getPrecio()+"\n"));
            total+=helado.getPrecio();
        }
        txtAreaPedido.appendText("Este es el total: " + String.valueOf(total));

    }
    @FXML
    void btnInicioMouseClicked(MouseEvent event) {
        listaHeladosTemporal.clear();
       Main.setFXML("Principal-view","Inicio");
        Stage stage = (Stage) this.btnInicio.getScene().getWindow();
        stage.close();


    }

    public double getTotal() {
        return total;
    }
}
