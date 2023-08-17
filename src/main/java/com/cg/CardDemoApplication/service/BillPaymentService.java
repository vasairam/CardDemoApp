package com.cg.CardDemoApplication.service;

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
		bRepo.save(billPayment);
		return billPayment;
	}


}
