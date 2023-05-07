package com.example.finalproject;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class EventsPageController {
    @FXML
    private Text costText;

    @FXML
    private Text descriptionOfEventText;

    @FXML
    private Text eventTitleText;

    @FXML
    private ImageView imageForEventImageView;

    @FXML
    private Text orgNameText;

    @FXML
    private Text spotsAvailableText;
    @FXML
    private AnchorPane anchorPaneToSwipe;
    private double initialMouseX;
    private double initialMouseY;
    private Rotate rotation;
    private double currentMouseX;
    private double currentMouseY;


@FXML
    public void handleMousePressed(MouseEvent event) {
         initialMouseX = event.getSceneX();
         initialMouseY = event.getSceneY();
        rotation = new Rotate();
        anchorPaneToSwipe.getTransforms().add(rotation);
    }

    @FXML
    public void handleMouseDragged(MouseEvent event) {
         currentMouseX = event.getSceneX();
         currentMouseY = event.getSceneY();
        double offsetX = currentMouseX - initialMouseX;
        double offsetY = currentMouseY - initialMouseY;

        anchorPaneToSwipe.setTranslateX(offsetX);
        anchorPaneToSwipe.setTranslateY(offsetY);

        double angle = offsetX * 0.3;
        rotation.setAngle(angle);
    }

@FXML
    public void handleMouseReleased(MouseEvent event) {
        double offsetX = currentMouseX - initialMouseX;
        double threshold = anchorPaneToSwipe.getWidth() * 0.5;

        if (Math.abs(offsetX) > threshold) {
            // Swipe out of view
            double endX = offsetX > 0 ? anchorPaneToSwipe.getScene().getWidth() : -anchorPaneToSwipe.getScene().getWidth();
            TranslateTransition transition = new TranslateTransition(Duration.millis(300), anchorPaneToSwipe);
            transition.setToX(endX);
            transition.setOnFinished(e -> {
                if (anchorPaneToSwipe.getParent() instanceof Pane) {
                    Pane parentPane = (Pane) anchorPaneToSwipe.getParent();
                    parentPane.getChildren().remove(anchorPaneToSwipe);
                }
            });
            transition.play();
        } else {
            // Reset position
            TranslateTransition transition = new TranslateTransition(Duration.millis(300), anchorPaneToSwipe);
            transition.setToX(0);
            transition.setToY(0);
            transition.play();
        }
    }


    public void initialize(URL location, ResourceBundle resources) {

    }

    public void customInitialization() {



    }


}
