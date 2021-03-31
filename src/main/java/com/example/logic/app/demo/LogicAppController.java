package com.example.logic.app.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	    url=test.getCallBackUrl();
		return "hello";
	}
	
	@GetMapping("/entryPoint")
	public String getentryPoint() {
		count++;
		System.out.println("in the host");

		RestTemplate restTemplate = new RestTemplate();
		String temp="";
		try {
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<String> request = new HttpEntity<>("test", headers);
			ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
		}catch(Exception e) {
			temp = url+ " ----->end of url:"+ e.getMessage();
		}
		return "test"+count+temp;
	}

}
