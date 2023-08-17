package com.cg.CardDemoApplication.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BILLPAYMENTS")
public class BillPayment {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "billpaymentId")
    private int billpaymentId;

	@Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "amountPaid")
    private float amountPaid;

    @Column(name = "Paymentdate")
    private Date Paymentdate;

    @Column(name = "createdBy")
    private int createdBy;
    
    @Column(name = "createdDate")
    private Date createdDate;

	public int getBillpaymentId() {
		return billpaymentId;
	}

	public void setBillpaymentId(int billpaymentId) {
		this.billpaymentId = billpaymentId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Date getPaymentdate() {
		return Paymentdate;
	}

	public void setPaymentdate(Date paymentdate) {
		Paymentdate = paymentdate;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "billpayment [billpaymentId=" + billpaymentId + ", accountNumber=" + accountNumber + ", amountPaid="
				+ amountPaid + ", Paymentdate=" + Paymentdate + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + "]";
	}


}
