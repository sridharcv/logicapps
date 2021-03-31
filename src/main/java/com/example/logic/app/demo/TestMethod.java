package com.example.logic.app.demo;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TestMethod {

	@JsonProperty("callBackUrl")
	private String callBackUrl;
	
	@JsonProperty("data")
	private String data;

	public String getCallBackUrl() {
		return callBackUrl;
	}

	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public  String getUrl() {
		return callBackUrl;
	}

	public void setUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}
	
}
