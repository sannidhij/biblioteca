package com.twu28.biblioteca;

/**
 * Author: sannidhi
 * Date: 9/15/12
 */
public class Application{

    static final String WELCOME_MESSAGE = "Welcome to Biblioteca!\n";

    public static void main(String[] args) {
        Console console = new Console();
        console.printMessage(WELCOME_MESSAGE);
        Menu menu = new Menu();
        menu.printMenu();


        //LibraryManager libraryManager = new LibraryManager();
        /*
        Book b = new Book();
        b.setIsbn("1");
        b.setAuthor("J.K.Rowling");
        b.setTitle("Harry Potter & the chamber of secrets");
        libraryManager.addBook(b);

        Customer c = new Customer();
        c.id = 1;
        c.name = "me";
        */
        int option = console.readInput();
        RequestHandler.handle(console, option);


    }
}
