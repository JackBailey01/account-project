package com.qa.accapp;

public class App {
	private App() {
	}
    public static void main( String[] args )
    {
    	Service list = new Service();
        Account Jack = new Account("Jack","Bailey",0000);
        Account Oli = new Account("Oli","Lambert",0001);
        list.addToList(Jack);
        list.addToList(Oli);
        String list2 = list.convertToJson(list);
        System.out.println(list2);
        long num = list.count("Jack");
        System.out.println(num);
    }
}
