package com.example.finalproject;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import static org.junit.jupiter.api.Assertions.*;

class PasswordManagerTest extends ApplicationTest {

    @Test
    void hashPassword() {
        String plaintextPassword = "testPassword";
        String hashedPassword = PasswordManager.hashPassword(plaintextPassword);

        assertNotNull(hashedPassword, "Hashed password should not be null");
        assertNotEquals(plaintextPassword, hashedPassword, "Hashed password should not be equal to plaintext password");
    }

    @Test
    void checkPassword() {
        String plaintextPassword = "testPassword";
        String hashedPassword = PasswordManager.hashPassword(plaintextPassword);

        assertTrue(PasswordManager.checkPassword(plaintextPassword, hashedPassword), "Password check should return true for correct password");
        assertFalse(PasswordManager.checkPassword("wrongPassword", hashedPassword), "Password check should return false for incorrect password");
    }
}
