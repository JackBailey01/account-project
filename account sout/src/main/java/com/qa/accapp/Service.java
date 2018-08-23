package com.qa.accapp;

import java.util.HashMap;
import java.util.Map;

public class Service {
    private int counter = 1;
    private Map<Integer, Account> accountlist;

    public Service(){
        accountlist = new HashMap();
    }

    public void addToList(Account account){
        accountlist.put(counter, account);
        counter++;
    }

    @Override
    public String toString() {
        return accountlist.values().toString();
    }
}