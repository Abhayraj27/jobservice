package com.job.response.dto;

public class JobDto {

	private String jobTitle;
	private String hiringManager;
	private String company;
	private String location;

	public JobDto(String jobTitle, String hiringManager, String company, String location) {
		super();
		this.jobTitle = jobTitle;
		this.hiringManager = hiringManager;
		this.company = company;
		this.location = location;
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

}
