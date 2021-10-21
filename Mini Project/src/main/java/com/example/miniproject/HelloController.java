package com.example.miniproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Label Title, status;

    @FXML
    private TextField Username, Password;

    @FXML
    private Hyperlink Forgot;
    @FXML
    private Hyperlink NewAcc;
    @FXML
    private TextField Name;
    @FXML
    private TextField email;
    @FXML
    private PasswordField Pass;
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private TextField total;

    //Login Page
    @FXML
    protected void Login(ActionEvent event) throws Exception {
        if (Username.getText().equals("user") && Password.getText().equals("pass")) {
            status.setText("Login Sucess");

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Main Page");
            stage.setScene(scene);
            stage.show();
        } else {
            status.setText("Login Failed");
        }
    }

    //If user forgot his password
    @FXML
    private void OnClickForgotP(ActionEvent event) throws Exception {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Forgot Password Page");
        stage.setScene(scene);
        stage.show();
    }

    //To create Create a new Account
    @FXML
    private void OnClickNewAcc(ActionEvent event) throws Exception {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NewAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("New Account Page");
        stage.setScene(scene);
        stage.show();
    }

    //to Create New Account Page
    @FXML
    private void OnClickCreate(ActionEvent event) throws Exception {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
    }
    //
    @FXML
    protected void onAddButtonClick(ActionEvent event) {
        double first = Double.parseDouble(number1.getText());
        double second = Double.parseDouble(number2.getText());
        double result = first + second;
        total.setText(String.valueOf(result));
    }

}