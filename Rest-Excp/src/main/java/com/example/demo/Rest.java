package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {
	@GetMapping("/get")
	
	public String getExcep()
	{
		int i=4/0;
		return "we are getting exception";
	//eturn e.getMesage();
	}
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArthamaticException(ArithmeticException ex)
	
	
	{
		return new ResponseEntity<>("Can't divide by zero",HttpStatus.BAD_GATEWAY);
		
		
	}

}
