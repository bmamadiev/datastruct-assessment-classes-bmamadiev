package com.kenzie.app;

import java.util.HashMap;
import java.util.Locale;

public class Account {
    //create class instance variables here
    private String userName;
    private String accountId;
    private double balance;

    //implement the following class constructors
    public Account(String userName) {
        this.userName = userName;
        this.accountId = userName.substring(0, 3).toLowerCase() + (int) Math.floor(100000 + Math.random() * 899999);
    }

    public Account(String userName, String accountId) {
        this.userName = userName;
        this.accountId = accountId;
    }

    public Account(String userName, String accountId, double balance) {
        this.userName = userName;
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getUserName() {
        // return the user name of the current account
        return this.userName;
    }

    public String getAccountId() {
        // return the account id fo the current account
        return this.accountId;
    }

    public double getBalance() {
        // return the current balance of the account
        return this.balance;
    }

    public void makeDeposit(double amount) {
        // Add the given amount to the balance of the account
        balance += amount;

    }

    public double makeWithdrawal(double amount) {
        // If the account has enough money, then withdraw the given amount
        // If the account does not have enough money, then return 0 and do not modify the balance
        if (balance > 0) {
            balance -= amount;
        } else if (balance == 0) {
            balance = 0;
        }
        return amount;
    }
}