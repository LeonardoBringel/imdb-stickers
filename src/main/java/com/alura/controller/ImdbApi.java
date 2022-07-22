package com.alura.controller;

import com.alura.model.Movie;
import com.alura.model.Movies;
import com.google.gson.Gson;
import java.util.List;

public abstract class ImdbApi {

    public static List<Movie> FetchMovies() {

        final String URL = ApiController.getUrl(ApiController.TOP_MOVIES);

        String json = Client.FetchData(URL);

        var movies = new Gson().fromJson(json, Movies.class);
        return movies.getMovies();
    }
}
