package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {

    List<Book> inventory;

    public Inventory() {
        this.inventory = new ArrayList<Book>();
        this.addBook(new Book("Harry Potter and the Deathly Hallows", "JK Rowling", 1, true));
        this.addBook(new Book("Harry Potter and the Chamber of Secrets", "JK Rowling", 2, true));
        this.addBook(new Book("Lord of the Rings", "JRR Tolkien", 3, true));
        this.addBook(new Book("Kite Runner", "Khaled Hosseini", 4, true));
    }

    public void addBook(Book book) {
        try {
            inventory.add(book);
        } catch (Exception error) {
            System.out.print(error);
        }
    }

    public void setAvailable(Book book) {
        book.setAvailable(true);
    }

    public void setUnavailable(Book book) {
        book.setAvailable(true);
    }

    public String browseInventory() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inventory.size(); i++) {
            Book book = inventory.get(i);
            sb.append(book);
            sb.append("\n");
        }
        return sb.toString();
    }

    public Book getBook(int isbn) {
        for (int i = 0; i < inventory.size(); i++) {
            Book book = inventory.get(i);
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        {
            return null;
        }
    }
}

