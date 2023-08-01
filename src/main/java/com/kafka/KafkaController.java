package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	KafkaService  service;
	
	
	@GetMapping("/kafka")
	public String processMessage(@RequestParam String message ,@RequestParam String value ) {
		
		service.processMessage(message,value );
		
	return "Message Placed";
		
	}
	
	

}
