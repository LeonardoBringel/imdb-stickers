package com.alura.imdbstickers;

import com.alura.controller.ImdbApi;

public class ImdbStickers {

    public static void main(String[] args) {
        var movies = ImdbApi.FetchMovies();
        System.out.println(movies);
    }
}
