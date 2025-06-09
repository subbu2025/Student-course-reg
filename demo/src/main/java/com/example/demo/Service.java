package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	public Service()
	{
		System.out.println("Service :: constructor");
	}
	private demodao ksr;
	
	
	
	@Autowired 
	public void setKsr(demodao ksr) {
		this.ksr = ksr;
	}
	public void getNumber(int i)
	{
		String name =ksr.findNameById(i);
	
		System.out.print(name);
}
}
	

