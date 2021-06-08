package com.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/ribbon-consumer")
	public String helloConsumer(){
		System.out.println("into helloConsumer");
		return restTemplate.getForEntity("http://SERVICE-FRONTEND/hi?name=yuhang", String.class).getBody();
	}
}
