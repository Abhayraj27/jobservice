package com.job.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hs_default_job_filter_keyword_master")
public class HsJobFilterKeywordMaster {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer defaultKeyId;
    @Column
	String keyName;
	@Column
	Integer matchCriteria;
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
	@JoinColumn(name = "filterId")
	HsDefaultJobFilterMaster hsDefaultJobFilterMaster;

	public Integer getDefaultKeyId() {
		return defaultKeyId;
	}

	public void setDefaultKeyId(Integer defaultKeyId) {
		this.defaultKeyId = defaultKeyId;
	}

//	public Integer getFilterId() {
//		return filterId;
//	}
//
//	public void setFilterId(Integer filterId) {
//		this.filterId = filterId;
//	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Integer getMatchCriteria() {
		return matchCriteria;
	}

	public void setMatchCriteria(Integer matchCriteria) {
		this.matchCriteria = matchCriteria;
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

	public HsDefaultJobFilterMaster getHsDefaultJobFilterMaster() {
		return hsDefaultJobFilterMaster;
	}

	public void setHsDefaultJobFilterMaster(HsDefaultJobFilterMaster hsDefaultJobFilterMaster) {
		this.hsDefaultJobFilterMaster = hsDefaultJobFilterMaster;
	}

}
