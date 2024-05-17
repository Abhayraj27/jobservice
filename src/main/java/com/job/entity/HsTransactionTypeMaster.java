package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_transaction_type_master")
public class HsTransactionTypeMaster {

	@Id
	@Column(name = "type_master_id")
	private Integer typeMasterId;

	@Column(name = "master_type_name")
	private String masterTypeName;

	@Column(name = "status")
	private Integer status;

	@Column(name = "manuval_list_flag")
	private Boolean manuvalListFlag;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "modified_by")
	private Long modifiedBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_date")
	private Date modifiedDate;

	public Integer getTypeMasterId() {
		return typeMasterId;
	}

	public void setTypeMasterId(Integer typeMasterId) {
		this.typeMasterId = typeMasterId;
	}

	public String getMasterTypeName() {
		return masterTypeName;
	}

	public void setMasterTypeName(String masterTypeName) {
		this.masterTypeName = masterTypeName;
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

}
