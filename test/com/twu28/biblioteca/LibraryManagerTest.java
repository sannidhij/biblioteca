package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class LibraryManagerTest {

    @Test
    public void shouldDisplayAllBooks() {
        Console console = new Console();
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addBook(new Book("1","ABC","ABC","ABC"));
        libraryManager.displayAllBooks(console);
        Assert.assertEquals(libraryManager.getAllBooks().toString(),console.getConsoleOutput());
    }

    @Test
    public void shouldAddNewBook() {
        Book book = new Book("1","ABC","ABC","ABC");
        Assert.assertTrue(new LibraryManager().addBook(book));
    }

    @Test
    public void shouldBeAbleToCheckIsBookAvailable() {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addBook(new Book("1", "ABC", "ABC", "ABC"));
        Console console = new Console();

        Assert.assertTrue(libraryManager.isBookAvailable("1",console));

    }

    @Test
    public void shouldBeAbleToReserveBook() {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addBook(new Book("1", "ABC", "ABC", "ABC"));
        Console console = new Console();
        libraryManager.checkOutBook("1",console);
        Assert.assertFalse(libraryManager.isBookAvailable("1",console));
    }

    @Test
    public void shouldNotifyUserIfBookWasReserved() {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addBook(new Book("1", "ABC", "ABC", "ABC"));
        Console console = new Console();
        libraryManager.checkOutBook("1",console);
        Assert.assertEquals(LibraryManager.RESERVATION_SUCCESSFUL,console.getConsoleOutput());
    }

    @Test
    public void shouldThrowBookNotFoundException() {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addBook(new Book("1", "ABC", "ABC", "ABC"));
        Console console = new Console();
        libraryManager.checkOutBook("2",console);
        Assert.assertEquals("Book not found",console.getConsoleOutput());
    }

}
