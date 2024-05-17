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
@Table(name = "hs_default_job_filter_master")
public class HsDefaultJobFilterMaster {
	
	@Id
	@Column(name="job_filter_id")
	Integer jobFilterId;
	@Column
	String filterName;
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
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private HsUser hsUser;

	public Integer getJobFilterId() {
		return jobFilterId;
	}

	public void setJobFilterId(Integer jobFilterId) {
		this.jobFilterId = jobFilterId;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
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

	public HsUser getHsUser() {
		return hsUser;
	}

	public void setHsUser(HsUser hsUser) {
		this.hsUser = hsUser;
	}

}
