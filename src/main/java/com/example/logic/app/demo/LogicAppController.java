package com.example.logic.app.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LogicAppController {
	
	
	private  static String url="none";
	
	@PostMapping("/entryPoint")
	public String entryPoint(@RequestParam(name = "callBackUrl") TestMethod url) {
		System.out.println("in the host");
		this.url=url.getUrl();
		return "hello";
	}
	
	@GetMapping("/entryPoint")
	public String getentryPoint() {
		System.out.println("in the host");
		return url;
	}

}
