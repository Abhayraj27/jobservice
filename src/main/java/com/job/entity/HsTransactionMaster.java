package com.job.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hs_transaction_master")
public class HsTransactionMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "trans_id")
	private Long transId;

	@Column(name = "trans_amt")
	private Double transAmt;

	@Column(name = " trans_date")
	private Date transDate;

	@Column(name = "created_by ")
	private Long createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_by")
	private Long modifiedBy;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "description")
	private String description;

	@Column(name = "payment_gateway_transaction_id")
	private Long paymentGatewayTransactionId;

	@Column(name = "trans_balance")
	private Double transBalance;

	@Column(name = "card_id")
	private Integer cardId;

	@Column(name = "process_type")
	private Integer processType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id")
	private HsCustomerMaster hsCustomerMaster;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "trans_status_id")
	private HsTransactionStatusMaster hsTransactionMaster;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "trans_type_id")
	private HsTransactionTypeList hsTransactionTypeList;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public Double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(Double transAmt) {
		this.transAmt = transAmt;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getPaymentGatewayTransactionId() {
		return paymentGatewayTransactionId;
	}

	public void setPaymentGatewayTransactionId(Long paymentGatewayTransactionId) {
		this.paymentGatewayTransactionId = paymentGatewayTransactionId;
	}

	public Double getTransBalance() {
		return transBalance;
	}

	public void setTransBalance(Double transBalance) {
		this.transBalance = transBalance;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public Integer getProcessType() {
		return processType;
	}

	public void setProcessType(Integer processType) {
		this.processType = processType;
	}

	public HsCustomerMaster getHsCustomerMaster() {
		return hsCustomerMaster;
	}

	public void setHsCustomerMaster(HsCustomerMaster hsCustomerMaster) {
		this.hsCustomerMaster = hsCustomerMaster;
	}

	public HsTransactionStatusMaster getHsTransactionMaster() {
		return hsTransactionMaster;
	}

	public void setHsTransactionMaster(HsTransactionStatusMaster hsTransactionMaster) {
		this.hsTransactionMaster = hsTransactionMaster;
	}

	public HsTransactionTypeList getHsTransactionTypeList() {
		return hsTransactionTypeList;
	}

	public void setHsTransactionTypeList(HsTransactionTypeList hsTransactionTypeList) {
		this.hsTransactionTypeList = hsTransactionTypeList;
	}

}
