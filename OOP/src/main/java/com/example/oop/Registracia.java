package com.example.oop;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
public class Registracia {

    @FXML
    private Button back;

    @FXML
    private TextField loginNN;

    @FXML
    private TextField name;

    @FXML
    private Button newregister;

    @FXML
    private TextField passwordNN;

    @FXML
    private TextField passwordcorrect;

    @FXML
    private TextField surname;

    @FXML
    void goback(ActionEvent event) throws IOException {
        Stage stage = (Stage) loginNN.getScene().getWindow();
        Parent root = FXMLLoader.load(LogIN.class.getResource("login.fxml"));
        stage.setScene(new Scene(root));


    }

}