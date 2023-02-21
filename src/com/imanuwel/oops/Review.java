package com.imanuwel.oops;

public class Review {
    private final int id;
    private final String description;
    private final int rating;

    public Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return id + " " + description + " " + rating;
    }
}
