package com.job.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hs_batch_master")
public class HsBatchMaster {

	@Column(name = "batch_id")
	@Id
	Integer batchId;
	@Column(name = "batch_name")
	String batchName;
	@Column(name = "trans_count ")
	Integer transCount;
	@Column(name = "debit ")
	Double debit;
	@Column(name = "credit ")
	Double credit;
	@Column(name = "submited_by")
	Long submitedBy;
	@Column(name = "created_by")
	Long createdBy;
	@Column(name = "modified_by")
	Long modifiedBy;
	@Column(name = "created_date")
	Date createdDate;
	@Column(name = "modified_date")
	Date modifiedDate;
	@Column(name = "submited_date")
	Date submitedDate;
	@Column(name = "completed_date")
	Date completedDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "batch_status_id")
	private HsBatchStatusMaster hsBatchStatusMaster;

	public HsBatchStatusMaster getHsBatchStatusMaster() {
		return hsBatchStatusMaster;
	}

	public void setHsBatchStatusMaster(HsBatchStatusMaster hsBatchStatusMaster) {
		this.hsBatchStatusMaster = hsBatchStatusMaster;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Integer getTransCount() {
		return transCount;
	}

	public void setTransCount(Integer transCount) {
		this.transCount = transCount;
	}

	public Double getDebit() {
		return debit;
	}

	public void setDebit(Double debit) {
		this.debit = debit;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Long getSubmitedBy() {
		return submitedBy;
	}

	public void setSubmitedBy(Long submitedBy) {
		this.submitedBy = submitedBy;
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

	public Date getSubmitedDate() {
		return submitedDate;
	}

	public void setSubmitedDate(Date submitedDate) {
		this.submitedDate = submitedDate;
	}

	public Date getCompletedDate() {
		return completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

}
