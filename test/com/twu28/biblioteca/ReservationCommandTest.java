package com.twu28.biblioteca;

import org.junit.Test;
import junit.framework.Assert;

public class ReservationCommandTest {

    @Test
    public void executeTestBookAvailable() {
        Console console = new Console();
        Inventory inventory = new Inventory();
        ReservationCommand reservationCommand = new ReservationCommand(inventory, console);
        int isbn = 1;

        String expectedResult = "Thank You! Enjoy the book.";

        String actualResult = reservationCommand.reserveBook(isbn);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void executeTestBookNotAvailable() {
        Console console = new Console();
        Inventory inventory = new Inventory();
        ReservationCommand reservationCommand = new ReservationCommand(inventory, console);
        int isbn = 1;

        String expectedResult = "This book is currently not available.";
        reservationCommand.reserveBook(isbn);
        String actualResult = reservationCommand.reserveBook(isbn);

        Assert.assertEquals(expectedResult, actualResult);
    }
}

