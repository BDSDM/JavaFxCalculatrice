module com.destin.javafxcalculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.destin.javafxcalculatrice to javafx.fxml;
    exports com.destin.javafxcalculatrice;
}