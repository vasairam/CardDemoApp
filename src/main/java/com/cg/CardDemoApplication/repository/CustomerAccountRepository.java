package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.CustomerAccountMapping;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccountMapping, Integer> {

}
