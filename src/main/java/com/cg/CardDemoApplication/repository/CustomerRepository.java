package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	

}
