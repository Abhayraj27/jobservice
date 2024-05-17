package com.job.response.dto;

import java.util.List;

public class JobSearchDto<T> {
	private Integer count;
	private List<T> data;
	private Error error;

	public Integer getStatus () {
		return Status;
	}

	public void setStatus ( Integer status ) {
		Status = status;
	}

	private Integer Status;


	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public static class Error {

		private String code;
		private String title;
		private String details;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}
	}
}
