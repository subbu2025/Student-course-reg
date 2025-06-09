package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class DaoIml implements demodao {
	public  DaoIml()
	{
		System.out.println("dao iml:: constructor");
	}
	
	@Override	
	public String findNameById(Integer i)
	{
	if(i==100)
	{
		return "Subbu";
	}
	else if(i==200)
	{
		return "Hare";
		
	}
	else
	{
		return "Krishna";
	}
	

}
}

