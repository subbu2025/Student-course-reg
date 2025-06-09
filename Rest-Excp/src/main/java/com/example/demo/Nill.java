package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Nill {
	@GetMapping("/null")
	public String getExcep()
	{
		String a = null;
		int  b= a.length();
		 
		
		
		return "check onces your getting null exception";
	}
	
	 
	

}
