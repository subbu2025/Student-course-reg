package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class IuserDao implements UserDa0 {
	public IuserDao()
	{
		System.out.println("i user dao ::const");
	}
	public boolean userName(String name  , String gender) {
		System.out.print("Service is created");
		// TODO Auto-generated method stub
		return true;
	}

}
