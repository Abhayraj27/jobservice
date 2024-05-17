package com.job.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class JobServiceExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobServiceException.class);

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponseView handleException(final Exception exception,
			final HttpServletRequest request) {

		LOGGER.error("Exception Occurred : {} ", exception.getMessage(), exception);
		ExceptionResponseView exceptionResponseView = new ExceptionResponseView();
		exceptionResponseView.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
		exceptionResponseView.setMessage(HttpStatus.INTERNAL_SERVER_ERROR.name());
		exceptionResponseView.setInfo("Something went wrong, request processing failed");
		return exceptionResponseView;
	}

	@ExceptionHandler(JobServiceException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponseView handleJobServiceException(final Exception exception,
			final HttpServletRequest request) {
		LOGGER.error("Exception Occurred : {} ", exception.getMessage(), exception);
		ExceptionResponseView exceptionResponseView = new ExceptionResponseView();
		exceptionResponseView.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
		exceptionResponseView.setMessage(HttpStatus.BAD_REQUEST.name());
		exceptionResponseView.setInfo(exception.getMessage());
		return exceptionResponseView;
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody ExceptionResponseView handleNullException(final Exception exception,
			final HttpServletRequest request) {
		LOGGER.error("Exception Occurred : {} ", exception.getMessage(), exception);
		ExceptionResponseView exceptionResponseView = new ExceptionResponseView();
		exceptionResponseView.setCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
		exceptionResponseView.setMessage(HttpStatus.BAD_REQUEST.name());
		exceptionResponseView.setInfo(exception.getMessage());
		return exceptionResponseView;
	}

}