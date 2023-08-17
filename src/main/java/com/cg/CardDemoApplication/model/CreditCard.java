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
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    
    @Column(name = "updatedBy")
    private int creditLimit;

    @Column(name = "updatedDate")
    private Date updatedDate;

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

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "creditcard [creditcardId=" + creditcardId + ", creditcardNumber=" + creditcardNumber + ", cardExpiry="
				+ cardExpiry + ", nameOntheCard=" + nameOntheCard + ", isCardInActive=" + isCardInActive
				+ ", creditLimit=" + creditLimit + ", updatedDate=" + updatedDate + "]";
	}


}
