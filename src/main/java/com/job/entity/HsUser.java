package com.job.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "hs_users")
public class HsUser {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hs_user_id_seq")
	@SequenceGenerator(name = "hs_user_id_seq", allocationSize = 1)
	@Column
	private Long userId;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acl_map_id")
	private HsAclGroupMap hsAclMap;

	@Column
	private String email;

	@Column
	private Integer status;

	@Column
	private String activationCode;

	@Column
	private Date lastLogin;

	@Column
	private Long createdBy;

	@Column
	private Long modifiedBy;

	@Column
	private Date createdDate;

	@Column
	private String password;

	@Column
	private Date modifiedDate;

	@Column
	private Date passwordResetDate;

	@Column
	private Long startDuration;

	@Column
	private Long endDuration;

	@Column
	private Integer userFlag;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HsAclGroupMap getHsAclMap() {
		return hsAclMap;
	}

	public void setHsAclMap(HsAclGroupMap hsAclMap) {
		this.hsAclMap = hsAclMap;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getPasswordResetDate() {
		return passwordResetDate;
	}

	public void setPasswordResetDate(Date passwordResetDate) {
		this.passwordResetDate = passwordResetDate;
	}

	public Long getStartDuration() {
		return startDuration;
	}

	public void setStartDuration(Long startDuration) {
		this.startDuration = startDuration;
	}

	public Long getEndDuration() {
		return endDuration;
	}

	public void setEndDuration(Long endDuration) {
		this.endDuration = endDuration;
	}

	public Integer getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(Integer userFlag) {
		this.userFlag = userFlag;
	}

}
