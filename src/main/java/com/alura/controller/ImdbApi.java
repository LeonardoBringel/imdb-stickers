package com.alura.controller;

import com.alura.model.Movie;
import com.alura.model.Movies;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

public abstract class ImdbApi {

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

    public static List<Movie> FetchMovies() {

        final String URL = ApiController.getUrl(ApiController.TOP_MOVIES);

        String json = FetchData(URL);

        var movies = new Gson().fromJson(json, Movies.class);
        return movies.getMovies();
    }
}
