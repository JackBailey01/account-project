package com.spring.model;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class AccountRepositoryImpl implements AccountRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Account getById(Integer accNo){
        Account account = entityManager.find(Account.class, accNo);
        return account;
    }

}
