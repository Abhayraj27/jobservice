package com.job.exception;

public class ExceptionResponseView {
	private String code;
	private String message;
	private String info;

	public ExceptionResponseView(String code, String message, String info) {
		super();
		this.code = code;
		this.message = message;
		this.info = info;
	}

	public ExceptionResponseView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "ExceptionResponseView [code=" + code + ", message=" + message + ", info=" + info + "]";
	}

}
