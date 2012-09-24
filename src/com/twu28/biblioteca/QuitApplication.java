package com.twu28.biblioteca;

public class QuitApplication implements ICommand {


    public QuitApplication() {
    }

    public void execute(Console console) {
        System.exit(0);
    }
}

