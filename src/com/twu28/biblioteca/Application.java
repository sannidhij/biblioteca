package com.twu28.biblioteca;

public class Application {

    static final String WELCOME_MESSAGE = "Welcome to Biblioteca!\n";


    public static void main(String[] args) {
        Console console = new Console();
        console.printMessage(WELCOME_MESSAGE);
        Menu menu = new Menu();
        menu.printMenu();

        int option = console.readInteger();


        while (true) {
            RequestHandler.handle(console, option);
            option = console.readInteger();
        }

    }
}
