package com.example.logic.app.demo;

public class TestMethod {

	private static String callBackUrl;

	public static String getUrl() {
		return callBackUrl;
	}

	public static void setUrl(String callBackUrl) {
		TestMethod.callBackUrl = callBackUrl;
	}
	
}
