package com.alura.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Properties;

public abstract class ImdbApi {

    private static String getApiUrl() {

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

    public static String FetchMovies() {

        final String URL = getApiUrl();
        final var CLIENT = HttpClient.newHttpClient();

        var uri = URI.create(URL);
        var request = HttpRequest.newBuilder(uri).GET().build();

        try {
            HttpResponse<String> response = CLIENT.send(request, BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException ex) {
            System.out.println("Oops! " + ex.getMessage());
            System.exit(0);
        }
        return null;
    }
}
