package com.spring.model;

import org.springframework.stereotype.Repository;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional(SUPPORTS)
public class AccountRepositoryImpl implements AccountRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Account getById(Integer accNo){
        return entityManager.find(Account.class, accNo);
    }

    @Override
    public List<Account> getAllAccounts(){
        TypedQuery query = entityManager.createQuery("select A from accounts",Account.class);
        return query.getResultList();

    }

}
