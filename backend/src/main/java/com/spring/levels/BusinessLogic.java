package com.spring.levels;
import com.spring.model.Account;
import com.spring.model.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;

@Service
public class BusinessLogic {
    @Autowired
    static AccountDao dao;
    public static void create(Integer AccNo, String firstName, String lastName){
        Account account = new Account(AccNo,firstName,lastName);
        Account account2 = new Account(1,"Oli","Lambert");
        dao.save(account2);
    }
    public static void delete(Integer AccNo){
        Account error = new Account(0, "error","error");
        Account account = dao.findById(AccNo).orElse(error);;
        dao.delete(account);

    }
    public static Account view(Integer id){
        Account error = new Account(0, "error","error");
        Account account = dao.findById(id).orElse(error);
        return account;

    }
    public static String convertToJson(Account account){
        Gson gson = new Gson();
        String gsonString = gson.toJson(account);
        return gsonString;
    }
}
