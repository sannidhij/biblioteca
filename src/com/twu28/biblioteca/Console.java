package com.twu28.biblioteca;

import java.util.Scanner;

public class Console {

    final String INVALID_OPTION_MESSAGE = "Select a valid option!!";
    final String INVALID_STRING_ENTERED = "Enter in the correct format!";
    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public String printMessage(String message) {
        System.out.print(message);
        return message;
    }

    public int readInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception InvalidOption) {
                printMessage(INVALID_OPTION_MESSAGE);
            }
        }
    }

    public String readString() {
        while (true) {
            try {
                return scanner.next();
            } catch (Exception e) {
                printMessage(INVALID_OPTION_MESSAGE);
            }
        }
    }

}

