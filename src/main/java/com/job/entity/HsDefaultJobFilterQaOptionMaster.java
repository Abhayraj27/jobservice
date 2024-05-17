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
@Table(name = "hs_default_job_filter_qa_option_master")
public class HsDefaultJobFilterQaOptionMaster {
	@Id
	Integer defaultOptionId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "defaultQaId")
	HsdefaultJobFilterQaMaster hsdefaultJobFilterQaMaster;
	@Column(name="option_value")
	String optionValue;
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
	Boolean correctAnswer;

	public Integer getDefaultOptionId() {
		return defaultOptionId;
	}

	public void setDefaultOptionId(Integer defaultOptionId) {
		this.defaultOptionId = defaultOptionId;
	}

	public HsdefaultJobFilterQaMaster getHsdefaultJobFilterQaMaster() {
		return hsdefaultJobFilterQaMaster;
	}

	public void setHsdefaultJobFilterQaMaster(HsdefaultJobFilterQaMaster hsdefaultJobFilterQaMaster) {
		this.hsdefaultJobFilterQaMaster = hsdefaultJobFilterQaMaster;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
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

	public Boolean getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

}
