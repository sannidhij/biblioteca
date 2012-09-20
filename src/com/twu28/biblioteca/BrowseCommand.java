package com.twu28.biblioteca;


import java.util.HashMap;
import java.util.Map;

public class BrowseCommand implements ICommand {

    public BrowseCommand() {

    }

    public void execute(Console console) {

        LibraryManager libraryManager = LibraryManager.getInstance(console);
        libraryManager.getInventory();
    }


}
