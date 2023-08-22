package com.cg.CardDemoApplication.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="ACCOUNT")
public class Account {
	
	@Id
    @Column(name = "accountId")
    private int accountId;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "openedDate")
    private Date openedDate;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "reissuedDate")
    private Date reissuedDate;
    
    @Column(name = "creditLimit")
    private float creditLimit;

    @Column(name = "cashCreditLimit")
    private float cashCreditLimit;

    @Column(name = "currentBalance")
    private float currentBalance;

    @Column(name = "currentCycleCredit")
    private float currentCycleCredit;
    
    @Column(name = "currentCycleDebit")
    private float currentCycleDebit;

    @Column(name = "accountGroup")
    private String accountGroup;
    
    @Column(name = "isActive")
    private boolean isActive;
    
    @Column(name = "updatedBy")
    private int updatedBy;

    @Column(name = "updatedDate")
    private Date updatedDate;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getReissuedDate() {
		return reissuedDate;
	}

	public void setReissuedDate(Date reissuedDate) {
		this.reissuedDate = reissuedDate;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	public float getCashCreditLimit() {
		return cashCreditLimit;
	}

	public void setCashCreditLimit(float cashCreditLimit) {
		this.cashCreditLimit = cashCreditLimit;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public float getCurrentCycleCredit() {
		return currentCycleCredit;
	}

	public void setCurrentCycleCredit(float currentCycleCredit) {
		this.currentCycleCredit = currentCycleCredit;
	}

	public float getCurrentCycleDebit() {
		return currentCycleDebit;
	}

	public void setCurrentCycleDebit(float currentCycleDebit) {
		this.currentCycleDebit = currentCycleDebit;
	}

	public String getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", openedDate=" + openedDate
				+ ", expiryDate=" + expiryDate + ", reissuedDate=" + reissuedDate + ", creditLimit=" + creditLimit
				+ ", cashCreditLimit=" + cashCreditLimit + ", currentBalance=" + currentBalance
				+ ", currentCycleCredit=" + currentCycleCredit + ", currentCycleDebit=" + currentCycleDebit
				+ ", accountGroup=" + accountGroup + ", isActive=" + isActive + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}
    
    
    
}
