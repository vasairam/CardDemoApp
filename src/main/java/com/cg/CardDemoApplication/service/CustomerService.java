package com.cg.CardDemoApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.Customer;
import com.cg.CardDemoApplication.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomerInfo(String customerNumber) {
		Iterable<Customer> allCustomers=customerRepository.findAll();
		boolean foundUserName = false;
		for (Customer nextCustomer : allCustomers) {
			if(nextCustomer.getCustomerNumber().equals(customerNumber)) {
				foundUserName = true;
				return nextCustomer;
			}			
		}
		return null;
	}
	
	public Customer saveCustomer(Customer customer) {
		 customerRepository.save(customer);		 
		 return customer;
		
	}

}
