package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {


    private List<Book> allBooks = new ArrayList<Book>();
    public final static String RESERVATION_SUCCESSFUL = "Thank You! Enjoy the book.";

    public void displayAllBooks(Console console) {
        console.print(allBooks.toString());
    }

    public boolean addBook(Book book) {
        allBooks.add(book);
        return true;
    }

    public boolean isBookAvailable(String isbn,Console console) {
        Book book = null;
        try {
            book = getBook(isbn);
        } catch (BookNotFoundException e) {
            console.print("Book not found");
        }
        if (book!= null && book.getISBN().equals(isbn)) {
            return (book.isAvailable());
        }
        return false;
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public void checkOutBook(String isbn,Console console) {

        Book book = null;
        try {
            book = getBook(isbn);
        } catch (BookNotFoundException e) {
            console.print("Book not found");
        }
        if (book!=null && isBookAvailable(isbn,console)) {
            book.setAvailable(false);
            console.print("Thank you! Enjoy!");
        }
    }

    public Book getBook(String isbn) throws BookNotFoundException{
        for (Book book : allBooks) {
            if (book.getISBN().equals(isbn))
                return book;
        }
        throw new BookNotFoundException();
    }
}
