module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires jbcrypt;
    requires com.jfoenix;
   // requires mysql.connector.java;
    requires org.testfx;
    requires org.junit.jupiter.api;
   // requires org.junit.jupiter.params;
    requires org.testfx.junit5;


    opens com.example.finalproject to javafx.fxml;
    exports com.example.finalproject;
}