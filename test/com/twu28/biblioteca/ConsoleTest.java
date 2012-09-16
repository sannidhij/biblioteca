package com.twu28.biblioteca;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: sannidhi
 * Date: 9/13/12
 */

public class ConsoleTest extends TestCase{

    @Test
    public void printTest () {
        Console console = new Console();
        String expectedString = "Hi!";
        Assert.assertEquals(expectedString,console.printMessage("Hi!"));
    }

}

