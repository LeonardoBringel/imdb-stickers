package com.alura.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Client {

    public static String FetchData(String url) {

        final var CLIENT = HttpClient.newHttpClient();

        var uri = URI.create(url);
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
