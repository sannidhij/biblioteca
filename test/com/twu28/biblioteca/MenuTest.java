package com.twu28.biblioteca;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import junit.framework.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class MenuTest {

    @Test
    public void shouldDisplayOptions() {

        ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        new Menu().displayOptions(printStream);
        Assert.assertEquals(Menu.menu.toString(),consoleOutput.toString());

    }

//    @Test
//    public void canSelectOption() {
//
//        int ReturnedValue = new Menu().selectMenuOption(1);
//
//        Assert.assertEquals(1,ReturnedValue);
//
//    }

    @Test
    public void willNotifySelectValidOption() {

         InputStream inputStream;

        Assert.assertEquals("Select valid option!", new Menu().selectMenuOption(inputStream)) ;
    }
}
