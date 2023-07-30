package com.kafak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String , String> kafak ;
		//	private String formatval="{\"message\": \"&s\",\"name\": \"&s\"}";
						
	private String formatval="{message is :%s, name is :%s}";
	public void processMessage(String message,String name ) {
		//String.format(, name)
		
		kafak.send("quickstart-events", String.format(formatval,message, name));
		
	}
	

    @KafkaListener(topics = "quickstart-events",groupId = "group_id")
	public void consumeMessage(String message) {
	
	
	}
	
}
