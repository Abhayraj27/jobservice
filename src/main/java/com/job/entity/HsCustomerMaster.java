package com.job.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsCustomerMaster")
public class HsCustomerMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long custId;
	@Column
	private String companyName;
	@Column
	private String aboutCompany;
	@Column
	private String companyLogo;
	@Column
	private String contactName;
	@Column
	private String securityWord;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;

	@Column
	private String phone;
	@Column
	private String fax;
	@Column
	private Integer status;
	@Column
	private String streetAddress;

	@Column
	private String contactEmail;
	@Column
	private String referSite;
	@Column
	private String promoCode;
	@Column
	private Long createdBy;
	@Column
	private Long modifiedBy;
	@Column
	private Date createdDate;
	@Column
	private Date modifiedDate;
	@Column
	private String AcNo;
	@Column
	private String suiteBldgUnitaddress;
	@Column
	private Integer timezoneId;

	@Column
	private Double custBalance;
	@Column
	private Long firstMonsterJob;
	@Column
	private Boolean custSuspendFlg;
	@Column
	private Boolean canPostJobBoardCraigslist;
	@Column
	private Boolean canPostJobBoardDice;
	@Column
	private Boolean canPostJobBoardEbayClassifieds;
	@Column
	private Boolean canPostJobBoardGlassdoor;
	@Column
	private Boolean canPostJobBoardIndeed;
	@Column
	private Boolean canPostJobBoardJuju;
	@Column
	private Boolean canPostJobBoardMonster;
	@Column
	private Boolean canPostJobBoardOlx;
	@Column
	private Boolean canPostJobBoardOodle;
	@Column
	private Boolean canPostJobBoardSimplyHired;
	@Column
	private Boolean canPostJobBoardIndeedSponsored;
	@Column
	private Boolean canPostJobBoardMonsterFree;
	@Column
	private Boolean canPostJobBoardSimplyHiredSponsored;
	@Column(name="can_post_job_board_generic_a")
	private Boolean canPostJobBoardGenericA;
	@Column(name="can_post_job_board_generic_b")
	private Boolean canPostJobBoardGenericB;
	@Column(name="can_post_job_board_generic_c")
	private Boolean canPostJobBoardGenericC;
	@Column(name="can_post_job_board_generic_d")
	private Boolean canPostJobBoardGenericD;
	@Column(name="can_post_job_board_generic_e")
	private Boolean canPostJobBoardGenericE;
	@Column
	private Boolean canPostJobBoardTopUsaJobs;
	@Column
	private Boolean canPostJobBoardTrovit;
	@Column
	private Boolean canPostJobBoardYakaz;
	@Column
	private Boolean canPostJobBoardJobInventory;
	@Column
	private Boolean canPostJobBoardUsJobs;
	@Column
	private Boolean canPostJobBoardTopUsaJobsSponsored;
	@Column
	private Boolean canPostJobBoardLinkedIn;
	@Column
	private Boolean canPostJobBoardJobs2careers;
	@Column
	private Boolean canPostJobBoardZipRecruiter;
	@Column
	private Boolean canPostJobBoardHiringstepsPremium;
	@Column
	private Boolean canPostJobBoardZipRecruiterOrganic;
	@Column
	private String companyWebsite;
	@Column
	private Boolean canPostJobBoardCareerBuilder;
	@Column
	private Boolean canPostJobBoardFacebook;
	@Column
	private Boolean canPostJobBoardAdzuna;
	@Column
	private Boolean canPostJobBoardJb1;
	@Column
	private Boolean canPostJobBoardJb2;
	@Column
	private Boolean canPostJobBoardGoogle;
	@Column
	private Boolean canPostJobBoardIndeedPromo;

	

