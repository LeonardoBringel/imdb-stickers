package com.alura.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApiController {

    public static String getApiUrl() {

        Properties properties = new Properties();
        try {
            var fileInputStream = new FileInputStream("api.properties");
            properties.load(fileInputStream);
        } catch (IOException ex) {
            System.out.println("Oops! " + ex.getMessage());
            System.exit(0);
        }
        return properties.getProperty("topmoviesUrl");
    }
}
