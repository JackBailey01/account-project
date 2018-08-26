package com.spring.levels;

import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountController {
    @Autowired
    AccountDao dao;
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
    public String delete(Integer AccNo){
        try{
            Account account = dao.findAccountByAccNo(AccNo);
            dao.delete(account);
        }
        catch (Exception ex){
            return "ERROR";
        }
        return "user added successfully";
    }
    public Account view(Integer AccNo){
        try{
            Account account = dao.findAccountByAccNo(AccNo);
            return account;
        }
        catch (Exception ex){
        }
    }
}
