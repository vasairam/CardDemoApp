package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.service.CreditCardService;

@RestController
@RequestMapping("/creditcard")
public class CreditCardController {
	
	@Autowired
	private CreditCardService service;
	
	
	
	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
     public CreditCard findCreditCardById(@PathVariable("id") int id){
     return service.findCreditCardById(id);
 }
	 
	 @RequestMapping(value = "/allcc", method = RequestMethod.GET)
     public List<CreditCard> findAllccs(){
     return service.findAllCreditCards();
 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
     public CreditCard updateCreditCard(CreditCard creditCard){
     return service.updateCreditCard(creditCard);
 }
	 

}
