package com.example.exercise14dot1;
//Imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Main class
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException { // Main method
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml")); // Loads the fxml file
        Scene scene = new Scene(fxmlLoader.load(), 600, 400); // Loads the fxml file into a scene with 600 width and 400 height
        stage.setTitle("Exercise 14.1!"); // Sets the title
        stage.setScene(scene); // Sets the scene
        stage.show(); // Shows the stage
    }

    public static void main(String[] args) {
        launch();
    } // Launches the application
}