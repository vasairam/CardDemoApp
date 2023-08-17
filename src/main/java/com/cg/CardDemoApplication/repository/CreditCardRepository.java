package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

}
