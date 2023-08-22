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

import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.service.BillPaymentService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("name")
public class BillPaymentController {
	
	@Autowired
	private BillPaymentService service;
	
	@RequestMapping(value="/billPayment", method = RequestMethod.GET)
	public String showViewAccountPage(ModelMap model, HttpSession session){
		String sessionUserRole = (String) session.getAttribute("userRole");
    	User sessionUser = (User) session.getAttribute("loggedInUser");
    	if(sessionUser!= null && sessionUserRole!= null) {
    		if(sessionUserRole.equalsIgnoreCase("user")) {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "billPayment";
    		} else {
    			System.out.println("Session User Role : "+sessionUserRole);
    			return "redirect:/addUser";
    		}
    	}else {
    		return "redirect:/login";
    	}

	}
	
//	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
//     public BillPayment findBillsById(@PathVariable("id") int id){
//     return service.findBillPaymentById(id);
// }
//	 
//	 @RequestMapping(value = "/allbills", method = RequestMethod.GET)
//     public List<BillPayment> findAllBills(){
//     return service.findAllBillPayment();
// }
//	 
//	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
//     public BillPayment updateTransaction(BillPayment billPayment){
//     return service.updateBillPayment(billPayment);
// }
	 

}
