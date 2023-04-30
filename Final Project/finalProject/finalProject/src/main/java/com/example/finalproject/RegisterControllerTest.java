package com.example.finalproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

class RegisterControllerTest extends ApplicationTest {

    private RegisterController controller;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/path/to/your/RegisterController.fxml"));
        stage.setScene(new Scene(loader.load()));
        controller = loader.getController();
        stage.show();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void cancelButtonAction() {
        clickOn("#closeButton");
        assertFalse(controller.closeButton.getScene().getWindow().isShowing(), "Window should be closed");
    }

    @Test
    void registerButtonAction() {
        TextField firstNameTextField = lookup("#firstNameTextField").queryAs(TextField.class);
        TextField lastNameTextField = lookup("#lastNameTextField").queryAs(TextField.class);
        TextField usernameTextField = lookup("#usernameTextField").queryAs(TextField.class);
        PasswordField passwordPasswordField = lookup("#passwordPasswordField").queryAs(PasswordField.class);
        PasswordField confirmPasswordPasswordField = lookup("#confirmPasswordPasswordField").queryAs(PasswordField.class);
        Button registerButton = lookup("#registerButton").queryAs(Button.class);
        Label registerMessageLabel = lookup("#registerMessageLabel").queryAs(Label.class);

        // Test with empty fields
        clickOn(registerButton);
        verifyThat(registerMessageLabel, hasText("Please fill in all fields"));

        // Test with mismatched passwords
        firstNameTextField.setText("John");
        lastNameTextField.setText("Doe");
        usernameTextField.setText("johndoe");
        passwordPasswordField.setText("password123");
        confirmPasswordPasswordField.setText("password456");
        clickOn(registerButton);
        verifyThat(registerMessageLabel, hasText("Passwords do not match"));

        // Test with correct input (not checking database interaction)
        confirmPasswordPasswordField.setText("password123");
        clickOn(registerButton);
        assertFalse(registerMessageLabel.isVisible(), "Register message label should not be visible");
    }
}
