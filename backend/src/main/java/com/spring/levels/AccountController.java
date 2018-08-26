package com.spring.levels;

import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    private final AccountDao dao;

    

    @RequestMapping("/create")
    public String create(Integer AccNo, String firstName, String lastName){
        try{
            Account account = new Account(AccNo,firstName,lastName);
            dao.save(account);
        }
        catch (Exception ex){
            return "ERROR";
        }
        return "user added successfully";
    }

}
