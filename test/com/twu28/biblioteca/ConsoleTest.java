package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class ConsoleTest {

        @Test
        public void shouldDisplayOptions() {
            String userTestInput = "BLAH";
            Console console = new Console();
            console.print(userTestInput);
            Assert.assertEquals(userTestInput,console.getConsoleOutput());
        }
}
