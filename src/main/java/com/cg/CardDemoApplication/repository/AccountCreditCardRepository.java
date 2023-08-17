package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.AccountCreditCardMapping;

public interface AccountCreditCardRepository extends JpaRepository<AccountCreditCardMapping, Integer> {

}
