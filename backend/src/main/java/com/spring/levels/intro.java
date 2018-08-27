package com.spring.levels;
import com.spring.model.Account;
import org.springframework.web.bind.annotation.*;


@RestController("/accounts")
public class intro {

    @GetMapping("/view/{id}")
    public static String viewAccount(@PathVariable Integer id){
        Account account = BusinessLogic.view(id);
        System.out.println(BusinessLogic.convertToJson(account));
        return BusinessLogic.convertToJson(account);
    }

    @PostMapping("/create")
    public void createAccount(@PathVariable Integer AccNo, @PathVariable String firstName, @PathVariable String lastName){
        BusinessLogic.create(AccNo, firstName,lastName);
    }


}
