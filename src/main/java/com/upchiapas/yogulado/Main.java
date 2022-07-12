package com.upchiapas.yogulado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("principal-view"));
        stage.setTitle("Inicio");
        stage.setScene(scene);
        stage.centerOnScreen(); // Centra la pantalla en tiempo de ejecución
        stage.setResizable(false);  // Impide que el usuario pueda modificar el tamaño del formulario
        stage.show();
    }

    public static Parent loadFXML(String nameView) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView)); //Sustituir en el objeto scene el archivo de vista
        stage.setResizable(true);
        stage.sizeToScene(); //Renderizar el tamaño del stage con las dimensiones de la nueva vista
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }
    public static void main(String[] args) {
        launch();
    }
}