package com.cg.CardDemoApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.repository.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository ccRepo;
	
	public CreditCardService(CreditCardRepository ccRepo) {
		
		this.ccRepo=ccRepo;
	}

	public CreditCard findCreditCardById(int id) {

		Optional<CreditCard> optionalCreditCard= ccRepo.findById(id);
		
		if(optionalCreditCard.isPresent()) {
			return optionalCreditCard.get();
		}else return null;
	}

	public List<CreditCard> findAllCreditCards() {

		return ccRepo.findAll();
	}
	
	public CreditCard updateCreditCard(CreditCard creditCard) {
		ccRepo.save(creditCard);
		return creditCard;
	}


}
