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
@Table(name = "hs_cust_billing_info")
public class HsCustBillingInfo {
	@Id
	@Column(name = "cust_billing_id")
	private Integer custBillingId;
	@Column(name = "name_of_card")
	private String nameOfCard;
	@Column(name = "card_type")
	private Integer cardType;
	@Column(name = "expire_month")
	private Integer expireMonth;
	@Column(name = "street_address")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip")
	private String zip;
	@Column(name = "balance")
	private Double balance;
	@Column(name = "authorize_profile_id")
	private String authorizeProfileId;
	@Column(name = "authorize_payment_id")
	private String authorizePaymentId;
	@Column(name = "status")
	private Integer status;
	@Column(name = "created_by")
	private Long createdBy;
	@Column(name = "modified_by")
	private Long modifiedBy;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "expire_year")
	private Integer expireYear;
	@Column(name = "suite_bldg_unitaddress")
	private String suiteBldgUnitaddress;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id")
	private HsCustomerMaster hsCustomerMaster;

	public HsCustomerMaster getHsCustomerMaster() {
		return hsCustomerMaster;
	}

	public void setHsCustomerMaster(HsCustomerMaster hsCustomerMaster) {
		this.hsCustomerMaster = hsCustomerMaster;
	}

	public Integer getCustBillingId() {
		return custBillingId;
	}

	public void setCustBillingId(Integer custBillingId) {
		this.custBillingId = custBillingId;
	}

	public String getNameOfCard() {
		return nameOfCard;
	}

	public void setNameOfCard(String nameOfCard) {
		this.nameOfCard = nameOfCard;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public Integer getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(Integer expireMonth) {
		this.expireMonth = expireMonth;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAuthorizeProfileId() {
		return authorizeProfileId;
	}

	public void setAuthorizeProfileId(String authorizeProfileId) {
		this.authorizeProfileId = authorizeProfileId;
	}

	public String getAuthorizePaymentId() {
		return authorizePaymentId;
	}

	public void setAuthorizePaymentId(String authorizePaymentId) {
		this.authorizePaymentId = authorizePaymentId;
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

	public Integer getExpireYear() {
		return expireYear;
	}

	public void setExpireYear(Integer expireYear) {
		this.expireYear = expireYear;
	}

	public String getSuiteBldgUnitaddress() {
		return suiteBldgUnitaddress;
	}

	public void setSuiteBldgUnitaddress(String suiteBldgUnitaddress) {
		this.suiteBldgUnitaddress = suiteBldgUnitaddress;
	}

}
