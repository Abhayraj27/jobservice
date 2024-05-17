package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job_qa_type")
public class HsJobQaType {
	@Id
	private Integer typeId;
	@Column
	private String typeName;
	@Column
	private Integer status;
	@Column
	private Long createdBy;
	@Column
	private Long modifiedBy;
	@Column
	private Date createdDate;
	@Column
	private Date modifiedDate;
	@Column
	private boolean multipleQaFlag;

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
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

	public boolean isMultipleQaFlag() {
		return multipleQaFlag;
	}

	public void setMultipleQaFlag(boolean multipleQaFlag) {
		this.multipleQaFlag = multipleQaFlag;
	}

}
