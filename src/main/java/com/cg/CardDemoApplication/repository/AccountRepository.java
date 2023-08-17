package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
