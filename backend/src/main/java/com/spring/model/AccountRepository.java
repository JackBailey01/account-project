package com.spring.model;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Integer>, AccountRepositoryCustom {
}
