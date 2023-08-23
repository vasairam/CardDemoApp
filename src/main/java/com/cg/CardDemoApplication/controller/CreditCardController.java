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

import com.cg.CardDemoApplication.model.AccountCustomerRecord;
import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.CreditCardService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("name")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping(value="/viewCreditCard", method = RequestMethod.GET)
	public String showViewCreditCardPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "viewCreditCard";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	@RequestMapping(value="/updateCreditCard", method = RequestMethod.GET)
	public String showViewUpdateCreditCardPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "updateCreditCard";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	@RequestMapping(value="/listCreditCards", method = RequestMethod.GET)
	public String showViewListCreditCardsPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			List<CreditCard> creditCards = creditCardService.findAllCreditCards();
    			model.put("creditCardsData", creditCards);
    			return "listCreditCards";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
	 @RequestMapping(value = "/updateCreditCardDetails", method = RequestMethod.POST)
     public String updateCreditCardDetails(@ModelAttribute("user")  CreditCard inputFormObject, HttpSession session){
		 User sessionUser = (User) session.getAttribute("loggedInUser");
		 System.out.println(inputFormObject.toString());
		 creditCardService.saveCreditCardDetails(inputFormObject,sessionUser);     
	     return "updateCreditCard";
	 }	 	
	
	
//	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
//     public CreditCard findCreditCardById(@PathVariable("id") int id){
//     return service.findCreditCardById(id);
// }
//	 
//	 @RequestMapping(value = "/allcc", method = RequestMethod.GET)
//     public List<CreditCard> findAllccs(){
//     return service.findAllCreditCards();
// }
//	 
//	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
//     public CreditCard updateCreditCard(CreditCard creditCard){
//     return service.updateCreditCard(creditCard);
// }
	 

}
