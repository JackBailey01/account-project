package com.spring.levels;

import com.spring.model.Account;

public interface BusinessService {
    Account view(Integer id);
    void delete(Integer AccNo);
    void create(Integer AccNo, String firstName, String lastName);
}
