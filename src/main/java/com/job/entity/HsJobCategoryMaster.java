package com.job.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job_category_master")
public class HsJobCategoryMaster implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hs_job_category_master_id_seq")
	@SequenceGenerator(name = "hs_job_category_master_id_seq", allocationSize = 1)
	@Column
	private Integer jobCatId;

	@Column
	private String jobCatName;

	@Column
	private Long createdBy;

	@Column
	private Long modifiedBy;

	@Column
	private Date createdDate;

	@Column
	private Date modifiedDate;

	public Integer getJobCatId() {
		return jobCatId;
	}

	public void setJobCatId(Integer jobCatId) {
		this.jobCatId = jobCatId;
	}

	public String getJobCatName() {
		return jobCatName;
	}

	public void setJobCatName(String jobCatName) {
		this.jobCatName = jobCatName;
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
