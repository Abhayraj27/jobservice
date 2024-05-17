package com.job.exception;

import org.springframework.http.HttpStatus;

public class JobServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	private HttpStatus httpStatus;
	private String message;

	public JobServiceException(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		
	}

}
