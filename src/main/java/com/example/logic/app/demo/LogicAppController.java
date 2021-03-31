package com.example.logic.app.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class LogicAppController {
	
	
	private static String url="none1";
	
	int count =0;
	@PostMapping("/entryPoint")
	public String entryPoint(@RequestBody TestMethod test) {
		System.out.println("in the host");
		LogicAppController.url=test.getCallBackUrl();
		return "hello";
	}
	
	@GetMapping("/entryPoint")
	public String getentryPoint() {
		count++;
		System.out.println("in the host");
		HttpEntity<TestMethod> request = new HttpEntity<>(new TestMethod());
		RestTemplate restTemplate = new RestTemplate();
		String temp=null;
		try {
		if(!url.equalsIgnoreCase("none1")) {
			String[] tempUrl = LogicAppController.url.split("callBackUrl:");
			 temp = tempUrl[1].replace("}", "").replace("\"", "");
		restTemplate.exchange(LogicAppController.url, HttpMethod.POST, request, TestMethod.class);
		}
		}catch(Exception e) {
			url = url+ e.getMessage()+" "+temp;
		}
		return "test"+count+LogicAppController.url;
	}

}
