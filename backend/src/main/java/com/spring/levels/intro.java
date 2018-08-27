package com.spring.levels;
import com.spring.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("accounts")
public class intro{
    @Autowired
    private BusinessLogic service;


    @GetMapping("view/{id}")
    public ResponseEntity<Account> viewAccount(@PathVariable("id") Integer id){
        Account account = service.view(id);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

    @PostMapping("create/{AccNo}/{firstName}/{lastName}")
    public void createAccount(@PathVariable("AccNo") Integer AccNo, @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        service.create(AccNo, firstName,lastName);
    }


}
