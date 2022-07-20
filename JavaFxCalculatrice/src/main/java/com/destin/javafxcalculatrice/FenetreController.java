package com.destin.javafxcalculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FenetreController {

    @FXML private TextField nombre;
    @FXML private TextField resultat;
    @FXML private TextField calculer;


    public void calculer(ActionEvent actionEvent) {

        int n = Integer.valueOf(nombre.getText());
        int m = n*n;
        resultat.setText(String.valueOf(m));
    }
}
