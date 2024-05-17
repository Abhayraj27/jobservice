package com.job.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "hs_company_master")
public class HsCompanyMaster {
	@Id
    private Integer companyId;
	@Column
	private Long custId;
	@Column
	private String companyName;
	@Column
	private String companyLogo;
	
	@Column
	private String aboutCompany;
	@Column
	private String linkedinCompanyUrl;
	@Column
	private Integer Status;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

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

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	public String getLinkedinCompanyUrl() {
		return linkedinCompanyUrl;
	}

	public void setLinkedinCompanyUrl(String linkedinCompanyUrl) {
		this.linkedinCompanyUrl = linkedinCompanyUrl;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

}
