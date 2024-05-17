package com.job.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_craigslist")
public class HsCraigslist {
	@Id
	Integer craigslistId;
	@Column
	String craigslistUrl;
	@Column
	String zip;
	@Column
	String zipName;
	@Column
	String city;
	@Column
	String state;
	@Column
	String areaCode;
	@Column
	Long price;

	public Integer getCraigslistId() {
		return craigslistId;
	}

	public void setCraigslistId(Integer craigslistId) {
		this.craigslistId = craigslistId;
	}

	public String getCraigslistUrl() {
		return craigslistUrl;
	}

	public void setCraigslistUrl(String craigslistUrl) {
		this.craigslistUrl = craigslistUrl;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
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

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}
