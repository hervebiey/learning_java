package com.imanuwel.oops;

import java.util.ArrayList;

public class Book {
    private final ArrayList<Review> reviews = new ArrayList<Review>();
    private final int id;
    private final String name;
    private final String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format("id - %d, name - %s, author - %s, Reviews = [%s]", id, name, author, reviews);
    }
}
