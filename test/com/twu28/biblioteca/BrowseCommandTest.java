package com.twu28.biblioteca;

import junit.framework.TestCase;

import junit.framework.Assert;
import org.junit.Test;

public class BrowseCommandTest {

    @Test
    public void executeTest() {

        Console console = new Console();

        Inventory inventory = new Inventory();

        String expectedResult = "Book{title= 'Harry Potter and the Deathly Hallows', author= 'JK Rowling', ISBN= '1'}\n" +
                "Book{title= 'Harry Potter and the Chamber of Secrets', author= 'JK Rowling', ISBN= '2'}\n" +
                "Book{title= 'Lord of the Rings', author= 'JRR Tolkien', ISBN= '3'}\n" +
                "Book{title= 'Kite Runner', author= 'Khaled Hosseini', ISBN= '4'}\n";

        String actualResult = inventory.browseInventory();

        Assert.assertEquals(expectedResult, actualResult);

    }
}

