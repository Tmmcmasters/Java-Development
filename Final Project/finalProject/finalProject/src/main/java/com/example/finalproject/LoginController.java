package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class LoginController {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;


    public void loginButtonAction (ActionEvent e) {


        if (!usernameTextField.getText().isBlank() && !passwordTextField.getText().isBlank()) {
            loginMessageLabel.visibleProperty().setValue(false);
            validateLogin();
        } else {
            loginMessageLabel.visibleProperty().setValue(true);
            loginMessageLabel.setText("Please fill in all fields");
        }

    }

    public void cancelButtonAction (ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }



    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        String verifyLogin = "SELECT password FROM useraccounts WHERE username = ?";

        try {
            PreparedStatement preparedStatement = connectDB.prepareStatement(verifyLogin);
            preparedStatement.setString(1, username);
            ResultSet queryResult = preparedStatement.executeQuery();

            if (queryResult.next()) {
                String storedHashedPassword = queryResult.getString("password");

                if (PasswordManager.checkPassword(password, storedHashedPassword)) {
                    loginMessageLabel.visibleProperty().setValue(true);
                    loginMessageLabel.setText("Welcome " + username);
                    try {
                        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("dashboard.fxml")));
                        Stage dashboardStage = new Stage();

                       // dashboardStage.initStyle(StageStyle.UNDECORATED);
                        dashboardStage.setResizable(false);
                        dashboardStage.setTitle("Dashboard");
                        dashboardStage.setScene(new Scene(root, 700, 400));
                        dashboardStage.show();

                    } catch (Exception e1) {
                        e1.printStackTrace();

                    }
                } else {
                    loginMessageLabel.visibleProperty().setValue(true);
                    loginMessageLabel.setText("Invalid credentials");
                }
            } else {
                loginMessageLabel.visibleProperty().setValue(true);
                loginMessageLabel.setText("Invalid credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void createAccountButtonAction (ActionEvent e) {
        createAccountForm();
    }

    public void createAccountForm () {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Stage registerStage = new Stage();

            registerStage.initStyle(StageStyle.UNDECORATED);
            registerStage.setTitle("Create Account");
            registerStage.setScene(new Scene(root, 520, 500));
            registerStage.show();

        } catch (Exception e1) {
            e1.printStackTrace();

        }
    }


}