//	public Integer getSubModuleId() {
//		return subModuleId;
//	}
//
//	public void setSubModuleId(Integer subModuleId) {
//		this.subModuleId = subModuleId;
//	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getSecurityWord() {
		return securityWord;
	}

	public void setSecurityWord(String securityWord) {
		this.securityWord = securityWord;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getReferSite() {
		return referSite;
	}

	public void setReferSite(String referSite) {
		this.referSite = referSite;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
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

	public String getAcNo() {
		return AcNo;
	}

	public void setAcNo(String acNo) {
		AcNo = acNo;
	}

	public String getSuiteBldgUnitaddress() {
		return suiteBldgUnitaddress;
	}

	public void setSuiteBldgUnitaddress(String suiteBldgUnitaddress) {
		this.suiteBldgUnitaddress = suiteBldgUnitaddress;
	}

	public Integer getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(Integer timezoneId) {
		this.timezoneId = timezoneId;
	}

	public Double getCustBalance() {
		return custBalance;
	}

	public void setCustBalance(Double custBalance) {
		this.custBalance = custBalance;
	}

	public Long getFirstMonsterJob() {
		return firstMonsterJob;
	}

	public void setFirstMonsterJob(Long firstMonsterJob) {
		this.firstMonsterJob = firstMonsterJob;
	}

	public Boolean getCustSuspendFlg() {
		return custSuspendFlg;
	}

	public void setCustSuspendFlg(Boolean custSuspendFlg) {
		this.custSuspendFlg = custSuspendFlg;
	}

	public Boolean getCanPostJobBoardCraigslist() {
		return canPostJobBoardCraigslist;
	}

	public void setCanPostJobBoardCraigslist(Boolean canPostJobBoardCraigslist) {
		this.canPostJobBoardCraigslist = canPostJobBoardCraigslist;
	}

	public Boolean getCanPostJobBoardDice() {
		return canPostJobBoardDice;
	}

	public void setCanPostJobBoardDice(Boolean canPostJobBoardDice) {
		this.canPostJobBoardDice = canPostJobBoardDice;
	}

	public Boolean getCanPostJobBoardEbayClassifieds() {
		return canPostJobBoardEbayClassifieds;
	}

	public void setCanPostJobBoardEbayClassifieds(Boolean canPostJobBoardEbayClassifieds) {
		this.canPostJobBoardEbayClassifieds = canPostJobBoardEbayClassifieds;
	}

	public Boolean getCanPostJobBoardGlassdoor() {
		return canPostJobBoardGlassdoor;
	}

	public void setCanPostJobBoardGlassdoor(Boolean canPostJobBoardGlassdoor) {
		this.canPostJobBoardGlassdoor = canPostJobBoardGlassdoor;
	}

	public Boolean getCanPostJobBoardIndeed() {
		return canPostJobBoardIndeed;
	}

	public void setCanPostJobBoardIndeed(Boolean canPostJobBoardIndeed) {
		this.canPostJobBoardIndeed = canPostJobBoardIndeed;
	}

	public Boolean getCanPostJobBoardJuju() {
		return canPostJobBoardJuju;
	}

	public void setCanPostJobBoardJuju(Boolean canPostJobBoardJuju) {
		this.canPostJobBoardJuju = canPostJobBoardJuju;
	}

	public Boolean getCanPostJobBoardMonster() {
		return canPostJobBoardMonster;
	}

	public void setCanPostJobBoardMonster(Boolean canPostJobBoardMonster) {
		this.canPostJobBoardMonster = canPostJobBoardMonster;
	}

	public Boolean getCanPostJobBoardOlx() {
		return canPostJobBoardOlx;
	}

	public void setCanPostJobBoardOlx(Boolean canPostJobBoardOlx) {
		this.canPostJobBoardOlx = canPostJobBoardOlx;
	}

	public Boolean getCanPostJobBoardOodle() {
		return canPostJobBoardOodle;
	}

	public void setCanPostJobBoardOodle(Boolean canPostJobBoardOodle) {
		this.canPostJobBoardOodle = canPostJobBoardOodle;
	}

	public Boolean getCanPostJobBoardSimplyHired() {
		return canPostJobBoardSimplyHired;
	}

	public void setCanPostJobBoardSimplyHired(Boolean canPostJobBoardSimplyHired) {
		this.canPostJobBoardSimplyHired = canPostJobBoardSimplyHired;
	}

	public Boolean getCanPostJobBoardIndeedSponsored() {
		return canPostJobBoardIndeedSponsored;
	}

	public void setCanPostJobBoardIndeedSponsored(Boolean canPostJobBoardIndeedSponsored) {
		this.canPostJobBoardIndeedSponsored = canPostJobBoardIndeedSponsored;
	}

	public Boolean getCanPostJobBoardMonsterFree() {
		return canPostJobBoardMonsterFree;
	}

	public void setCanPostJobBoardMonsterFree(Boolean canPostJobBoardMonsterFree) {
		this.canPostJobBoardMonsterFree = canPostJobBoardMonsterFree;
	}

	public Boolean getCanPostJobBoardSimplyHiredSponsored() {
		return canPostJobBoardSimplyHiredSponsored;
	}

	public void setCanPostJobBoardSimplyHiredSponsored(Boolean canPostJobBoardSimplyHiredSponsored) {
		this.canPostJobBoardSimplyHiredSponsored = canPostJobBoardSimplyHiredSponsored;
	}

	public Boolean getCanPostJobBoardGenericA() {
		return canPostJobBoardGenericA;
	}

	public void setCanPostJobBoardGenericA(Boolean canPostJobBoardGenericA) {
		this.canPostJobBoardGenericA = canPostJobBoardGenericA;
	}

	public Boolean getCanPostJobBoardGenericB() {
		return canPostJobBoardGenericB;
	}

	public void setCanPostJobBoardGenericB(Boolean canPostJobBoardGenericB) {
		this.canPostJobBoardGenericB = canPostJobBoardGenericB;
	}

	public Boolean getCanPostJobBoardGenericC() {
		return canPostJobBoardGenericC;
	}

	public void setCanPostJobBoardGenericC(Boolean canPostJobBoardGenericC) {
		this.canPostJobBoardGenericC = canPostJobBoardGenericC;
	}

	public Boolean getCanPostJobBoardGenericD() {
		return canPostJobBoardGenericD;
	}

	public void setCanPostJobBoardGenericD(Boolean canPostJobBoardGenericD) {
		this.canPostJobBoardGenericD = canPostJobBoardGenericD;
	}

	public Boolean getCanPostJobBoardGenericE() {
		return canPostJobBoardGenericE;
	}

	public void setCanPostJobBoardGenericE(Boolean canPostJobBoardGenericE) {
		this.canPostJobBoardGenericE = canPostJobBoardGenericE;
	}

	public Boolean getCanPostJobBoardTopUsaJobs() {
		return canPostJobBoardTopUsaJobs;
	}

	public void setCanPostJobBoardTopUsaJobs(Boolean canPostJobBoardTopUsaJobs) {
		this.canPostJobBoardTopUsaJobs = canPostJobBoardTopUsaJobs;
	}

	public Boolean getCanPostJobBoardTrovit() {
		return canPostJobBoardTrovit;
	}

	public void setCanPostJobBoardTrovit(Boolean canPostJobBoardTrovit) {
		this.canPostJobBoardTrovit = canPostJobBoardTrovit;
	}

	public Boolean getCanPostJobBoardYakaz() {
		return canPostJobBoardYakaz;
	}

	public void setCanPostJobBoardYakaz(Boolean canPostJobBoardYakaz) {
		this.canPostJobBoardYakaz = canPostJobBoardYakaz;
	}

	public Boolean getCanPostJobBoardJobInventory() {
		return canPostJobBoardJobInventory;
	}

	public void setCanPostJobBoardJobInventory(Boolean canPostJobBoardJobInventory) {
		this.canPostJobBoardJobInventory = canPostJobBoardJobInventory;
	}

	public Boolean getCanPostJobBoardUsJobs() {
		return canPostJobBoardUsJobs;
	}

	public void setCanPostJobBoardUsJobs(Boolean canPostJobBoardUsJobs) {
		this.canPostJobBoardUsJobs = canPostJobBoardUsJobs;
	}

	public Boolean getCanPostJobBoardTopUsaJobsSponsored() {
		return canPostJobBoardTopUsaJobsSponsored;
	}

	public void setCanPostJobBoardTopUsaJobsSponsored(Boolean canPostJobBoardTopUsaJobsSponsored) {
		this.canPostJobBoardTopUsaJobsSponsored = canPostJobBoardTopUsaJobsSponsored;
	}

	public Boolean getCanPostJobBoardLinkedIn() {
		return canPostJobBoardLinkedIn;
	}

	public void setCanPostJobBoardLinkedIn(Boolean canPostJobBoardLinkedIn) {
		this.canPostJobBoardLinkedIn = canPostJobBoardLinkedIn;
	}

	public Boolean getCanPostJobBoardJobs2careers() {
		return canPostJobBoardJobs2careers;
	}

	public void setCanPostJobBoardJobs2careers(Boolean canPostJobBoardJobs2careers) {
		this.canPostJobBoardJobs2careers = canPostJobBoardJobs2careers;
	}

	public Boolean getCanPostJobBoardZipRecruiter() {
		return canPostJobBoardZipRecruiter;
	}

	public void setCanPostJobBoardZipRecruiter(Boolean canPostJobBoardZipRecruiter) {
		this.canPostJobBoardZipRecruiter = canPostJobBoardZipRecruiter;
	}

	public Boolean getCanPostJobBoardHiringstepsPremium() {
		return canPostJobBoardHiringstepsPremium;
	}

	public void setCanPostJobBoardHiringstepsPremium(Boolean canPostJobBoardHiringstepsPremium) {
		this.canPostJobBoardHiringstepsPremium = canPostJobBoardHiringstepsPremium;
	}

	public Boolean getCanPostJobBoardZipRecruiterOrganic() {
		return canPostJobBoardZipRecruiterOrganic;
	}

	public void setCanPostJobBoardZipRecruiterOrganic(Boolean canPostJobBoardZipRecruiterOrganic) {
		this.canPostJobBoardZipRecruiterOrganic = canPostJobBoardZipRecruiterOrganic;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	public Boolean getCanPostJobBoardCareerBuilder() {
		return canPostJobBoardCareerBuilder;
	}

	public void setCanPostJobBoardCareerBuilder(Boolean canPostJobBoardCareerBuilder) {
		this.canPostJobBoardCareerBuilder = canPostJobBoardCareerBuilder;
	}

	public Boolean getCanPostJobBoardFacebook() {
		return canPostJobBoardFacebook;
	}

	public void setCanPostJobBoardFacebook(Boolean canPostJobBoardFacebook) {
		this.canPostJobBoardFacebook = canPostJobBoardFacebook;
	}

	public Boolean getCanPostJobBoardAdzuna() {
		return canPostJobBoardAdzuna;
	}

	public void setCanPostJobBoardAdzuna(Boolean canPostJobBoardAdzuna) {
		this.canPostJobBoardAdzuna = canPostJobBoardAdzuna;
	}

	public Boolean getCanPostJobBoardJb1() {
		return canPostJobBoardJb1;
	}

	public void setCanPostJobBoardJb1(Boolean canPostJobBoardJb1) {
		this.canPostJobBoardJb1 = canPostJobBoardJb1;
	}

	public Boolean getCanPostJobBoardJb2() {
		return canPostJobBoardJb2;
	}

	public void setCanPostJobBoardJb2(Boolean canPostJobBoardJb2) {
		this.canPostJobBoardJb2 = canPostJobBoardJb2;
	}

	public Boolean getCanPostJobBoardGoogle() {
		return canPostJobBoardGoogle;
	}

	public void setCanPostJobBoardGoogle(Boolean canPostJobBoardGoogle) {
		this.canPostJobBoardGoogle = canPostJobBoardGoogle;
	}

	public Boolean getCanPostJobBoardIndeedPromo() {
		return canPostJobBoardIndeedPromo;
	}

	public void setCanPostJobBoardIndeedPromo(Boolean canPostJobBoardIndeedPromo) {
		this.canPostJobBoardIndeedPromo = canPostJobBoardIndeedPromo;
	}

}
