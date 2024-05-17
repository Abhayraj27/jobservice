package com.job.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_jobboard_master")
public class HsJobBoardMaster {
	@Id
	@Column(name="jobboard_id")
	Integer jobBoardId;
	@Column(name="jobboard_name")
	String jobBoardName;
	@Column(name="jobboard_type")
	Integer jobBoardType;
	@Column(name="payment_amt")
	Double paymentAmt;
	@Column
	Integer status;
	@Column
	Long createdBy;
	@Column
	Long modifiedBy;
	@Column
	Date createdDate;
	@Column
	Date modifiedDate;

	public Integer getJobBoardId() {
		return jobBoardId;
	}

	public void setJobBoardId(Integer jobBoardId) {
		this.jobBoardId = jobBoardId;
	}

	public String getJobBoardName() {
		return jobBoardName;
	}

	public void setJobBoardName(String jobBoardName) {
		this.jobBoardName = jobBoardName;
	}

	public Integer getJobBoardType() {
		return jobBoardType;
	}

	public void setJobBoardType(Integer jobBoardType) {
		this.jobBoardType = jobBoardType;
	}

	public Double getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(Double paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
