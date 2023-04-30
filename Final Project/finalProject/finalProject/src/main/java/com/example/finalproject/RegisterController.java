package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class RegisterController {

@FXML
private Button closeButton;
@FXML
private Label registerMessageLabel;
@FXML
private TextField firstNameTextField;
@FXML
private TextField lastNameTextField;
@FXML
private TextField usernameTextField;
@FXML
private PasswordField passwordPasswordField;
@FXML
private PasswordField confirmPasswordPasswordField;

public void registerButtonAction (ActionEvent e) {

    if (!usernameTextField.getText().isBlank() && !passwordPasswordField.getText().isBlank() && !confirmPasswordPasswordField.getText().isBlank() && !firstNameTextField.getText().isBlank() && !lastNameTextField.getText().isBlank()) {
        registerMessageLabel.visibleProperty().setValue(false);
        if (!passwordPasswordField.getText().equals(confirmPasswordPasswordField.getText())) {
            registerMessageLabel.visibleProperty().setValue(true);
            registerMessageLabel.setText("Passwords do not match");
        } else {

            registerMessageLabel.visibleProperty().setValue(false);
            registerUser();
        }
    } else {
        registerMessageLabel.visibleProperty().setValue(true);
        registerMessageLabel.setText("Please fill in all fields");
    }



}

public void cancelButtonAction (ActionEvent e) {
    Stage stage = (Stage) closeButton.getScene().getWindow();
    stage.close();
}

public void registerUser() {


    DatabaseConnection connectNow = new DatabaseConnection();
    Connection connectDB = connectNow.getConnection();

    String firstName = firstNameTextField.getText();
    String lastName = lastNameTextField.getText();
    String username = usernameTextField.getText();
    String password = passwordPasswordField.getText();

    String checkUserExistsSQL = "SELECT UserName FROM useraccounts WHERE UserName = ?";

    try {
        PreparedStatement preparedStatement = connectDB.prepareStatement(checkUserExistsSQL);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            registerMessageLabel.visibleProperty().setValue(true);
            registerMessageLabel.setText("Username already exists");
        } else {
            registerMessageLabel.visibleProperty().setValue(false);
            String insertUserSQL = "insert into useraccounts (Firstname, LastName, UserName, Password) values (?, ?, ?, ?)";
            preparedStatement = connectDB.prepareStatement(insertUserSQL);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, username);

            String hashedPassword = PasswordManager.hashPassword(password);
            preparedStatement.setString(4, hashedPassword);
            preparedStatement.executeUpdate();
            System.out.println("Success");
        }
    } catch (Exception e) {
        e.printStackTrace();
        e.getCause();
    }
}

}
