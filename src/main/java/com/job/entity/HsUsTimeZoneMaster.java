package com.job.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hs_us_timezone_master")
public class HsUsTimeZoneMaster {
	@Id
	@Column
	private Integer timezoneId;
	@Column
	private String timezoneCode;
	@Column
	private String timezoneName;
	@Column
	private String daylightSaving;
	@Column
	private Integer status;
	@Column
	private String timezone;

	public HsUsTimeZoneMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HsUsTimeZoneMaster(Integer timezoneId, String timezoneCode, String timezoneName, String daylightSaving,
			Integer status, String timezone) {
		super();
		this.timezoneId = timezoneId;
		this.timezoneCode = timezoneCode;
		this.timezoneName = timezoneName;
		this.daylightSaving = daylightSaving;
		this.status = status;
		this.timezone = timezone;
	}

	public Integer getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(Integer timezoneId) {
		this.timezoneId = timezoneId;
	}

	public String getTimezoneCode() {
		return timezoneCode;
	}

	public void setTimezoneCode(String timezoneCode) {
		this.timezoneCode = timezoneCode;
	}

	public String getTimezoneName() {
		return timezoneName;
	}

	public void setTimezoneName(String timezoneName) {
		this.timezoneName = timezoneName;
	}

	public String getDaylightSaving() {
		return daylightSaving;
	}

	public void setDaylightSaving(String daylightSaving) {
		this.daylightSaving = daylightSaving;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

}
