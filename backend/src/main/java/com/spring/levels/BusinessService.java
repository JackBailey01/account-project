package com.spring.levels;

import com.spring.model.Account;

public interface BusinessService {
    Account view(Integer id);
    void delete(Integer AccNo);
    void create(String firstName, String lastName);
    void update(Integer accNo, String firstName, String lastName);
}
