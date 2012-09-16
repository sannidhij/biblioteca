package com.twu28.biblioteca;

/**
 * Author: sannidhi
 * Date: 9/15/12
 */
public class Application{

    static final String WELCOME_MESSAGE = "Welcome to Biblioteca!\n";
    static final String MENU_OPTS = "Please select an option:\n1 View all books\n2 Reserve a book\n3 Exit Biblioteca";

    public static void main(String[] args) {
        Console console = new Console();
        console.printMessage(WELCOME_MESSAGE);
        console.printMessage(MENU_OPTS);

        int option = console.readOption();


    }
}
