package com.twu28.biblioteca;

import java.util.Date;

public class Reservation {
    int callID;
    String userID;
    Date issueDate;
    Date returnDate;

    public Reservation(int callID, String userID, Date issueDate, Date returnDate) {
        this.callID = callID;
        this.userID = userID;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }


}
