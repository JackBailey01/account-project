package com.qa.accapp;


public class Service {
    private Map<Integer, Account> accountlist;

    public Service{
        accountlist = new HashMap<>;
        int counter = 1;
    }

    public addToList(Account account){
        accountlist.put(counter, account);
        counter++;
    }

}