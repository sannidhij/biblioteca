package com.twu28.biblioteca;

public class Book {

    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable;

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, int isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title= '" + title + '\'' +
                ", author= '" + author + '\'' +
                ", ISBN= " + isbn +
                ", Available= " + isAvailable +
                '}';
    }
}


