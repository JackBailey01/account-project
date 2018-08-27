package com.spring.model;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class AccountDaoI implements AccountDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Account getAccount(int AccNo){
        return entityManager.find(Account.class, AccNo);
    }
    @Override
    public void createAccount(Account account){
        entityManager.persist(account);
    }


}
