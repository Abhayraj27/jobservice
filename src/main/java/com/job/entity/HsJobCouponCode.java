package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_job_coupon_code")
public class HsJobCouponCode {
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name ="code")
	private String code;
	@Column(name = " grant_type")
	private Integer grantType; 
	@Column(name="grant_user_id")
	private Long grantUser;
	@Column(name = "grant_user_list")
	private String grantUserList;
	@Column(name = " date_created")
	private Date dateCreated;
	@Column(name = "date_expired")
	private Date dateExpired;
	@Column(name = "date_modified")
	private Date dateModified;
	@Column(name = "description")
	private String description;
	@Column(name = " discount_amount")
	private Integer discountAmount;
	@Column(name = "discount_board_craigslist")
	private Boolean discountBoardCraigslist;
	@Column(name = "discount_board_dice")
	private Boolean discountBoardDice;
	@Column(name = "discount_board_indeed_sponsored")
	private Boolean discountBoardIndeedSponsored;
	@Column(name = "discount_board_linkedin")
	private Boolean discountBoardLinkedIn;
	@Column(name = "discount_board_monster")
	private Boolean discountBoardMonster;
	@Column(name = "discount_board_simply_hired")
	private Boolean discountBoardSimplyHired;
	@Column(name = "discount_percentage")
	private Integer discountPercentage;
	@Column(name = "discount_type")
	private Integer discountType; 
	@Column(name = "label")
	private String label;
	@Column(name = "max_use_quantity")
	private Integer maxUseQuantity;
	@Column(name = "userIdCreatedBy")
	private Long createdBy;
	@Column(name = "user_id_modified_by")
	private Long userIdModifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getGrantType() {
		return grantType;
	}

	public void setGrantType(Integer grantType) {
		this.grantType = grantType;
	}

	public Long getGrantUser() {
		return grantUser;
	}

	public void setGrantUser(Long grantUser) {
		this.grantUser = grantUser;
	}

	public String getGrantUserList() {
		return grantUserList;
	}

	public void setGrantUserList(String grantUserList) {
		this.grantUserList = grantUserList;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateExpired() {
		return dateExpired;
	}

	public void setDateExpired(Date dateExpired) {
		this.dateExpired = dateExpired;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Integer discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Boolean getDiscountBoardCraigslist() {
		return discountBoardCraigslist;
	}

	public void setDiscountBoardCraigslist(Boolean discountBoardCraigslist) {
		this.discountBoardCraigslist = discountBoardCraigslist;
	}

	public Boolean getDiscountBoardDice() {
		return discountBoardDice;
	}

	public void setDiscountBoardDice(Boolean discountBoardDice) {
		this.discountBoardDice = discountBoardDice;
	}

	public Boolean getDiscountBoardIndeedSponsored() {
		return discountBoardIndeedSponsored;
	}

	public void setDiscountBoardIndeedSponsored(Boolean discountBoardIndeedSponsored) {
		this.discountBoardIndeedSponsored = discountBoardIndeedSponsored;
	}

	public Boolean getDiscountBoardLinkedIn() {
		return discountBoardLinkedIn;
	}

	public void setDiscountBoardLinkedIn(Boolean discountBoardLinkedIn) {
		this.discountBoardLinkedIn = discountBoardLinkedIn;
	}

	public Boolean getDiscountBoardMonster() {
		return discountBoardMonster;
	}

	public void setDiscountBoardMonster(Boolean discountBoardMonster) {
		this.discountBoardMonster = discountBoardMonster;
	}

	public Boolean getDiscountBoardSimplyHired() {
		return discountBoardSimplyHired;
	}

	public void setDiscountBoardSimplyHired(Boolean discountBoardSimplyHired) {
		this.discountBoardSimplyHired = discountBoardSimplyHired;
	}

	public Integer getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Integer discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Integer getDiscountType() {
		return discountType;
	}

	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getMaxUseQuantity() {
		return maxUseQuantity;
	}

	public void setMaxUseQuantity(Integer maxUseQuantity) {
		this.maxUseQuantity = maxUseQuantity;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Long getUserIdModifiedBy() {
		return userIdModifiedBy;
	}

	public void setUserIdModifiedBy(Long userIdModifiedBy) {
		this.userIdModifiedBy = userIdModifiedBy;
	}

}
