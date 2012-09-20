package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    HashMap<Integer, BookRecord> inventory;
    public Inventory() {
        this.inventory = new HashMap<Integer, BookRecord>();
        this.addBook(1, new Book("Harry Potter and the Deathly Hallows", "JK Rowling", "1"));
        this.addBook(2, new Book("Harry Potter and the Deathly Hallows", "JK Rowling", "1"));
        this.addBook(3, new Book("Lord of the Rings", "JRR Tolkien", "2"));
        this.addBook(4, new Book("Kite Runner", "Khaled Hosseini", "3"));
    }

    public boolean addBook(int callNo, Book book) {
        try {
            BookRecord record = new BookRecord(callNo, book);
            inventory.put(record.callNo, record);
        } catch (Exception err) {
            return false;
        }
        return true;
    }

    public void setAvailable(int callNo) {
        BookRecord bookRecord = inventory.get(callNo);
        bookRecord.isAvailable = true;
        inventory.put(callNo, bookRecord);
    }

    public void setUnavailable(int callNo) {
        BookRecord bookRecord = inventory.get(callNo);
        bookRecord.isAvailable = false;
        inventory.put(callNo, bookRecord);
    }

    public String browseInventory() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, BookRecord> record: inventory.entrySet()) {
            sb.append(record.toString());
            sb.append("\n");
        }
        return sb.toString();

    }

    public BookRecord getRecord (int callNumber){
        return inventory.get(callNumber);
    }
}
