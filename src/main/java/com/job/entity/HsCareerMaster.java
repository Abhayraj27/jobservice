package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hs_career_master")
public class HsCareerMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hs_career_id_seq")
	@SequenceGenerator(name = "hs_career_id_seq", allocationSize = 1)
	@Column
	private Integer careerId;

	@Column
	private String careerLevel;

	@Column
	private Long createdBy;

	@Column
	private Date createdDate;

	@Column
	private Long modifiedBy;

	@Column
	private Date modifiedDate;

	public Integer getCareerId() {
		return careerId;
	}

	public void setCareerId(Integer careerId) {
		this.careerId = careerId;
	}

	public String getCareerLevel() {
		return careerLevel;
	}

	public void setCareerLevel(String careerLevel) {
		this.careerLevel = careerLevel;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
