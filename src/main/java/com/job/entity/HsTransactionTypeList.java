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
@Table(name = "hs_transaction_type_list")
public class HsTransactionTypeList {
	@Id
	@Column(name = "trans_type_id")
	private Integer transTypeId;

	@Column(name = "type_name")
	private String typeName;

	@Column(name = "process_type")
	private Integer processType;

	@Column(name = "status")
	private Integer status;

	@Column(name = "manuvalListFlag")
	private Boolean manuvalListFlag;

	@Column(name = "createdBy")
	private Long createdBy;

	@Column(name = "modifiedBy")
	private Long modifiedBy;

	@Column(name = "createdDate")
	private Date createdDate;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "type_master_id")
	HsTransactionTypeMaster hsTransactionTypeMaster;

	public Integer getTransTypeId() {
		return transTypeId;
	}

	public void setTransTypeId(Integer transTypeId) {
		this.transTypeId = transTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getProcessType() {
		return processType;
	}

	public void setProcessType(Integer processType) {
		this.processType = processType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getManuvalListFlag() {
		return manuvalListFlag;
	}

	public void setManuvalListFlag(Boolean manuvalListFlag) {
		this.manuvalListFlag = manuvalListFlag;
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

	public HsTransactionTypeMaster getHsTransactionTypeMaster() {
		return hsTransactionTypeMaster;
	}

	public void setHsTransactionTypeMaster(HsTransactionTypeMaster hsTransactionTypeMaster) {
		this.hsTransactionTypeMaster = hsTransactionTypeMaster;
	}

}
