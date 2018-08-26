package com.spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends CrudRepository<Account, Integer> {
    Account findAccountByAccNo(Integer AccNo);
}
