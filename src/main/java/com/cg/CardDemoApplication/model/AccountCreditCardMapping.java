package com.cg.CardDemoApplication.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ACCOUNTCREDITCARDMAPPING")
public class AccountCreditCardMapping {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ccamId")
    private int ccamId;

	@Column(name = "creditcardNumber")
    private String creditcardNumber;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "isActive")
    private Boolean isActive;

    @Column(name = "updatedBy")
    private int creditLimit;

    @Column(name = "updatedDate")
    private Date updatedDate;

	public int getCcamId() {
		return ccamId;
	}

	public void setCcamId(int ccamId) {
		this.ccamId = ccamId;
	}

	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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
		return "accountCreditcardMapping [ccamId=" + ccamId + ", creditcardNumber=" + creditcardNumber
				+ ", accountNumber=" + accountNumber + ", isActive=" + isActive + ", creditLimit=" + creditLimit
				+ ", updatedDate=" + updatedDate + "]";
	}


}
