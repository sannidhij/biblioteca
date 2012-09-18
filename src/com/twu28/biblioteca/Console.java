    package com.twu28.biblioteca;
    import java.util.Scanner;

    /**
     * Created with IntelliJ IDEA.
     * User: sannidhi
     * Date: 9/15/12
     **/

    public class Console {

        final String INVALID_OPTION_MESSAGE = "Select a valid option!!";
        static Scanner scanner;

        static {
            scanner = new Scanner(System.in);
        }

        public String printMessage (String message) {
            System.out.print(message);
            return message;
        }

        public int readOption() {
            while(true){
            try{
                return scanner.nextInt();
            }
            catch (Exception e){
                printMessage(INVALID_OPTION_MESSAGE);
            }
            }
        }

    }

