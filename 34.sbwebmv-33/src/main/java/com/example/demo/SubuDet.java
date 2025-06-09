package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SubuDet {
	SubuDet()
	{
		System.out.println("my details");
		
	}
	@GetMapping("/subbu")
	public ModelAndView getDetails()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("res","RESUME");
		mv.addObject("name", "SUBBARAO KUMMARAPALLI");
		mv.addObject("mail","kummarapallisubbarao1@gmail.com");
		mv.addObject("con","7659030220");
		mv.setViewName("inx");
		return mv;
	}

}
