package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    class BookRecord {
        int callNo;
        String isbn;
        boolean isAvailable;

        BookRecord(int callNo, String isbn) {
            this.callNo = callNo;
            this.isbn = isbn;
            this.isAvailable = true;
        }
    }

    HashMap<Integer, BookRecord> inventory = new HashMap<Integer, BookRecord>();

    public boolean addBook(int callNo, Book book) {
        try {
            BookRecord record = new BookRecord(callNo, book.getIsbn());
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
}
