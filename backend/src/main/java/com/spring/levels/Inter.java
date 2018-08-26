package com.spring.levels;

import com.spring.model.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class Inter {
    @RequestMapping(value = "accounts", method = RequestMethod.GET)
    public List<Account> list(){
        List check = null;
        return check;
    }

}
