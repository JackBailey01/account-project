package com.spring.model;

import org.springframework.stereotype.Repository;


@Repository
public interface AccountDao  {
    Account getAccount(int AccNO);
    void createAccount(Account account);

}
