package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BibliotecaAppTest {

    @Test
    public void shouldSeeWelcomeMessage () {
        ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
         new BibliotecaApp().displayWelcomeMessage(printStream);
        Assert.assertEquals(BibliotecaApp.WELCOME_MESSAGE,consoleOutput.toString());
    }

}
