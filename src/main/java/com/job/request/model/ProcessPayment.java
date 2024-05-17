package com.job.request.model;

import java.io.Serializable;

public class ProcessPayment implements Serializable {

	private static final long serialVersionUID = -263221301799339183L;
	
	private Long custId;
	private Double amount;
	private Integer paymentType;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
