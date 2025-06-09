 package com.example.controler;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dbcls.R204;
import com.example.demo.repo.Servicess;

@Controller
public class RoomControler {
	RoomControler()
	{
		System.out.print("this is controler class");
	}
	@Autowired 
	private Servicess serv;
	
	@GetMapping("/dis")
	public ModelAndView getDispaly()
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("disp",new R204());
		mv.setViewName("display");
		
		return mv;
	}
	
	
	
	@PostMapping("/save")
	public ModelAndView saveR204Det(R204 disp )
	{
		ModelAndView mv= new ModelAndView();
		System.out.println(disp);
	
		boolean status=serv.saveR204Det(disp);
		if(status)
		{
			mv.addObject("succmsg","book Saved");
		}
		else
		{
			mv.addObject("error","book is failed to SAvE");
		}
		
		mv.addObject("disp", disp);
		mv.setViewName("display");
		 
		return mv;
		 
		
	}
	
	@GetMapping("/del")
	public ModelAndView deleteRecord(@RequestParam("no")Integer no) {
	serv.deleteRecord(no);
	ModelAndView mvr = new ModelAndView();
	List <R204> mem =serv.getAllDet();
	
	mvr.addObject("det",mem);
	mvr.setViewName("rooms");
	return mvr;
	}
	
	
	 
	 
	
	@GetMapping("/give") 
	public ModelAndView getAllInfo()
	{
		ModelAndView mvr = new ModelAndView();
		List <R204> mem =serv.getAllDet();
		
		mvr.addObject("det",mem);
		mvr.setViewName("rooms");
		return mvr;
		
		
	}

}
