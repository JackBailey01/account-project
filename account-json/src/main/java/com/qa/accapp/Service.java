package com.qa.accapp;

import com.google.gson.Gson;

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

    public String convertToJson(Service list){
        Gson gson = new Gson();
        String gsonString = gson.toJson(list);
        return gsonString;
    }

    public long count(String name) {		
	return accountlist.values().stream().filter(v -> v.getFirstname().equals(name)).count();	
	}


}