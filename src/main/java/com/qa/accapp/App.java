package com.qa.accapp;


public class App 
{
    public static void main( String[] args )
    {
        Service list = new Service();
        Account Jack = new Account("Jack","Bailey",0000);
        Account Ash = new Account("Jack","Bailey",0001);
        System.out.println( "Hello World to the standard out" );
        list.addToList(Jack);
        list.addToList(Ash);
        System.out.println(list.get(1));
    }
}
