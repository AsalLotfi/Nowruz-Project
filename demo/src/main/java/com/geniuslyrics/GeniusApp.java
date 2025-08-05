package com.geniuslyrics;

import com.geniuslyrics.Account.Account;
import com.geniuslyrics.Service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class GeniusApp {
    private List<Account> accounts;
    private Account currentUser;
    private AccountService service;

    public GeniusApp() {
        accounts = new ArrayList<>();
        service = new AccountService();
    }

    public void login(String username, String password) {
        currentUser = service.login(accounts, username, password);
        if (currentUser != null) {
            System.out.println("Welcome " + currentUser.getUsername());
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void logout() {
        if (currentUser != null) {
            System.out.println("Logged out: " + currentUser.getUsername());
            currentUser = null;
        }
    }

    public void run() {
        // The menu loop goes here
    }
}
