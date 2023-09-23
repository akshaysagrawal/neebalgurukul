package com.neebal.practicespringcore.entities;

public class Movie {

    private String title;

    private String description;

    private int ratings;

    public Movie(String title, String description, int ratings) {
        this.title = title;
        this.description = description;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
