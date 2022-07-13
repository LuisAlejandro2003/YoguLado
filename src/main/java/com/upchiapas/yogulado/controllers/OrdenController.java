package com.upchiapas.yogulado.controllers;

import com.upchiapas.yogulado.Main;
import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    private Button btn_irCarrito;

    @FXML
    private Button btn_oreo;

    @FXML
    private TextArea txt_areaPedido;

    @FXML
    private TextField txt_nombreCliente;

    private double total=0;

    @FXML
    void btn_agregarOreo(MouseEvent event) {
        String nombre= this.txt_nombreCliente.getText();
        Cliente cliente;
        cliente = new Cliente(nombre);
        listaClientes.add(cliente); //Agrega cliente al array
        addHeladoOreo(cliente); //Agrega helado a cliente
        total+=80.0;
        for (Cliente cliente1 : listaClientes){
               txt_areaPedido.setText("");
                for (Helado helado: cliente.getHelado()) {
                    txt_areaPedido.appendText(String.valueOf( helado.getId() + " " + helado.getSabor()) + " " + helado.getPrecio()+ "\n");
                }
        }
        txt_areaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private static boolean addHeladoOreo(Cliente cliente){

        return cliente.addHelado(new Helado("Oreo",80));
    }

    @FXML
    void irCarritoClicked(MouseEvent event) {

    }

    public void btn_irInicio(MouseEvent mouseEvent) {
        Main.setFXML("principal-view","Inicio");
        Stage stage = (Stage) this.btn_oreo.getScene().getWindow();
        stage.close();
    }

    public void btn_agregarZarzamora(MouseEvent mouseEvent) {
        String nombre= this.txt_nombreCliente.getText();
        Cliente cliente;
        cliente = new Cliente(nombre);
        listaClientes.add(cliente); //Agrega cliente al array
        addHeladoZarzamora(cliente); //Agrega helado a cliente
        total+=120.0;
        for (Cliente cliente1 : listaClientes){
            txt_areaPedido.setText("");
            for (Helado helado: cliente.getHelado()) {
                txt_areaPedido.appendText(String.valueOf( helado.getId() + " " + helado.getSabor()) + " " + helado.getPrecio()+ "\n");
            }
        }
        txt_areaPedido.appendText("    total:  "+ String.valueOf(total));

    }

    private static boolean addHeladoZarzamora(Cliente cliente){

        return cliente.addHelado(new Helado("Zarzamora",120));
    }


    @FXML
    void btn_agregarVainilla(MouseEvent event) {

        String nombre= this.txt_nombreCliente.getText();
        Cliente cliente;
        cliente = new Cliente(nombre);
        listaClientes.add(cliente); //Agrega cliente al array
        addHeladoVainilla(cliente); //Agrega helado a cliente
        total+=85.0;
        for (Cliente cliente1 : listaClientes){
            txt_areaPedido.setText("");
            for (Helado helado: cliente.getHelado()) {
                txt_areaPedido.appendText(String.valueOf( helado.getId() + " " + helado.getSabor()) + " " + helado.getPrecio() +  "\n");
            }
        }
         txt_areaPedido.appendText("    total:  "+ String.valueOf(total));
    }
    private static boolean addHeladoVainilla(Cliente cliente){
        return cliente.addHelado(new Helado("Vainilla",85));
    }

    public double getTotal() {
        return total;
    }
}
