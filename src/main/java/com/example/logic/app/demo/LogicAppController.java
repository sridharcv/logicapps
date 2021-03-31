package com.example.logic.app.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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
		Map<String, Object> map = new HashMap<>();
		map.put("userId", 1);
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
	    HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
		RestTemplate restTemplate = new RestTemplate();
		String temp="";
		try {

		restTemplate.postForEntity(LogicAppController.url.trim(), entity, String.class);
		}catch(Exception e) {
			temp = LogicAppController.url+ " ----->end of url:"+ e.getMessage();
		}
		return "test"+count+temp;
	}

}
