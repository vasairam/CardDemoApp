package com.cg.CardDemoApplication.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.CreditCard;
import com.cg.CardDemoApplication.model.Transactions;
import com.cg.CardDemoApplication.model.User;
import com.cg.CardDemoApplication.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository tRepo;
	
	public TransactionService(TransactionRepository tRepo) {
		
		this.tRepo=tRepo;
	}

	public void savetransactions(Transactions transactions) {
		tRepo.save(transactions);
	}
	public Transactions findTransactionsById(int id) {

		Optional<Transactions> optionalTrasnaction= tRepo.findById(id);
		
		if(optionalTrasnaction.isPresent()) {
			return optionalTrasnaction.get();
		}else return null;
	}

	public List<Transactions> findAllTransactions() {
		List<Transactions> transactions = tRepo.findAll();
		return transactions;
	}
	
	public Transactions updateTransaction(Transactions transactions) {
		tRepo.save(transactions);
		return transactions;
	}
	public Transactions gettransactionusingID(String transactionid) {
		Iterable<Transactions> allTransactions = tRepo.findAll();
		boolean foundUserName = false;
		for (Transactions nextTransaction : allTransactions) {
			if(nextTransaction.getTransactionId().equals(transactionid))
			{
				foundUserName = true;
				return nextTransaction;
			}
		}
		return null;
	}

	public Transactions addtransactions(Transactions inputFormObject,User sessionUser) {
		Transactions tran = new Transactions();
		  LocalDate now = LocalDate.now();
		  int year = now.getYear();
		  int month = now.getMonthValue(); 
		  int day = now.getDayOfMonth();
		  String dateString = "" + year + month + day;
		  String randomString = dateString;
		  Random rand = new Random(); 
		  for(int i=dateString.length(); i<16; i++) {
		    randomString += rand.nextInt(10); 
		  }
		  String transid = randomString.substring(10,16);
		  tran.setTransID(Long.parseLong(transid));
		  tran.setTransactionId(transid);
		  tran.setAccountNumber(inputFormObject.getAccountNumber());
		  tran.setCreditCardNumber(inputFormObject.getCreditCardNumber());
		  tran.setTypeCD(inputFormObject.getTypeCD());
		  tran.setCategoryCD(inputFormObject.getCategoryCD());
		  tran.setSource(inputFormObject.getSource());
		  tran.setMerchantId(inputFormObject.getMerchantId());
		  tran.setMerchantName(inputFormObject.getMerchantName());
		  tran.setMerchantCity(inputFormObject.getMerchantCity());
		  tran.setMerchantZip(inputFormObject.getMerchantZip());
		  tran.setAmount(inputFormObject.getAmount());
		  tran.setOriginDate(inputFormObject.getOriginDate());
		  tran.setProcessingDate(inputFormObject.getProcessingDate());
		  tran.setDescription(inputFormObject.getDescription());
		  tran.setUpdatedBy(inputFormObject.getUpdatedBy());		  
		  tran.setUpdatedDate(parseDate());
		  savetransactions(tran);
		  return inputFormObject;
	}
	private String parseDate() {
	   	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	   	 try {
	   		 java.util.Date date = new java.util.Date();	            
	            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
	            return sqlDate.toString();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return null;
		}
}
