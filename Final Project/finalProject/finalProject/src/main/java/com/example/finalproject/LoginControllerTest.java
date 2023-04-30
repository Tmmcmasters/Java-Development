package com.example.finalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class LoginControllerTest extends ApplicationTest {

    public static class TestApp extends Application {
        @Override
        public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/path/to/your/Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        }
    }

    @BeforeEach
    public void setUp() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(TestApp.class);
    }

    @AfterEach
    public void tearDown() throws Exception {
        FxToolkit.hideStage();
    }

    @Test
    public void testEmptyFields() {
        clickOn("#usernameTextField");
        write("");
        clickOn("#passwordTextField");
        write("");
        clickOn("#loginButton");

        verifyThat("#loginMessageLabel", hasText("Please fill in all fields"));
    }

    // Add more tests here
}
