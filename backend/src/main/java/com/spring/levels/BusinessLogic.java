package com.spring.levels;
import com.spring.model.Account;
import com.spring.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BusinessLogic implements BusinessService{

    @Autowired
    private AccountRepository dao;

    public void create(String firstName, String lastName){
        Account account = new Account();
        account.setFirstName(firstName);
        account.setLastName(lastName);
        dao.save(account);
    }
    public void delete(Integer accNo){
        Account account = dao.getById(accNo);
        dao.delete(account);
    }
    public Account view(Integer accNo){
        Account account = dao.getById(accNo);
        return account;

    }
    public void update(Integer accNo,String firstName, String lastName){
        Account account = dao.getById(accNo);
        account.setFirstName(firstName);
        account.setLastName(lastName);
        dao.save(account);
    }

    public List<Account> getAllAccounts(){
        List<Account> accounts = dao.getAllAccounts();
        return accounts;
    }

}
