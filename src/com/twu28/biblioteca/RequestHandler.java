package com.twu28.biblioteca;

import java.util.HashMap;

public class RequestHandler {

    private static HashMap<Integer, ICommand> actions = new HashMap<Integer, ICommand>();
    static  {
        actions.put(1, new BrowseCommand());
        actions.put(2, new ReservationCommand());

    }

    public static void handle(Console console, int option) {
        ICommand action = actions.get(option);
        action.execute(console);
    }
}
