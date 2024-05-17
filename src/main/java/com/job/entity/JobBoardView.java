package com.job.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job_master_view")
public class JobBoardView {
	@Id
	@Column
	private Long id;
	@Column
	private String jobTitle;
	@Column
	private String hiringManager;
	@Column
	private String company;
	@Column
	private String location;
	@Column
	private String postDate;
	@Column
	private Long custId;
	@Column
	private Integer status;

	public JobBoardView() {

	}

	public JobBoardView(String jobTitle) {

	}

	public JobBoardView(Long id, String jobTitle, String hiringManager, String company, String location, String postDate,
			Long custId, Integer status) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.hiringManager = hiringManager;
		this.company = company;
		this.location = location;
		this.postDate = postDate;
		this.custId = custId;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getHiringManager() {
		return hiringManager;
	}

	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
