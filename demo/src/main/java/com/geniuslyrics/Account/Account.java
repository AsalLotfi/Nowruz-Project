package com.geniuslyrics.Account;

public abstract class Account {
    private String username;
    private int password;
    private String name;
    private int age;
    private String email;

    public Account(String username, int password, String name, int age, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
}