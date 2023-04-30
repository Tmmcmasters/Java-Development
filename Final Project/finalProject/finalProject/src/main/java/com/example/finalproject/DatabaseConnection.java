package com.example.finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        String databaseName = "databaseschema";
        String databaseUsername = "root";
        String databasePassword = "funnyTim1234!";
        String databaseUrl = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;

    }

}
