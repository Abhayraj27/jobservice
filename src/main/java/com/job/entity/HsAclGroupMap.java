package com.job.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hs_acl_group_map")
public class HsAclGroupMap {

	@Id
	@Column
	private Integer aclMapId;

	@Column
	private Integer aclId;

	@Column
	private String aclName;

	@Column
	private Integer groupId;

	@Column
	private Integer status;

	@Column
	private Long createdBy;

	@Column
	private Long modifiedBy;

	@Column
	private Date createdDate;

	@Column
	private Date modifiedDate;

	public Integer getAclMapId() {
		return aclMapId;
	}

	public void setAclMapId(Integer aclMapId) {
		this.aclMapId = aclMapId;
	}

	public Integer getAclId() {
		return aclId;
	}

	public void setAclId(Integer aclId) {
		this.aclId = aclId;
	}

	public String getAclName() {
		return aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
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

}
