package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb20jpastudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext name=SpringApplication.run(Sb20jpastudentApplication.class, args);
		
		StuRepo tro=name.getBean(StuRepo.class);
		
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("subbarao");
		s1.setSage(24);
		
		tro.save(s1);


		
	
		System.out.print("RECORD INSERTED ,CHECK ONCESS");
	}
		
		
		
	}


