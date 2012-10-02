package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.mockito.MockitoAnnotations.initMocks;

public class BibliotecaAppTest {

    @Mock
    BufferedReader bufferedReader;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void shouldSeeWelcomeMessage() {
        ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
         new BibliotecaApp().displayWelcomeMessage(printStream);
        Assert.assertEquals(BibliotecaApp.WELCOME_MESSAGE,consoleOutput.toString());
    }

    @Test
    public void shouldNotifyInvalidOption() {

    }



}
