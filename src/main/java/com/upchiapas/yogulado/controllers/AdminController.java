package com.upchiapas.yogulado.controllers;
import com.upchiapas.yogulado.models.Cliente;
import com.upchiapas.yogulado.models.Helado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import static com.upchiapas.yogulado.Main.listaClientes;
public class AdminController {
    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnVentas;

    @FXML
    private TextArea txtAreaNombres;

    @FXML
    private TextArea txtAreaVentas;

    @FXML
    private TextField txtNombre;
    @FXML
    void btnVentasMouseClicked(MouseEvent event) {
        double ventas = 0;
        int i=0;
        for (Cliente cliente : listaClientes){
            txtAreaVentas.appendText("-----------------------------");
            txtAreaVentas.appendText(("\n"+listaClientes.get(i).getFecha() +" \n "+ listaClientes.get(i).getNombre())+"\n");

            for (Helado helado: cliente.getHelado()) {
                txtAreaVentas.appendText(String.valueOf( helado.getSabor()) + " $" + helado.getPrecio()+ "\n");
                ventas+=helado.getPrecio();

            }
            i++;
        }
        txtAreaVentas.appendText("\nLas ventas totales son: $"+String.valueOf(ventas));
    }
    @FXML
    void btnBuscarMouseClicked(MouseEvent event) {
        double pedido = 0;
        boolean flag = false;
        String name = txtNombre.getText();
        txtAreaNombres.setText(" ");
        int i=0;
        for (Cliente cliente : listaClientes){
            if(listaClientes.get(i).getNombre().matches(".*"+name+".*")){
                txtAreaNombres.appendText(("\n"+listaClientes.get(i).getFecha() +" \n "+ listaClientes.get(i).getNombre())+"\n");
                for (Helado helado: cliente.getHelado()) {
                    txtAreaNombres.appendText(String.valueOf( helado.getSabor()) +" $"+ helado.getPrecio() + "\n");
                    pedido+=helado.getPrecio();
                }
                flag = true;
                txtAreaNombres.appendText("\nEl cliente gasto: $"+String.valueOf(pedido));
                pedido=0;
            }
            i++;
        }
        if(flag == false){
            txtAreaNombres.appendText("No se encontraron coincidencias");
        }
    }
}