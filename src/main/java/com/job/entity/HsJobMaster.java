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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job_master")
public class HsJobMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hs_job_id_seq")
	@SequenceGenerator(name = "hs_job_id_seq", allocationSize = 1)
	@Column
	private Long jobId;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "userId")
	private HsUser user;

	@Column
	private String jobTitle;

	@Column
	private String jobDesc;

	@Column
	private String jobRequirement;

	@Column
	private String city;

	@Column
	private String state;

	@Column
	private String zipcode;

	@Column
	private String salary;

	@Column
	private Integer status;

	@Column
	private Long submittedBy;

	@Column
	private Long modifiedBy;

	@Column
	private Date createdDate;

	@Column
	private Date modifiedDate;

	@Column
	private Integer jobPostingDuration;

	@Column
	private String jobCode;

	@Column
	private Date submittedDate;

	@Column
	private String aboutCompany;

	@Column
	private String companyName;

	@Column
	private Integer jobSalaryType;

	@Column
	private String companyLogo;

	@Column
	private Boolean freeJobboard;

	@Column
	private String jobType;

	@Column
	private String experience;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "careerId")
	private HsCareerMaster hsCareerMaster;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "job_cat_id")
	private HsJobCategoryMaster hsJobCategoryMaster;

	@Column
	private String externalId; // TODO

	@Column
	private Long custId; // TODO

	@Column
	private Date freeJobBoardPostDate;

	@Column
	private Long craigAmount;

	@Column
	private Integer zipLatitude;

	@Column
	private Integer zipLongitude;

	@Column
	private Integer statusSort;

	@Column
	private String couponCode;

	@Column
	private Boolean voiceMessageOptIn;

	@Column
	private Boolean voiceMessageRecorded;

	@Column
	private String voiceMessagePhone;

	@Column
	private Date voiceMessageRecordDate;

	@Column
	private String voiceMessageUrl;

	@Column
	private String externalRecordingId;

	@Column
	private String facebookCompanyUrl;

	@Column
	private String linkedinCompanyUrl;

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public HsUser getUser() {
		return user;
	}

	public void setUser(HsUser user) {
		this.user = user;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public String getJobRequirement() {
		return jobRequirement;
	}

	public void setJobRequirement(String jobRequirement) {
		this.jobRequirement = jobRequirement;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(Long submittedBy) {
		this.submittedBy = submittedBy;
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

	public Integer getJobPostingDuration() {
		return jobPostingDuration;
	}

	public void setJobPostingDuration(Integer jobPostingDuration) {
		this.jobPostingDuration = jobPostingDuration;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getJobSalaryType() {
		return jobSalaryType;
	}

	public void setJobSalaryType(Integer jobSalaryType) {
		this.jobSalaryType = jobSalaryType;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public Boolean isFreeJobboard() {
		return freeJobboard;
	}

	public void setFreeJobboard(Boolean freeJobboard) {
		this.freeJobboard = freeJobboard;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public HsCareerMaster getHsCareerMaster() {
		return hsCareerMaster;
	}

	public void setHsCareerMaster(HsCareerMaster hsCareerMaster) {
		this.hsCareerMaster = hsCareerMaster;
	}

	public HsJobCategoryMaster getHsJobCategoryMaster() {
		return hsJobCategoryMaster;
	}

	public void setHsJobCategoryMaster(HsJobCategoryMaster hsJobCategoryMaster) {
		this.hsJobCategoryMaster = hsJobCategoryMaster;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Date getFreeJobBoardPostDate() {
		return freeJobBoardPostDate;
	}

	public void setFreeJobBoardPostDate(Date freeJobBoardPostDate) {
		this.freeJobBoardPostDate = freeJobBoardPostDate;
	}

	public Long getCraigAmount() {
		return craigAmount;
	}

	public void setCraigAmount(Long craigAmount) {
		this.craigAmount = craigAmount;
	}

	public Integer getZipLatitude() {
		return zipLatitude;
	}

	public void setZipLatitude(Integer zipLatitude) {
		this.zipLatitude = zipLatitude;
	}

	public Integer getZipLongitude() {
		return zipLongitude;
	}

	public void setZipLongitude(Integer zipLongitude) {
		this.zipLongitude = zipLongitude;
	}

	public Integer getStatusSort() {
		return statusSort;
	}

	public void setStatusSort(Integer statusSort) {
		this.statusSort = statusSort;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Boolean isVoiceMessageOptIn() {
		return voiceMessageOptIn;
	}

	public void setVoiceMessageOptIn(Boolean voiceMessageOptIn) {
		this.voiceMessageOptIn = voiceMessageOptIn;
	}

	public Boolean isVoiceMessageRecorded() {
		return voiceMessageRecorded;
	}

	public void setVoiceMessageRecorded(Boolean voiceMessageRecorded) {
		this.voiceMessageRecorded = voiceMessageRecorded;
	}

	public String getVoiceMessagePhone() {
		return voiceMessagePhone;
	}

	public void setVoiceMessagePhone(String voiceMessagePhone) {
		this.voiceMessagePhone = voiceMessagePhone;
	}

	public Date getVoiceMessageRecordDate() {
		return voiceMessageRecordDate;
	}

	public void setVoiceMessageRecordDate(Date voiceMessageRecordDate) {
		this.voiceMessageRecordDate = voiceMessageRecordDate;
	}

	public String getVoiceMessageUrl() {
		return voiceMessageUrl;
	}

	public void setVoiceMessageUrl(String voiceMessageUrl) {
		this.voiceMessageUrl = voiceMessageUrl;
	}

	public String getExternalRecordingId() {
		return externalRecordingId;
	}

	public void setExternalRecordingId(String externalRecordingId) {
		this.externalRecordingId = externalRecordingId;
	}

	public String getFacebookCompanyUrl() {
		return facebookCompanyUrl;
	}

	public void setFacebookCompanyUrl(String facebookCompanyUrl) {
		this.facebookCompanyUrl = facebookCompanyUrl;
	}

	public String getLinkedinCompanyUrl() {
		return linkedinCompanyUrl;
	}

	public void setLinkedinCompanyUrl(String linkedinCompanyUrl) {
		this.linkedinCompanyUrl = linkedinCompanyUrl;
	}

}
