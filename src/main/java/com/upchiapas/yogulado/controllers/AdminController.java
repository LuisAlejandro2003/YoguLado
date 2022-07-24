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
        double totalF= ordenController.getTotal();
        int i=0;
        for (Cliente cliente : listaClientes){
            txtAreaVentas.appendText((listaClientes.get(i).getNombre()));
            for (Helado helado: cliente.getHelado()) {
                txtAreaVentas.appendText(String.valueOf( "\n"+helado.getId() + " " + helado.getSabor()) + " " + helado.getPrecio()+ "\n");
            }
            i++;
        }
    }
    @FXML
    void btnBuscarMouseClicked(MouseEvent event) {
        double totalF= ordenController.getTotal();
        boolean flag = false;
        String name = txtNombre.getText();
        txtAreaNombres.setText(" ");
        int i=0;
        for (Cliente cliente : listaClientes){
            if(listaClientes.get(i).getNombre().matches("."+name+".")){
                txtAreaNombres.appendText(("\n"+i+" "+listaClientes.get(i).getNombre()));
                flag = true;
            }
            i++;
        }
        if(flag == false){
            txtAreaNombres.appendText("No se econtraron coincidencias");
        }
    }
}
