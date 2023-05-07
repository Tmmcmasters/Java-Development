package com.example.exercise;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise extends Application {

    private File selectedFile;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new javafx.geometry.Insets(10));

        Button chooseFileButton = new Button("Choose File");
        TextField numFilesField = new TextField();
        numFilesField.setPromptText("Enter number of smaller files");
        Button submitButton = new Button("Submit");

        FileChooser fileChooser = new FileChooser();
        chooseFileButton.setOnAction(e -> selectedFile = fileChooser.showOpenDialog(primaryStage));
        submitButton.setOnAction(e -> {
            int numFiles = Integer.parseInt(numFilesField.getText());
            try {
                splitFile(selectedFile, numFiles);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        root.getChildren().addAll(chooseFileButton, numFilesField, submitButton);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("File Splitter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void splitFile(File inputFile, int numFiles) throws IOException {
        long fileSize = inputFile.length();
        long partSize = fileSize / numFiles;
        long remainingBytes = fileSize % numFiles;

        FileInputStream fis = new FileInputStream(inputFile);
        byte[] buffer = new byte[1024];
        int bytesRead;

        for (int i = 1; i <= numFiles; i++) {
            File outputFile = new File(inputFile.getAbsolutePath() + "." + i);
            FileOutputStream fos = new FileOutputStream(outputFile);
            long bytesToWrite = partSize + (i == numFiles ? remainingBytes : 0);

            while (bytesToWrite > 0 && (bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                bytesToWrite -= bytesRead;
            }

            fos.close();
        }

        fis.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
