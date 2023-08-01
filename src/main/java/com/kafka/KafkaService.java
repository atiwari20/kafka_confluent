package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String , String> kafak ;
		
						
	private String formatval="{message is :%s, name is :%s}";

	public void processMessage(String message,String name ) {		
		kafak.send("confluent.spring.topic", String.format(formatval,message, name));
	}
	
	
}



