package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mac.test.service.KafkaService;

@RestController
public class KafakController {

	@Autowired
	KafkaService service;
	
	@GetMapping("/kafka")
	public String processMessage(@RequestParam("message") String message, @RequestParam("name") String Name) {
		service.processMessage(message,Name);
		
		return "Message Placed";
		
	}
}
