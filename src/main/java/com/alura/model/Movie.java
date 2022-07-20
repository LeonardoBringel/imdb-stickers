package com.alura.model;

import com.google.gson.annotations.SerializedName;

public class Movie {

    private String id;
    private int rank;
    private String title;
    private int year;
    private String image;
    private String crew;

    @SerializedName(value = "imDbRating")
    private double rating;

    @SerializedName(value = "imDbRatingCount")
    private int ratingCount;

    public void setId(String id) {
        this.id = id;
    }

    public void setRank(String rank) {
        this.rank = Integer.valueOf(rank);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = Integer.valueOf(year);
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setRating(String rating) {
        this.rating = Double.valueOf(rating);
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = Integer.valueOf(ratingCount);
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImage() {
        return image;
    }

    public String getCrew() {
        return crew;
    }

    public double getRating() {
        return rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }
}
