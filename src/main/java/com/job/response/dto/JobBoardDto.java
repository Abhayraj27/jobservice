package com.job.response.dto;

import java.io.Serializable;

public class JobBoardDto implements Serializable {

	private String jobTitle;
	private String hiringManager;
	private String company;
	private String location;
	private String postDate;

	public JobBoardDto(String jobTitle, String hiringManager, String company, String location, String postDate) {
		super();
		this.jobTitle = jobTitle;
		this.hiringManager = hiringManager;
		this.company = company;
		this.location = location;
		this.postDate = postDate;
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

}
