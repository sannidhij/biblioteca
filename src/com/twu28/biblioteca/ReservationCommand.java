package com.twu28.biblioteca;

import java.util.HashMap;

public class ReservationCommand implements ICommand {

    private Book book;
    private Customer customer;
    private Console console;
    private Inventory inventory;
    private Reservation reservation;


    private String ENTER_CALL_NUMBER = "Please enter the call number of the book/movie you wish to reserve";

    public ReservationCommand() {
    }

    public ReservationCommand(Customer customer, Inventory inventory, Console console, Reservation reservation) {
        this.customer = customer;
        this.inventory = inventory;
        this.console = console;
        this.reservation = reservation;
    }

    public void execute(Console console) {
        LibraryManager libraryManager = LibraryManager.getInstance(console);
        libraryManager.getInventory();
        console.printMessage(ENTER_CALL_NUMBER);

        int callNumber = console.readInput();
        BookRecord record = inventory.getRecord(callNumber);
        if(record == null)
            console.printMessage("Sorry we don't have that book yet.");
        else if (record.isAvailable == false) {
            console.printMessage("This book is currently not available.");
        }
        else {
              //console.readInput();
              System.out.println("Thank You! Enjoy the book.");

            }

        }
    }

