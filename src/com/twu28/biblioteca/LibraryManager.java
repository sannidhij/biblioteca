package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class LibraryManager {

    private static LibraryManager instance;
    private static int callId = 0;
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

    public Integer addBook (Book book) {
        callId++;
        inventory.addBook(callId, book);
        return callId;
    }

    public void getInventory() {
        for (Map.Entry<Integer, BookRecord> record: inventory.inventory.entrySet()) {
            console.printMessage(record.toString() + "\n");
        }
    }

//    public String issueBook (Integer callId, Customer c) {
//        if(reservations.containsKey(callId))
//            return "Sorry we don't have that book yet.";
//        else {
//            reservations.put(callId,c);
//            inventory.remove(inventory.get(callId));
//            return "Thank You! Enjoy the book.";
//        }

}
