package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hs_cust_jobboard")
public class HsCustJobboard {
	@Id
	@Column(name="cust_jobboard_id")
	Integer custJobboardId;
	@Column(name="jobboard_id")
	Integer jobboardId;
	@Column(name="job_id")
	Long jobId;
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
	@Column
	Double jobboardRate;

	public Integer getCustJobboardId() {
		return custJobboardId;
	}

	public void setCustJobboardId(Integer custJobboardId) {
		this.custJobboardId = custJobboardId;
	}

	public Integer getJobboardId() {
		return jobboardId;
	}

	public void setJobboardId(Integer jobboardId) {
		this.jobboardId = jobboardId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
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

	public Double getJobboardRate() {
		return jobboardRate;
	}

	public void setJobboardRate(Double jobboardRate) {
		this.jobboardRate = jobboardRate;
	}

}
