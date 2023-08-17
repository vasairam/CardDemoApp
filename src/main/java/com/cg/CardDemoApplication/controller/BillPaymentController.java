package com.cg.CardDemoApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.service.BillPaymentService;

@RestController
@RequestMapping("/billpayment")
public class BillPaymentController {
	
	@Autowired
	private BillPaymentService service;
	
	
	
	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
     public BillPayment findBillsById(@PathVariable("id") int id){
     return service.findBillPaymentById(id);
 }
	 
	 @RequestMapping(value = "/allbills", method = RequestMethod.GET)
     public List<BillPayment> findAllBills(){
     return service.findAllBillPayment();
 }
	 
	 @RequestMapping(value = "/update", method = RequestMethod.PUT)
     public BillPayment updateTransaction(BillPayment billPayment){
     return service.updateBillPayment(billPayment);
 }
	 

}
