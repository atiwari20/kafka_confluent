package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	TestService  service;
	
	
	@GetMapping("/kafka")
	public String processMessage() {
		String message="abhi";
		String name = "name";
		service.processMessage(message,name);
		
	return "Message Placed";
		
	}
	
	
	@GetMapping("/")
	public String hello() {
		return "Hello Abhisek ";
	}

}
