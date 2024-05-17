package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_transaction_status_master")
public class HsTransactionStatusMaster {

	@Column(name = "trans_status_id")
	@Id
	private Long transStatusId;

	@Column(name = "trans_statusName")
	private String transStatusName;

	@Column(name = "status")
	private Integer status;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "modified_by")
	private Long modifiedBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_date")
	private Date modifiedDate;

	public Long getTransStatusId() {
		return transStatusId;
	}

	public void setTransStatusId(Long transStatusId) {
		this.transStatusId = transStatusId;
	}

	public String getTransStatusName() {
		return transStatusName;
	}

	public void setTransStatusName(String transStatusName) {
		this.transStatusName = transStatusName;
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
