package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

}
