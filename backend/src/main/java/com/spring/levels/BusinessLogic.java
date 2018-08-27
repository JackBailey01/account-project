package com.spring.levels;

import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BusinessLogic {
    @Autowired
    static AccountDao dao;
    public static void create(Integer AccNo, String firstName, String lastName){
        Account account = new Account(AccNo,firstName,lastName);
        dao.save(account);
    }
    public static void delete(Integer AccNo){
        Account account = dao.findAccountByAccNo(AccNo);
        dao.delete(account);

    }
    public static Account view(Integer AccNo){
        return dao.findAccountByAccNo(AccNo);
    }
}
