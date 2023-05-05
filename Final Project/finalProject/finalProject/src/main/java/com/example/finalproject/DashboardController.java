package com.example.finalproject;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import com.jfoenix.controls.JFXButton;
import javafx.util.Duration;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DashboardController implements Initializable {

    @FXML
    private VBox anchorSliderPanel;

    @FXML
    private ImageView backLogo;

    @FXML
    private JFXButton backMenu;

    @FXML
    private ImageView frontLogo;

    @FXML
    private JFXButton frontMenu;
    @FXML
    private JFXButton eventsPageButton;
    @FXML
    private JFXButton profilePageButton;
    @FXML
    private JFXButton registerEventPageButton;
    @FXML
    private JFXButton aboutPageButton;
    @FXML
    private JFXButton exitPageButton;
    @FXML
    private Pane mainPane;
    @FXML
    private BorderPane paneToLoadPages;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        frontLogo.setVisible(false);
        frontMenu.setVisible(false);
    }

    public void handleEventsPageButtonAction(ActionEvent event) throws IOException {

        loadPage("eventsPage");

       // FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eventsPage.fxml"));
    }
    public void handleProfilePageButtonAction(ActionEvent event) throws IOException {

        loadPage("profilePage");


    }
    public void handleRegisterEventPageButtonAction(ActionEvent event) throws IOException {

        loadPage("registerEventsPage");

    }
    public void handleAboutPageButtonAction(ActionEvent event) throws IOException {

        loadPage("aboutPage");

    }
    public void handleExitPageButtonAction(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit Application");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("Press OK to exit, or Cancel to stay.");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            System.exit(0);
        }
    }

    private void loadPage (String pageName) throws IOException {
        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(pageName + ".fxml"));
            root = fxmlLoader.load();
        } catch (IOException e) {
            Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, e);
        }

        paneToLoadPages.setCenter(root);
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        anchorSliderPanel.setTranslateX(-116);
//        frontMenu.setOnMouseClicked(e -> {
//            TranslateTransition slide = new TranslateTransition();
//            slide.setDuration(Duration.seconds(0.5));
//            slide.setNode(anchorSliderPanel);
//
//            slide.setToX(0);
//            slide.play();
//
//            slide.setOnFinished(event -> {
//                frontMenu.setVisible(false);
//                backMenu.setVisible(true);
//            });
//        });
//
//        backMenu.setOnMouseClicked(e -> {
//            TranslateTransition slide = new TranslateTransition();
//            slide.setDuration(Duration.seconds(0.5));
//            slide.setNode(anchorSliderPanel);
//
//            slide.setToX(-116);
//            slide.play();
//
//            slide.setOnFinished(event -> {
//                frontMenu.setVisible(true);
//                backMenu.setVisible(false);
//            });
//        });
//    }

}
