package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.CardDemoApplication.model.Transactions;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.TransactionService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("name")
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@RequestMapping(value="/addTransaction", method = RequestMethod.GET)
	public String showViewAddTransactionPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "addTransaction";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	
	@RequestMapping(value="/viewTransaction", method = RequestMethod.GET)
	public String showViewTransactionPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "viewTransaction";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	
	@RequestMapping(value="/listTransactions", method = RequestMethod.GET)
	public String showAllTransactionPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "listTransactions";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
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
