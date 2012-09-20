package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    Map<Integer,String> menu;

    public Menu() {
        this.menu = new HashMap<Integer, String>();
        this.addToMenu(1,"View all books\n");
        this.addToMenu(2,"Reserve a book\n");
        this.addToMenu(3,"Exit Biblioteca\n");
    }

    public void addToMenu (Integer optionNumber, String description){
        menu.put(optionNumber,description);
    }

    public void printMenu () {
        for(Map.Entry<Integer,String> entry : menu.entrySet()){
            System.out.print(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
