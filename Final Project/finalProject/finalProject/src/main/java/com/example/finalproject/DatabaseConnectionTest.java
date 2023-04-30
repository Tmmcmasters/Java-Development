package com.example.finalproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

public class DatabaseConnectionTest {

    @Test
    public void testGetConnection() {
        DatabaseConnection dbConnection = new DatabaseConnection();
        Connection connection = dbConnection.getConnection();

        assertNotNull(connection, "Connection should not be null");
    }

}
