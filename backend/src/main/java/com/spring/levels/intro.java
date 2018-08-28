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
    private BusinessService service;


    @GetMapping("view/{accNo}")
    public ResponseEntity<Account> viewAccount(@PathVariable("accNo") Integer accNo){
        Account account = service.view(accNo);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @PostMapping("create/{firstName}/{lastName}")
    public void createAccount(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        service.create(firstName,lastName);
    }
    @DeleteMapping("delete/{accNo}")
    public void delete(@PathVariable("accNo") Integer AccNo){
        service.delete(AccNo);
    }

    @PutMapping("Update/{accNo}/{firstName}/{lastName}")
    public void updateAccount(@PathVariable("accNo") Integer accNo, @PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        service.update(accNo,firstName,lastName);
    }
}
