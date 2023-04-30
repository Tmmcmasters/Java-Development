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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import com.jfoenix.controls.JFXButton;
import javafx.util.Duration;
import org.w3c.dom.events.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        frontLogo.setVisible(false);
        frontMenu.setVisible(false);
    }

    public void handleEventsPageButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eventsPage.fxml"));
    }
    public void handleProfilePageButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profilePage.fxml"));
    }
    public void handleRegisterEventPageButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerEventsPage.fxml"));
    }
    public void handleAboutPageButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutPage.fxml"));
    }
    public void handleExitPageButtonAction(ActionEvent event) throws IOException {
        System.exit(0);
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
