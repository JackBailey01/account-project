package com.qa.accapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AppTest 
{
  
    @Test
    public void nameCount()
    {
        Service service = new Service();
        int num = service.count("Jack");
        assertEquals(2, num);
    }
}
