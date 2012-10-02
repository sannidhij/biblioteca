package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class MenuTest {

    @Test
    public void shouldDisplayOptions() {
        Console console = new Console();
        new Menu().displayOptions(console);
        Assert.assertEquals(Menu.menu.toString(),console.getConsoleOutput());

    }

    @Test
    public void canSelectOption() {

    }

    @Test
    public void shouldNotifyInvalidValidInput() {
        String testUserInput = "BLAH";
        Console console = new Console();
        new Menu().selectMenuOption(testUserInput, console);
        Assert.assertEquals(Menu.INVALID_TYPE_MESSAGE,console.getConsoleOutput());
    }

    @Test
    public void shouldNotifyInvalidOption() {
        String testUserInput = "-1";
        Console console = new Console();
        new Menu().selectMenuOption(testUserInput,console);
        Assert.assertEquals(RequestHandler.INVALID_OPTION_MESSAGE,console.getConsoleOutput());
    }
}
