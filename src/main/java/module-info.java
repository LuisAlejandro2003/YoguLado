module com.upchiapas.yogulado {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.yogulado to javafx.fxml;
    exports com.upchiapas.yogulado;
    exports com.upchiapas.yogulado.controllers;
    opens com.upchiapas.yogulado.controllers to javafx.fxml;
    exports com.upchiapas.yogulado.models;
    opens com.upchiapas.yogulado.models to javafx.fxml;
}