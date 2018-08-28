package com.spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountRepositoryCustom {
    Account getById(Integer id);
}
