package com.job.request.model;

import java.io.Serializable;

public class JobDescription implements Serializable {

	private static final long serialVersionUID = -4100433672152381233L;

	private Integer companyId;
	private Integer jobCategoryId;
	private String jobTitle;
	private String jobCode;
	private String jobDetails;
	private Location location;
	private JobSalaryType jobSalaryType;
	private Long hiringManagerId;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getJobCategoryId() {
		return jobCategoryId;
	}

	public void setJobCategoryId(Integer jobCategoryId) {
		this.jobCategoryId = jobCategoryId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public JobSalaryType getJobSalaryType() {
		return jobSalaryType;
	}

	public void setJobSalaryType(JobSalaryType jobSalaryType) {
		this.jobSalaryType = jobSalaryType;
	}

	public Long getHiringManagerId() {
		return hiringManagerId;
	}

	public void setHiringManagerId(Long hiringManagerId) {
		this.hiringManagerId = hiringManagerId;
	}

	public static class Location {
		private String city;
		private String state;
		private String zipcode;

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

		@Override
		public String toString() {
			return "Location [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
		}

	}

	public static class JobSalaryType {
		private Integer salaryType;
		private Integer min;
		private Integer max;

		public Integer getSalaryType() {
			return salaryType;
		}

		public void setSalaryType(Integer salaryType) {
			this.salaryType = salaryType;
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

		@Override
		public String toString() {
			return "JobSalaryType [salaryType=" + salaryType + ", min=" + min + ", max=" + max + "]";
		}

	}

	@Override
	public String toString() {
		return "JobDescription [companyId=" + companyId + ", jobCategoryId=" + jobCategoryId + ", jobTitle=" + jobTitle
				+ ", jobCode=" + jobCode + ", jobDetails=" + jobDetails + ", location=" + location + ", jobSalaryType="
				+ jobSalaryType + ", hiringManagerId=" + hiringManagerId + "]";
	}

}
