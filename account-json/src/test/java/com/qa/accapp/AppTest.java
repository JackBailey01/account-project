package com.qa.accapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AppTest 
{
  
    @Test
    public void nameCount()
    {
        Service service = new Service();
        long num = service.count("Jack");
        assertEquals(0, num);
    }
}
