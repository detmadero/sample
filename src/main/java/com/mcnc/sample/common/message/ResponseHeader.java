/*
 * Created on 28th May 2015
 */
package com.mcnc.sample.common.message;


/**
 * HeaderDTO Class
 * @author vembona
 *
 */
public class ResponseHeader {
	
	private Boolean result;
	private Integer statusCode;
	private String errorText;

	/**
	 * get result
	 * @return result
	 */
	public Boolean getResult() {
		return result;
	}

	/**
	 * set result
	 * @param result
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}


	/**
	 * get error text
	 * @return errorText
	 */
	public String getErrorText() {
		return errorText;
	}

	/**
	 * set error text
	 * @param errorText
	 */
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	/**
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	/* Modified by
	 * @author : raingsey
	 * */
	@Override
	public String toString() {
		return "ResponseHeader [result=" + result + ", statusCode="
				+ statusCode + ", errorText=" + errorText + "]";
	}


}