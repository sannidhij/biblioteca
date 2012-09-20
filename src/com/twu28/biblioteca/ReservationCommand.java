package com.twu28.biblioteca;

import java.util.HashMap;

public class ReservationCommand implements ICommand {

    private Book book;
    private Customer customer;
    private Console console;
    private HashMap<Integer,Book> inventory;
    private HashMap<Integer,Book> reservation;


    private String ENTER_CALL_NUMBER = "Please enter the call number of the book/movie you wish to reserve";

    public ReservationCommand() {
    }

    public ReservationCommand(Customer customer, HashMap<Integer,Book> inventory, Console console, HashMap reservation) {
        this.customer = customer;
        this.inventory = inventory;
        this.console = console;
        this.reservation = reservation;
    }

    public void execute() {

        console.printMessage(ENTER_CALL_NUMBER);

        int callNumber = console.readInput();
        if(inventory.get(callNumber)== null)
            System.out.print("Sorry we don't have that book yet.");
        else {
            reservation.put(callNumber,book);
            System.out.println("Thank You! Enjoy the book.");

        }




    }
}
