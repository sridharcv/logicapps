package com.example.logic.app.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LogicAppController {
	
	
	@PostMapping("/entryPoint")
	public String entryPoint() {
		System.out.println("in the host");
		
		return null;
	}
	
	@GetMapping("/entryPoint")
	public String getentryPoint() {
		System.out.println("in the host");
		return null;
	}

}
