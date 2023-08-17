package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.Transactions;
import com.cg.CardDemoApplication.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	
	
	 @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
     public Transactions findTransactionById(@PathVariable("id") int id){
     return service.findTransactionsById(id);
 }
	 
	 @RequestMapping(value = "/alltrans", method = RequestMethod.GET)
     public List<Transactions> findAllTransaction(){
     return service.findAllTransactions();
 }
	 
	 @RequestMapping(value = "/transactions", method = RequestMethod.PUT)
     public Transactions updateTransaction(Transactions transaction){
     return service.updateTransaction(transaction);
 }
	 

}
