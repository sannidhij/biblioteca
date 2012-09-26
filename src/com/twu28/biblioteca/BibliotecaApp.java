package com.twu28.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    public static final String WELCOME_MESSAGE= "Welcome to Biblioteca";

    public void displayWelcomeMessage (PrintStream printStream) {

        printStream.print(WELCOME_MESSAGE);
    }
}
