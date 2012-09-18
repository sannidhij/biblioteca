package com.twu28.biblioteca;

/**
 * Author: sannidhi
 * Date: 9/15/12
 */
public class Application{

    static final String WELCOME_MESSAGE = "Welcome to Biblioteca!\n";
    //static final String MENU_OPTS = "Please select an option:\n1 View all books\n2 Reserve a book\n3 Exit Biblioteca";

    public static void main(String[] args) {
        Console console = new Console();
        console.printMessage(WELCOME_MESSAGE);
        MenuOption menuOption = new MenuOption();
        menuOption.addToMenu(1,"View all books\n");
        menuOption.addToMenu(2,"Reserve a book\n");
        menuOption.addToMenu(3,"Exit Biblioteca\n");

        menuOption.printMenu();

        LibraryManager libraryManager = new LibraryManager();
        Book b = new Book();
        b.setIsbn("1");
        b.setAuthor("J.K.Rowling");
        b.setTitle("Harry Potter & the chamber of secrets");
        libraryManager.addBook(b);

        Customer c = new Customer();
        c.id = 1;
        c.name = "me";int option = console.readOption();

        menuOption.performAction(option,c);


    }
}
