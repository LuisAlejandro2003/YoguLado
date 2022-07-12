package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class OrdenController {

    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    @FXML
    private Button btn_agregarVainilla;

    @FXML
    private Button btn_agregarZarzamora;

    @FXML
    private Button btn_irCarrito;

    @FXML
    private Button btn_oreo;

    @FXML
    private TextArea txt_areaPedido;

    @FXML
    private TextField txt_nombreCliente;

    @FXML
    void btn_Vainilla(MouseEvent event) {

    }

    @FXML
    void btn_Zarzamora(MouseEvent event) {

    }

    @FXML
    void btn_agregarOreo(MouseEvent event) {
        String nombre= this.txt_nombreCliente.getText();
        Cliente cliente;
        cliente = new Cliente(nombre);
        listaClientes.add(cliente); //Agrega cliente al array
        addHeladoOreo(cliente); //Agrega helado a cliente
        for (Cliente cliente1 : listaClientes){
               txt_areaPedido.setText("");
                for (Helado helado: cliente.getHelado()) {
                    txt_areaPedido.appendText(String.valueOf(  helado.getSabor()) + " " + helado.getPrecio());
                }
        }
    }
    private static boolean addHeladoOreo(Cliente cliente){
        return cliente.addHelado(new Helado("Oreo",80));
    }

    @FXML
    void irCarritoClicked(MouseEvent event) {

    }

}
