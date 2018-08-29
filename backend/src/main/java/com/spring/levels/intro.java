package com.spring.levels;
import com.spring.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accounts")
public class intro{

    @Autowired
    private BusinessService service;


    @GetMapping("view/{accNo}")
    public ResponseEntity<Account> viewAccount(@PathVariable("accNo") Integer accNo){
        Account account = service.view(accNo);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @GetMapping("viewAll")
    public ResponseEntity<List<Account>> viewAll(){
        List<Account> accounts = service.getAllAccounts();
        return new ResponseEntity<>(accounts,HttpStatus.OK);
    }


    @PostMapping("create/{firstName}/{lastName}")
    public ResponseEntity<String> createAccount(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        service.create(firstName,lastName);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }
    @DeleteMapping("delete/{accNo}")
    public ResponseEntity<String> delete(@PathVariable("accNo") Integer AccNo){
        service.delete(AccNo);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @PutMapping("Update/{accNo}/{firstName}/{lastName}")
    public ResponseEntity<String> updateAccount(@PathVariable("accNo") Integer accNo, @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        service.update(accNo,firstName,lastName);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

}
