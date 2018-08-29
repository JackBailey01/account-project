package com.spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepositoryCustom {
    Account getById(Integer id);
    List<Account> getAllAccounts();
}
