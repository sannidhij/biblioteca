package com.twu28.biblioteca;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.channels.ReadableByteChannel;

public class Console {

    private PrintStream printStream;
    private ByteArrayOutputStream byteArrayOutputStream;

//    ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
//    PrintStream printStream = new PrintStream(consoleOutput);
//    Console console = new Console(printStream);

    public Console() {
        this.byteArrayOutputStream = new ByteArrayOutputStream();
        this.printStream = new PrintStream(byteArrayOutputStream);
    }

    public void print(String message) {
        printStream.print(message);
    }

    public String getConsoleOutput() {
        return byteArrayOutputStream.toString();
    }


}
