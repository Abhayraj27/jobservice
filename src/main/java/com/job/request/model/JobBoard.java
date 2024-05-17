package com.job.request.model;

import java.io.Serializable;
import java.util.List;

public class JobBoard implements Serializable {

	private static final long serialVersionUID = 4208559506689259898L;

	boolean isFreeJobboardChecked = true;
	List<Integer> paidJobBoardId;
	private String couponCode;

	public boolean isFreeJobboardChecked() {
		return isFreeJobboardChecked;
	}

	public void setFreeJobboardChecked(boolean isFreeJobboardChecked) {
		this.isFreeJobboardChecked = isFreeJobboardChecked;
	}

	public List<Integer> getPaidJobBoardId() {
		return paidJobBoardId;
	}

	public void setPaidJobBoardId(List<Integer> paidJobBoardId) {
		this.paidJobBoardId = paidJobBoardId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "JobBoard [isFreeJobboardChecked=" + isFreeJobboardChecked + ", paidJobBoardId=" + paidJobBoardId
				+ ", couponCode=" + couponCode + "]";
	}

}
