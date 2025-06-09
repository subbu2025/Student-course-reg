package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class User {
	public User()
	{
		System.out.println(" this is User Class0");
	}
	@GetMapping("/user")
	public ModelAndView getMsg()
	{
		ModelAndView m= new ModelAndView();
		m.addObject("msg1", "K.SUBBU");
		m.addObject("msg2", "SaiKumar");
		m.setViewName("index");
		
		return m;
	}
	

}
