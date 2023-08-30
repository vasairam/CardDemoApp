package com.cg.CardDemoApplication.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.repository.BillPaymentRepository;

@Service
public class BillPaymentService {

	@Autowired
	BillPaymentRepository bRepo;
	
	@Autowired
	AccountService accountService;
	
	public BillPaymentService(BillPaymentRepository tRepo) {
		
		this.bRepo=tRepo;
	}

	public BillPayment findBillPaymentById(int id) {

		Optional<BillPayment> optionalBillPayment= bRepo.findById(id);
		
		if(optionalBillPayment.isPresent()) {
			return optionalBillPayment.get();
		}else return null;
	}

	public List<BillPayment> findAllBillPayment() {

		return bRepo.findAll();
	}
	
	public BillPayment updateBillPayment(BillPayment billPayment) {	
		boolean flag = accountService.updateCurrentBalance(billPayment.getAccountNumber(),billPayment.getAmountPaid());
		if(flag) {
			BillPayment updateBillPayment = new BillPayment();
			updateBillPayment.setAccountNumber(billPayment.getAccountNumber());
			updateBillPayment.setAmountPaid(billPayment.getAmountPaid());
			updateBillPayment.setPaymentdate((java.sql.Date) parseDate());
			bRepo.save(updateBillPayment);
		}
		return billPayment;
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
