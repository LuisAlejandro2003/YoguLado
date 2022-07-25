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
    OrdenController ordenController=new OrdenController();
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
        int i=0;
        for (Cliente cliente : listaClientes){
            txtAreaVentas.appendText("-----------------------------");
            txtAreaVentas.appendText(("\n"+listaClientes.get(i).getFecha() +" \n "+ listaClientes.get(i).getNombre())+"\n");

            for (Helado helado: cliente.getHelado()) {
                txtAreaVentas.appendText(String.valueOf( helado.getSabor()) + " " + helado.getPrecio()+ "\n");
            }
            i++;


        }
    }

    @FXML
    void btnBuscarMouseClicked(MouseEvent event) {
        boolean flag = false;
        String name = txtNombre.getText();
        txtAreaNombres.setText(" ");
        int i=0;
        for (Cliente cliente : listaClientes){
            if(listaClientes.get(i).getNombre().matches(".*"+name+".*")){

                txtAreaNombres.appendText(("\n"+listaClientes.get(i).getFecha() +" \n "+ listaClientes.get(i).getNombre())+"\n");
                for (Helado helado: cliente.getHelado()) {
                    txtAreaNombres.appendText(String.valueOf( helado.getSabor()) + " " + helado.getPrecio()+ "\n");
                }
                flag = true;
            }
            i++;
        }
        if(flag == false){
            txtAreaNombres.appendText("No se econtraron coincidencias");
        }
    }
}
