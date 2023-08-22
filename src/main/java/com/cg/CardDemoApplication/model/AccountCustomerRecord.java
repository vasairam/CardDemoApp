package com.cg.CardDemoApplication.model;

import java.sql.Date;

public class AccountCustomerRecord {

    private int accountId;
    private String accountNumber;
    private Date openedDate;
    private Date expiryDate;
    private Date reissuedDate;    
    private float creditLimit;
    private float cashCreditLimit;
    private float currentBalance;
    private float currentCycleCredit;    
    private float currentCycleDebit;
    private String accountGroup;   
    private boolean isActive;
    private int updatedBy;
    private Date updatedDate;
    private int customerId;
    private String customerNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    private String address;
    private String city;
    private String state;
    private String country;
    private int zip;
    private Date dob;
    private float ficoScore;
    private String Phone1;
    private String Phone2;
    private String govtIssuedIdRef;
    private String eftAccountId;
    private boolean isPrimaryCardHolder;
    private int createdBy;    
    private Date createdDate;
    private int customerUpdatedBy;    
    private Date customerUpdatedDate;
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public float getFicoScore() {
		return ficoScore;
	}
	public void setFicoScore(float ficoScore) {
		this.ficoScore = ficoScore;
	}
	public String getPhone1() {
		return Phone1;
	}
	public void setPhone1(String phone1) {
		Phone1 = phone1;
	}
	public String getPhone2() {
		return Phone2;
	}
	public void setPhone2(String phone2) {
		Phone2 = phone2;
	}
	public String getGovtIssuedIdRef() {
		return govtIssuedIdRef;
	}
	public void setGovtIssuedIdRef(String govtIssuedIdRef) {
		this.govtIssuedIdRef = govtIssuedIdRef;
	}
	public String getEftAccountId() {
		return eftAccountId;
	}
	public void setEftAccountId(String eftAccountId) {
		this.eftAccountId = eftAccountId;
	}
	public boolean isPrimaryCardHolder() {
		return isPrimaryCardHolder;
	}
	public void setPrimaryCardHolder(boolean isPrimaryCardHolder) {
		this.isPrimaryCardHolder = isPrimaryCardHolder;
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
	public int getCustomerUpdatedBy() {
		return customerUpdatedBy;
	}
	public void setCustomerUpdatedBy(int customerUpdatedBy) {
		this.customerUpdatedBy = customerUpdatedBy;
	}
	public Date getCustomerUpdatedDate() {
		return customerUpdatedDate;
	}
	public void setCustomerUpdatedDate(Date customerUpdatedDate) {
		this.customerUpdatedDate = customerUpdatedDate;
	}
	@Override
	public String toString() {
		return "AccountCustomerRecord [accountId=" + accountId + ", accountNumber=" + accountNumber + ", openedDate="
				+ openedDate + ", expiryDate=" + expiryDate + ", reissuedDate=" + reissuedDate + ", creditLimit="
				+ creditLimit + ", cashCreditLimit=" + cashCreditLimit + ", currentBalance=" + currentBalance
				+ ", currentCycleCredit=" + currentCycleCredit + ", currentCycleDebit=" + currentCycleDebit
				+ ", accountGroup=" + accountGroup + ", isActive=" + isActive + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", customerId=" + customerId + ", customerNumber=" + customerNumber
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", ssn=" + ssn
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country + ", zip="
				+ zip + ", dob=" + dob + ", ficoScore=" + ficoScore + ", Phone1=" + Phone1 + ", Phone2=" + Phone2
				+ ", govtIssuedIdRef=" + govtIssuedIdRef + ", eftAccountId=" + eftAccountId + ", isPrimaryCardHolder="
				+ isPrimaryCardHolder + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", customerUpdatedBy=" + customerUpdatedBy + ", customerUpdatedDate=" + customerUpdatedDate + "]";
	}

    
    
}
