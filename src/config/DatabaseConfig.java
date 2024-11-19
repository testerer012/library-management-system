package com.library.config;

public class DatabaseConfig {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "password";

    public static String getDbUrl() {
        return DB_URL;
    }

    public static String getDbUsername() {
        return DB_USERNAME;
    }

    public static String getDbPassword() {
        return DB_PASSWORD;
    }
}