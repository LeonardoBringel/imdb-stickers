package com.alura.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Movies {

    @SerializedName(value = "items")
    private List<Movie> movies;

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
