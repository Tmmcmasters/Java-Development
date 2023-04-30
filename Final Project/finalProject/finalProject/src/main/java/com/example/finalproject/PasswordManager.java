package com.example.finalproject;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordManager {

    public static String hashPassword(String plaintextPassword) {
        int workload = 12;
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(plaintextPassword, salt);
    }

    public static boolean checkPassword(String plaintextPassword, String hashedPassword) {
        return BCrypt.checkpw(plaintextPassword, hashedPassword);
    }
}
