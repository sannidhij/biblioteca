package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class ConsoleTest extends TestCase {

    @Test
    public void printTest() {
        Console console = new Console();
        String expectedString = "Hi!";
        Assert.assertEquals(expectedString, console.printMessage("Hi!"));
    }

}

