module com.example.exercise {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.exercise to javafx.fxml;
    exports com.example.exercise;
}