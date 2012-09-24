package com.twu28.biblioteca;

public class ReservationCommand implements ICommand {

    private Book book;
    private Customer customer;
    private Console console;
    private Inventory inventory = new Inventory();
    private Reservation reservation;


    private String ENTER_ISBN = "Please enter the ISBN number of the book/movie you wish to reserve\n";

    public ReservationCommand() {
    }

    public ReservationCommand(Inventory inventory, Console console) {
        this.inventory = inventory;
        this.console = console;
    }

    public void execute(Console console) {
        LibraryManager libraryManager = LibraryManager.getInstance(console);
        libraryManager.getInventory();
        console.printMessage(ENTER_ISBN);

        int isbn = console.readInteger();

        console.printMessage(reserveBook(isbn));

    }

    public String reserveBook(int isbn) {

        String CONSOLE_MESSAGE = "";
        Book book = inventory.getBook(isbn);

        if (book == null)
            CONSOLE_MESSAGE = "Sorry we don't have that book yet.";
        else if (book.getAvailable() == false) {
            CONSOLE_MESSAGE = "This book is currently not available.";
        } else if (book.getAvailable() == true) {
            book.setAvailable(false);
            CONSOLE_MESSAGE = "Thank You! Enjoy the book.";
        }
        return CONSOLE_MESSAGE;
    }
}

