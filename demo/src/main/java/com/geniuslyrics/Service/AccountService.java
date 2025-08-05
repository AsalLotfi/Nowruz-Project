package com.geniuslyrics.Service;

import com.geniuslyrics.Account.Account;
import com.geniuslyrics.Account.User;

import java.util.List;
import java.util.Objects;

public class AccountService {

    // Sign-up logic: Add new account if username is unique
    public boolean signUp(List<Account> accounts, User newUser) {
        for (Account acc : accounts) {
            if (Objects.equals(acc.getUsername(), newUser.getUsername())) {
                System.out.println("Username already exists!");
                return false; // Username already exists
            }
        }
        accounts.add(newUser);
        return true;
    }

    // Login logic: Return matching account or null if failed
    public Account login(List<Account> accounts, String username, String password) {
        for (Account acc : accounts) {
            if (Objects.equals(acc.getUsername(), username) &&
                    Objects.equals(acc.getPassword(), password)) {
                return acc;
            }
        }
        return null; // Login failed
    }
}
