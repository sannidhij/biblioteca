package com.twu28.biblioteca;

public class Book {

    private String ISBN;
    private String name;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String ISBN, String name, String title, String author) {
        this.ISBN = ISBN;
        this.name = name;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
