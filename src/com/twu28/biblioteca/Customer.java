package com.twu28.biblioteca;

public class Customer {

    String username;
    String name;
    String password;

    public Customer(String username, String name, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public boolean verifyAccount(String username, String password) {
        return true;
    }
}
