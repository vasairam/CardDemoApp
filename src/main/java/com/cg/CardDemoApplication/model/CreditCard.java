package com.cg.CardDemoApplication.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="CREDITCARD")
public class CreditCard {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "creditcardId")
    private int creditcardId;

	@Column(name = "creditcardNumber")
    private String creditcardNumber;

    @Column(name = "cardExpiry")
    private Date cardExpiry;

    @Column(name = "nameOntheCard")
    private String nameOntheCard;

    @Column(name = "isCardInActive")
    private boolean isCardInActive;
    
    @Column(name = "accountNumber")
    private String accountNumber;
    
    @Column(name = "updatedBy")
    private int updatedBy;

    @Column(name = "updatedDate")
    private Date updatedDate;
    
    @Column(name = "cvv")
    private int cvv;

	public int getCreditcardId() {
		return creditcardId;
	}

	public void setCreditcardId(int creditcardId) {
		this.creditcardId = creditcardId;
	}

	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public Date getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(Date cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getNameOntheCard() {
		return nameOntheCard;
	}

	public void setNameOntheCard(String nameOntheCard) {
		this.nameOntheCard = nameOntheCard;
	}

	public boolean isCardInActive() {
		return isCardInActive;
	}

	public void setCardInActive(boolean isCardInActive) {
		this.isCardInActive = isCardInActive;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "CreditCard [creditcardId=" + creditcardId + ", creditcardNumber=" + creditcardNumber + ", cardExpiry="
				+ cardExpiry + ", nameOntheCard=" + nameOntheCard + ", isCardInActive=" + isCardInActive
				+ ", accountNumber=" + accountNumber + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", cvv=" + cvv + "]";
	}

	

}
