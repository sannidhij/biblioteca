package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class LibraryManager {

    private static  Map<Integer,Book> inventory = new HashMap<Integer, Book>();
    private Map<Integer,Customer> reservations = new HashMap<Integer, Customer>();
    private static int counterCallId = 0;

    public Integer addBook (Book book) {
        counterCallId++;
        inventory.put(counterCallId,book);
        return counterCallId;
    }

    public void viewInventory () {
        for(Map.Entry<Integer,Book> entry : inventory.entrySet()){
            System.out.print("Call Number: " +entry.getKey() +"\n"+ "ISBN: "+entry.getValue().getIsbn()
            +"\nTitle: "+entry.getValue().getTitle()+"\nAuthor: "+entry.getValue().getAuthor()+"\n");
        }
    }

    public String issueBook (Integer callId, Customer c) {
        if(reservations.containsKey(callId))
            return "Sorry we don't have that book yet.";
        else {
            reservations.put(callId,c);
            inventory.remove(inventory.get(callId));
            return "Thank You! Enjoy the book.";
        }

    }
}
