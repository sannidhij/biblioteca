package com.twu28.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class MenuOption {
    Integer id;
    String description;
    Map<Integer,String> menu = new HashMap<Integer, String>();

    public void addToMenu (Integer optionNumber, String description){
        this.id = optionNumber;
        this.description = description;
        menu.put(optionNumber,description);
    }

    public void printMenu () {
        for(Map.Entry<Integer,String> entry : menu.entrySet()){
            System.out.print(entry.getKey() +" : "+ entry.getValue());
        }
    }

    public void performAction (int option, Customer c){

        LibraryManager libraryManager = new LibraryManager();
        if(option >3 || option <1 ){
            System.out.println("Select a valid option!!");
        }
        if(option == 1) {
            libraryManager.viewInventory();
        }
        if(option==2)
            libraryManager.issueBook(1,c );
        else
            System.exit(0);



    }
}
