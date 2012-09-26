package com.twu28.biblioteca;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static final String MENU_OPTIONS = "Menu";

    public static List<String> menu = new ArrayList<String>();

    public Menu() {
        menu.add("Exit");
        menu.add("Browse");
    }

    public void displayOptions(PrintStream printStream) {

        //for (int i = 0; i<menu.size(); i++)
        printStream.print(menu.toString());
    }

    public int selectMenuOption(int optionNumber) {
        return 1;

    }
}
