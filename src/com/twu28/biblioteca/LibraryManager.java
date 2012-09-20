package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class LibraryManager {

    private static Inventory inventory;
    private static int callId = 0;

    public Integer addBook (Book book) {
        callId++;
        inventory.addBook(callId, book);
        return callId;
    }

    public static Inventory getInventory() {
        return inventory;
    }

    public void viewInventory () {
//        for(Map.Entry<Integer,Book> entry : inventory.entrySet()){
//            System.out.print("Call Number: " +entry.getKey() +"\n"+ "ISBN: "+entry.getValue().getIsbn()
//            +"\nTitle: "+entry.getValue().getTitle()+"\nAuthor: "+entry.getValue().getAuthor()+"\n");
//        }
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
