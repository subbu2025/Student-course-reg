package com.example.demo.Sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/get")
	public String getConnection() {
		return"connected";
		
	}

}
