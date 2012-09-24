package com.twu28.biblioteca;

import java.util.HashMap;

public class RequestHandler {

    private static HashMap<Integer, ICommand> actions = new HashMap<Integer, ICommand>();
    static final String INVALID_OPTION_MESSAGE = "Select a valid option!!\n";

    static {
        actions.put(0, new QuitApplication());
        actions.put(1, new BrowseCommand());
        actions.put(2, new ReservationCommand());
    }

    public static void handle(Console console, int option) {
        ICommand action = actions.get(option);
        if (action == null) {
            console.printMessage(INVALID_OPTION_MESSAGE);
            return;
        }
        action.execute(console);
    }
}
