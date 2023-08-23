package com.cg.CardDemoApplication.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.Account;
import com.cg.CardDemoApplication.model.BillPayment;
import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.model.User;
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

	public CreditCard getCreditCardUsingAccountNumber(String accountNumber) {
		Iterable<CreditCard> allCreditCards = ccRepo.findAll();
		boolean foundUserName = false;
		for (CreditCard nextCard : allCreditCards) {
			if(nextCard.getAccountNumber().equals(accountNumber)) {
				foundUserName = true;
				return nextCard;
			}			
		}
		return null;
	}
	
	public CreditCard getCreditCardUsingCardNumber(String creditcardNumber) {
		Iterable<CreditCard> allCreditCards = ccRepo.findAll();
		boolean foundUserName = false;
		for (CreditCard nextCard : allCreditCards) {
			if(nextCard.getCreditcardNumber().equals(creditcardNumber)) {
				foundUserName = true;
				return nextCard;
			}			
		}
		return null;
	}

	public void saveCreditCardDetails(CreditCard inputFormObject, User sessionUser) {

		CreditCard creditCard = getCreditCardUsingAccountNumber(inputFormObject.getAccountNumber());
		
		creditCard.setAccountNumber(inputFormObject.getAccountNumber());
		creditCard.setCardExpiry(inputFormObject.getCardExpiry());
		creditCard.setCardInActive(true);
		creditCard.setCreditcardNumber(inputFormObject.getCreditcardNumber());
		creditCard.setNameOntheCard(inputFormObject.getNameOntheCard());
		creditCard.setUpdatedDate((java.sql.Date) parseDate());
		creditCard.setUpdatedBy(sessionUser.getUserId());
		ccRepo.save(creditCard);
		
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
