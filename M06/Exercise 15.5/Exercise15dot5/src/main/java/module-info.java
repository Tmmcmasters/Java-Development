module com.example.exercise15dot5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise15dot5 to javafx.fxml;
    exports com.example.exercise15dot5;
}