package com.alura.imdbstickers;

import com.alura.controller.ImdbApi;
import com.alura.model.Movie;
import com.alura.model.Sticker;
import java.util.List;

public class ImdbStickers {

    public static void main(String[] args) {
        List<Movie> movies = ImdbApi.FetchMovies();
        movies.forEach((var movie) -> System.out.println(movie.getTitle() + " (" + movie.getYear() + ")" + " - " + movie.getImage()));

        var walleUrl = "https://m.media-amazon.com/images/M/MV5BMjExMTg5OTU0NF5BMl5BanBnXkFtZTcwMjMxMzMzMw@@.jpg";

        var rating = 5;
        new Sticker(walleUrl, rating).generate();
    }
}
