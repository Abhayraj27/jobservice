package com.job.response.dto;

import java.util.List;

public class JobCreateDto<T> {
	private List<T> data;
	private Error error;

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

}
