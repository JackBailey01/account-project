package com.spring.levels;
import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BusinessLogic {

    @Autowired
    private AccountDao dao;

    public void create(Integer AccNo, String firstName, String lastName){
        Account account = new Account();
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setAccNo(AccNo);
        dao.createAccount(account);
    }
    /*public static void delete(Integer AccNo){
        Account error = new Account(0, "error","error");
        Account account = dao.findById(AccNo).orElse(error);;
        dao.delete(account);

    }*/
    public Account view(Integer id){
        Account account = dao.getAccount(id);
        return account;

    }

}
