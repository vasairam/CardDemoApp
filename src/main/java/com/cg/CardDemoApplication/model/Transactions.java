package com.cg.CardDemoApplication.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Transactions")
@Builder
public class Transactions {
	    @Id
	
	    @Column(name="transid")
	    private Long id;

	    @Column(name="transid")
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	@Column(name="transactionid")
	private String transactionId;
	@Column(name="accountNumber")
	private String accountNumber;
	@Column(name="creditCardNumber")
	private String creditCardNumber;
	@Column(name="typeCD")
	private String typeCD;
	@Column(name="categoryCD")
	private String categoryCD;
	@Column(name="Source")
	private String Source;
	@Column(name="merchantId")
	private String merchantId;
	@Column(name="merhcantName")
	private String merhcantName;
	@Column(name="merchantCity")
	private String merchantCity;
	@Column(name="merchantZip")
	private String merchantZip;
	@Column(name="amount")
	private String amount;
	@Column(name="originDate")
	private Date originDate;
	@Column(name="processingDate")
	private Date processingDate;
	@Column(name="Description")
	private String description;
	@Column(name="updatedBy")
	private int updatedBy;
	@Column(name="updatedDate")
	private String updatedDate;

	
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
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerhcantName() {
		return merhcantName;
	}
	public void setMerhcantName(String merhcantName) {
		this.merhcantName = merhcantName;
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
	public Date getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
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













}
