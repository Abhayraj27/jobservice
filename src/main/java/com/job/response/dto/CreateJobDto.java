package com.job.response.dto;

import java.io.Serializable;

public class CreateJobDto implements Serializable {

	private String companyName;
	private String jobCode;
	private String jobDescription;
	private String requirement;
	private String experience;
	private String city;
	private String state;
	private String zipcode;
	private Integer jobSalary;
	private String hiringManager;
	private String jobType;
	private String jobCategory;
	private String jobTitle;
	private Integer min;
	private Integer max;
	private Integer jobPostingDuration;
	//applyLink

	public CreateJobDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateJobDto(String companyName, String jobCode, String jobDescription, String requirement,
			String experience, String city, String state, String zipcode, Integer jobSalary, String hiringManager,
			String jobType, String jobCategory, String jobTitle, Integer min, Integer max, Integer jobPostingDuration) {
		super();
		this.companyName = companyName;
		this.jobCode = jobCode;
		this.jobDescription = jobDescription;
		this.requirement = requirement;
		this.experience = experience;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.jobSalary = jobSalary;
		this.hiringManager = hiringManager;
		this.jobType = jobType;
		this.jobCategory = jobCategory;
		this.jobTitle = jobTitle;
		this.min = min;
		this.max = max;
		this.jobPostingDuration = jobPostingDuration;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getJobSalary() {
		return jobSalary;
	}

	public void setJobSalary(Integer jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getHiringManager() {
		return hiringManager;
	}

	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getJobPostingDuration() {
		return jobPostingDuration;
	}

	public void setJobPostingDuration(Integer jobPostingDuration) {
		this.jobPostingDuration = jobPostingDuration;
	}

}
