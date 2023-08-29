package com.cg.CardDemoApplication.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.AccountCustomerRecord;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.AccountService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("name")
public class AccountController {
	
	@Autowired
	AccountService aService;
	

	@RequestMapping(value="/viewAccount", method = RequestMethod.GET)
	public String showViewAccountPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "viewAccount";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	@RequestMapping(value="/updateAccount", method = RequestMethod.GET)
	public String showUpdateAccountPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "updateAccount";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}
	}
	
 
//	 @RequestMapping(value = "/allAccount", method = RequestMethod.GET)
//     public List<Account> findAllAccounts(){
//     return aService.getAllAccountInfo();
// }
//	 
//	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
//     public Account updateAccount(Account account){
//     return aService.saveAccount(account);
// }	 	
	 
	 @RequestMapping(value = "/updateAccountDetails", method = RequestMethod.POST)
     public String updateAccountDetails(@ModelAttribute("user")  AccountCustomerRecord inputFormObject, HttpSession session){
		 User sessionUser = (User) session.getAttribute("loggedInUser");
	     aService.saveAccountDetails(inputFormObject,sessionUser);     
	     return "updateAccount";
	 }	 

}
