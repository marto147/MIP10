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

public class LogIN {


    @FXML
    private Button cancel;

    @FXML
    private TextField entryname;

    @FXML
    private PasswordField password;

    @FXML
    private Button registration;

    @FXML
    private Button signup;
    @FXML
    void registrovat(ActionEvent event) throws IOException {
        Stage stage = (Stage) registration.getScene().getWindow();
        Parent root = FXMLLoader.load(GUIMain.class.getResource("registration.fxml"));
        stage.setScene(new Scene(root));

    }

}