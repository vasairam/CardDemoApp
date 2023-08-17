package com.cg.CardDemoApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CardDemoApplication.model.Transactions;
import com.cg.CardDemoApplication.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository tRepo;
	
	public TransactionService(TransactionRepository tRepo) {
		
		this.tRepo=tRepo;
	}

	public Transactions findTransactionsById(int id) {

		Optional<Transactions> optionalTrasnaction= tRepo.findById(id);
		
		if(optionalTrasnaction.isPresent()) {
			return optionalTrasnaction.get();
		}else return null;
	}

	public List<Transactions> findAllTransactions() {

		return tRepo.findAll();
	}
	
	public Transactions updateTransaction(Transactions transactions) {
		tRepo.save(transactions);
		return transactions;
	}


}
