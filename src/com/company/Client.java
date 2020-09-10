package com.company;

import java.util.ArrayList;

public class Client {
    public String firstName;
    public String lastName;
    public ArrayList <CheckingAccount> checkingAccounts = new ArrayList<>();
    public ArrayList <SavingsAccount> savingsAccounts = new ArrayList<>();


    public void addAccount(CheckingAccount account){
        checkingAccounts.add(account);
    }

    public void addAccount(SavingsAccount account){
        savingsAccounts.add(account);
    }
}
