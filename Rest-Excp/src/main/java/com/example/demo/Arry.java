package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Arry {
	@GetMapping("/array")
	public String gotArr()
	{
	int c[]= {10,20,30};
	 
	 return "value"+c[4];
	

}
}
