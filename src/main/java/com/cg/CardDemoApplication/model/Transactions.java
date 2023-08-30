package com.cg.CardDemoApplication.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "Transactions")
//@Builder
@Entity
@Table(name = "TRANSACTIONS")
public class Transactions {
	    @Id
	    @Column(name="transID")
	    private Long transID;
//	    @Column(name="transID")
	@Column(name="transactionID")
	private String transactionId;
	@Column(name="accountNumber")
	private String accountNumber;
	@Column(name="creditCardNumber")
	private String creditCardNumber;
	@Column(name="typeCD")
	private String typeCD;
	@Column(name="categoryCD")
	private String categoryCD;
	@Column(name="source")
	private String source;
	@Column(name="merchantID")
	private String merchantId;
	@Column(name="merchantName")
	private String merchantName;
	@Column(name="merchantCity")
	private String merchantCity;
	@Column(name="merchantZip")
	private String merchantZip;
	@Column(name="amount")
	private String amount;
	@Column(name="originDate")
	private Date originDate;
	@Column(name="processingDate")
	private String processingDate;
	@Column(name="description")
	private String description;
	@Column(name="updatedBy")
	private int updatedBy;
	@Column(name="updatedDate")
	private String updatedDate;
	public Long getTransID() {
		return transID;
	}
	public void setTransID(Long transID) {
		this.transID = transID;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getTypeCD() {
		return typeCD;
	}
	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}
	public String getCategoryCD() {
		return categoryCD;
	}
	public void setCategoryCD(String categoryCD) {
		this.categoryCD = categoryCD;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantCity() {
		return merchantCity;
	}
	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}
	public String getMerchantZip() {
		return merchantZip;
	}
	public void setMerchantZip(String merchantZip) {
		this.merchantZip = merchantZip;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getOriginDate() {
		return originDate;
	}
	public void setOriginDate(Date originDate) {
		this.originDate = originDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	@Override
	public String toString() {
		return "Transactions [transID=" + transID + ", transactionId=" + transactionId + ", accountNumber="
				+ accountNumber + ", creditCardNumber=" + creditCardNumber + ", typeCD=" + typeCD + ", categoryCD="
				+ categoryCD + ", source=" + source + ", merchantId=" + merchantId + ", merchantName=" + merchantName
				+ ", merchantCity=" + merchantCity + ", merchantZip=" + merchantZip + ", amount=" + amount
				+ ", originDate=" + originDate + ", processingDate=" + processingDate + ", description=" + description
				+ ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate + "]";
	}
	
}
