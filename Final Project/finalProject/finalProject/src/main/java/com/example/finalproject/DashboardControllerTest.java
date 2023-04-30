package com.example.finalproject;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ApplicationExtension.class)
public class DashboardControllerTest {

    @Start
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        Pane pane = loader.load();
        stage.setScene(new Scene(pane));
        stage.show();
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testInitialization(FxRobot robot) {
        ImageView frontLogo = robot.lookup("#frontLogo").queryAs(ImageView.class);
        JFXButton frontMenu = robot.lookup("#frontMenu").queryAs(JFXButton.class);

        assertFalse(frontLogo.isVisible(), "Front logo should not be visible initially.");
        assertFalse(frontMenu.isVisible(), "Front menu button should not be visible initially.");
    }

    // I need to Add more test methods to cover different scenarios and interactions.
}
