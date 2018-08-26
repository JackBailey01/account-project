package com.spring;

import com.spring.model.Account;
import com.spring.levels.Database;
import org.junit.Assert;
import org.junit.Test;


public class AppTest 
{

    @Test
    public void addandview(){
        Database database = new Database();
        Account account = new Account(0000,"Jack","Bailey");
        database.add(account);
        Account jack = database.find("Jack");
        Assert.assertEquals("Jack", jack.getFirstName());
        Assert.assertEquals("Bailey", jack.getLastName());
        Assert.assertEquals("0", jack.getAccNo());

    }
    @Test
    public void delete(){
        Database database = new Database();
        Account account = new Account(0000,"Jack","Bailey");
        database.add(account);
        database.delete("Jack");
        Account jack = database.find("Jack");
        Assert.assertEquals(null, jack.getFirstName());
    }
}
