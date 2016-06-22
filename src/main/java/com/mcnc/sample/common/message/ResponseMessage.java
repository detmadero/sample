/*
 * Created on 28th May. 2015
 */
package com.mcnc.sample.common.message;


/**
 * ResponseDTO Class
 * @author vembona
 * @param <T>
 *
 */
public class ResponseMessage<T> {
	
	private T body;
	private ResponseHeader header;

	/**
	 * get body
	 * @return body
	 */
	public T getBody() {
		return body;
	}

	/**
	 * set body
	 * @param body
	 */
	public void setBody(T body) {
		this.body = body;
	}
	
	/**
	 * get header
	 * @return header
	 */
	public ResponseHeader getHeader() {
		if(header == null){
			header = new ResponseHeader();
		}
		return header;
	}
	
	/**
	 * set header
	 * @param header
	 */
	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	/* Modified by
	 * @author : raingsey
	 * */
	@Override
	public String toString() {
		return "ResponseMessage [body=" + body + ", header=" + header + "]";
	}
	
}

