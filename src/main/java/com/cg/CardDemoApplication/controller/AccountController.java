package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.service.AccountService;

@RestController
@RequestMapping(name="account")
public class AccountController {
	
	@Autowired
	AccountService aService;
	
	
	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
     public Account findBillsById(@PathVariable("id") int id){
     return aService.getAccountInfo(id);
 }
	 
	 @RequestMapping(value = "/allAccount", method = RequestMethod.GET)
     public List<Account> findAllAccounts(){
     return aService.getAllAccountInfo();
 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
     public Account updateAccount(Account account){
     return aService.saveAccount(account);
 }

}
