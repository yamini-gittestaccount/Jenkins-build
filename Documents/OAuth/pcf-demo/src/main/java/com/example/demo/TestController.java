package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/api/test")
	private ResponseEntity<String> test()
	{
		return new ResponseEntity<String>("Hello!! Welcome to the PCF demo session", HttpStatus.OK);
	}

}
