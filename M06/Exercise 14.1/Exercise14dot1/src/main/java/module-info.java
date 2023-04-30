module com.example.exercise14dot1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise14dot1 to javafx.fxml;
    exports com.example.exercise14dot1;
}