package com.cg.CardDemoApplication.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.AccountCustomerRecord;
import com.cg.CardDemoApplication.model.Customer;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.repository.AccountRepository;

@Service
public class AccountService {
	
	
	@Autowired
	private AccountRepository accRepository;
	
	@Autowired
	private CustomerService customerService;
	
	public Account getAccountInfo(int accountId) {
		 Optional<Account> account=accRepository.findById(accountId);
		 
		 
		 if(account.isPresent()) {
			 return account.get();
		 }else {
			 return null;
		 }
		
	}
	
	public Account getAccountInfo(String accountNumber) {
		Iterable<Account> allAccounts=accRepository.findAll();
		boolean foundUserName = false;
		for (Account nextAccount : allAccounts) {
			if(nextAccount.getAccountNumber().equals(accountNumber)) {
				foundUserName = true;
				return nextAccount;
			}			
		}
		return null;		
	}
	

	public List<Account> getAllAccountInfo() {
		 List<Account> account=accRepository.findAll();
		 
		 return account;
		
	}
	
	public Account saveAccount(Account account) {
		 accRepository.save(account);		 
		 return account;
		
	}

	public AccountCustomerRecord saveAccountDetails(AccountCustomerRecord inputFormObject,User sessionUser) {
		
		Account account = new Account();
		account.setAccountId(Integer.parseInt(inputFormObject.getAccountNumber()));
		account.setAccountNumber(inputFormObject.getAccountNumber());
		account.setOpenedDate(inputFormObject.getOpenedDate());
		account.setExpiryDate(inputFormObject.getExpiryDate());
		account.setReissuedDate(inputFormObject.getReissuedDate());
		account.setCreditLimit(inputFormObject.getCreditLimit());
		account.setCashCreditLimit(inputFormObject.getCashCreditLimit());
		account.setCurrentBalance(inputFormObject.getCurrentBalance());
		account.setCurrentCycleCredit(inputFormObject.getCurrentCycleCredit());
		account.setCurrentCycleDebit(inputFormObject.getCurrentCycleDebit());
		account.setAccountGroup(inputFormObject.getAccountGroup());
		account.setActive(true);
		saveAccount(account);
		
		
		Customer customer = new Customer();
		customer.setCustomerNumber(inputFormObject.getCustomerNumber());
		customer.setCustomerId(Integer.parseInt(inputFormObject.getCustomerNumber()));
		customer.setFirstName(inputFormObject.getFirstName());
		customer.setMiddleName(inputFormObject.getMiddleName());
		customer.setLastName(inputFormObject.getLastName());
		customer.setSsn(inputFormObject.getSsn());
		customer.setDob(inputFormObject.getDob());
		customer.setFicoScore(inputFormObject.getFicoScore());
		customer.setAddress(inputFormObject.getAddress());
		customer.setCity(inputFormObject.getCity());
		customer.setState(inputFormObject.getState());
		customer.setCountry(inputFormObject.getCountry());
		customer.setZip(inputFormObject.getZip());
		customer.setPhone1(inputFormObject.getPhone1());
		customer.setPhone2(inputFormObject.getPhone2());
		customer.setGovtIssuedIdRef(inputFormObject.getGovtIssuedIdRef());
		customer.setEftAccountId(inputFormObject.getEftAccountId());
		customer.setPrimaryCardHolder(true);
		customer.setUpdatedBy(sessionUser.getUserId());
		
		customer.setUpdatedDate((java.sql.Date) parseDate());
		
		customerService.saveCustomer(customer);
		System.out.println("User:" + sessionUser.toString());
		System.out.println("Values Set");
		System.out.println(inputFormObject.toString());
		System.out.println(account.toString());
		System.out.println(customer.toString());
		return inputFormObject;
	}
	
	private Date parseDate() {
	   	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   	 try {
	   		 java.util.Date date = new java.util.Date();	            
	            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	            return sqlDate;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return null;
		}
	

}
