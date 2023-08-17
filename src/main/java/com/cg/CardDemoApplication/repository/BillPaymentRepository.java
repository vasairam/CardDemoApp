package com.cg.CardDemoApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CardDemoApplication.model.BillPayment;

public interface BillPaymentRepository extends JpaRepository<BillPayment, Integer> {

}
