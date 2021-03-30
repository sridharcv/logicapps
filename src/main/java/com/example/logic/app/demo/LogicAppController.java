package com.example.logic.app.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LogicAppController {
	
	
	private  static String url="none1";
	
	@PostMapping("/entryPoint")
	public String entryPoint(@RequestBody String callBackUrl) {
		System.out.println("in the host");
		this.url=callBackUrl;
		return "hello";
	}
	
	@GetMapping("/entryPoint")
	public String getentryPoint() {
		System.out.println("in the host");
		return url;
	}

}
