package com.spring.levels;

import com.spring.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController("/accounts")
public class intro {

    @RequestMapping(value = "/view/{AccNo}", method = RequestMethod.GET)
    public Account viewAccount(@PathVariable Integer AccNo){
        return BusinessLogic.view(AccNo);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void viewAccount(@PathVariable Integer AccNo, @PathVariable String firstName, @PathVariable String lastName){
        BusinessLogic.create(AccNo, firstName,lastName);
    }


}
