package com.twu28.biblioteca;


import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;


public class Menu {

    public static final String MENU_OPTIONS = "Menu";
    public static final String INVALID_TYPE_MESSAGE = "Select a valid type!";

    public static List<String> menu = new ArrayList<String>();

    public Menu() {
        menu.add("Exit");
        menu.add("Browse");
    }

    public void displayOptions(Console console) {

        //for (int i = 0; i<menu.size(); i++)
        console.print(menu.toString());
    }

    public void selectMenuOption(String input, Console console) {
        try{
        int option = Integer.parseInt(input);
            RequestHandler.handle(console,option);
        }
        catch (Exception exception){
            console.print("Select a valid type!");
        }
    }
}
