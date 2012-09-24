package com.twu28.biblioteca;

import java.util.Map;

public class LibraryManager {

    private static LibraryManager instance;
    private Inventory inventory;
    private Console console;

    private LibraryManager(Console console) {
        this.inventory = new Inventory();
        this.console = console;
    }

    public static LibraryManager getInstance(Console console) {
        if (instance == null) {
            instance = new LibraryManager(console);
        }
        return instance;
    }

    public void addBook(Book book) {
        inventory.addBook(book);
    }

    public void getInventory() {
        console.printMessage(inventory.browseInventory() + "\n");
    }
}
