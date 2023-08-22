package com.cg.CardDemoApplication.model;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer 
{
	@Id
	@Column(name = "customerId")
    private int customerId;
	
	@Column(name = "customerNumber")
    private String customerNumber;
	
	@Column(name = "firstName")
    private String firstName;
    
	@Column(name = "middleName")
    private String middleName;
	
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "address")
    private String address;
    
    @Column(name="city")
    private String city;
    
    @Column(name="state")
    private String state;
    
    @Column(name="country")
    private String country;
    
    @Column(name = "zip")
    private int zip;
    
    @Column(name="dob")
    private Date dob;
    
    @Column(name="ficoScore")
    private float ficoScore;
    
    @Column(name = "Phone1")
    private String Phone1;
    
    @Column(name="Phone2")
    private String Phone2;
    
    @Column(name = "govtIssuedIdRef")
    private String govtIssuedIdRef;
    
    @Column(name="eftAccountId")
    private String eftAccountId;
    
    @Column(name="isPrimaryCardHolder")
    private boolean isPrimaryCardHolder;
    
    @Column(name="createdBy")
    private int createdBy;
    
    @Column(name="createdDate")
    private Date createdDate;
    
    @Column(name="updatedBy")
    private int updatedBy;
    
    @Column(name="updatedDate")
    private Date updatedDate;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public void setCountry(String country) {
		this.country = country;
	}
	
	

	public String getCountry() {
		return country;
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

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerNumber=" + customerNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", ssn=" + ssn + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zip=" + zip + ", dob=" + dob
				+ ", ficoScore=" + ficoScore + ", Phone1=" + Phone1 + ", Phone2=" + Phone2 + ", govtIssuedIdRef="
				+ govtIssuedIdRef + ", eftAccountId=" + eftAccountId + ", isPrimaryCardHolder=" + isPrimaryCardHolder
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	
    
    
    

}
