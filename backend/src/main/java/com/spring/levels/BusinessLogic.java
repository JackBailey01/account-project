package com.spring.levels;
import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BusinessLogic implements BusinessService{

    @Autowired
    private AccountDao dao;

    public void create(Integer AccNo, String firstName, String lastName){
        Account account = new Account();
        account.setFirstName(firstName);
        account.setLastName(lastName);
        account.setAccNo(AccNo);
        dao.save(account);
    }
    public void delete(Integer AccNo){
        Account account = dao.getByID(AccNo);
        dao.delete(account);

    }
    public Account view(Integer id){
        Account account = dao.getByID(id);
        return account;

    }

}
