package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Emailser {
	public Emailser()
	{
		System.out.println("Email::conster");
	}

	public boolean send(String from ,String to, String sub)
	{
		System.out.println("email sent");
		return true;
	}
}
