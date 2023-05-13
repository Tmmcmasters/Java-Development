module com.example.exercise341 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.exercise341 to javafx.fxml;
    exports com.example.exercise341;
}