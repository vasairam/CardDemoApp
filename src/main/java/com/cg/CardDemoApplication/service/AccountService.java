package com.cg.CardDemoApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.repository.AccountRepository;

@Service
public class AccountService {
	
	
	@Autowired
	private AccountRepository accRepository;
	
	public Account getAccountInfo(int accountId) {
		 Optional<Account> account=accRepository.findById(accountId);
		 
		 if(account.isPresent()) {
			 return account.get();
		 }else {
			 return null;
		 }
		
	}
	

	public List<Account> getAllAccountInfo() {
		 List<Account> account=accRepository.findAll();
		 
		 return account;
		
	}
	
	public Account saveAccount(Account account) {
		 accRepository.save(account);
		 
		 return account;
		
	}
	
	

}
