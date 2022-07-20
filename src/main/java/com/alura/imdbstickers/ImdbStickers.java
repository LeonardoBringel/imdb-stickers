package com.alura.imdbstickers;

import com.alura.controller.ImdbApi;
import com.alura.model.Movie;
import java.util.List;

public class ImdbStickers {

    public static void main(String[] args) {
        List<Movie> movies = ImdbApi.FetchMovies();
        movies.forEach((var movie) -> System.out.println(movie.getTitle() + " (" + movie.getYear() + ")"));
    }
}
