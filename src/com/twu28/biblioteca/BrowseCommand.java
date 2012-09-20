package com.twu28.biblioteca;


import java.util.HashMap;
import java.util.Map;

public class BrowseCommand implements ICommand {

    public BrowseCommand() {

    }

    public void execute() {

        LibraryManager libraryManager = new LibraryManager();
        Inventory bookInventory = LibraryManager.getInventory();
        String list = bookInventory.browseInventory();

    }


}
