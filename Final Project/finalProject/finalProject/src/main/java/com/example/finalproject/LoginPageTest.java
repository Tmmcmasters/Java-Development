package com.example.finalproject;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.testfx.assertions.api.Assertions.assertThat;

@ExtendWith(ApplicationExtension.class)
class LoginPageTest {

    @Start
    void start(Stage stage) throws Exception {
        new LoginPage().start(stage);
    }

    @Test
    void loginPageIsDisplayed(FxRobot robot) {
        assertThat(robot.lookup("#usernameField").queryAs(javafx.scene.control.TextField.class)).isNotNull();
        assertThat(robot.lookup("#passwordField").queryAs(javafx.scene.control.PasswordField.class)).isNotNull();
        assertThat(robot.lookup("#loginButton").queryAs(javafx.scene.control.Button.class)).isNotNull();
    }
}
