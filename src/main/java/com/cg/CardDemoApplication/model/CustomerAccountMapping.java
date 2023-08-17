package com.cg.CardDemoApplication.model;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMERACCOUNTMAPPING")
public class CustomerAccountMapping 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "camId")
    private int camId;

    @Column(name = "customerId")
    private int customerId;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name="isActive")
    private boolean isActive;
    
    @Column(name="updatedBy")
    private int updatedBy;
    
    @Column(name="updatedDate")
    private Date updatedDate;

	public int getCamId() {
		return camId;
	}

	public void setCamId(int camId) {
		this.camId = camId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
		return "customerAccountMapping [camId=" + camId + ", customerId=" + customerId + ", accountNumber="
				+ accountNumber + ", isActive=" + isActive + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ "]";
	}
    
    

}
