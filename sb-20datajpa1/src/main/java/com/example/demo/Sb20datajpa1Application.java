package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb20datajpa1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext name=SpringApplication.run(Sb20datajpa1Application.class, args);
		 
		BookRepo txt=name.getBean(BookRepo.class);
		
	Book b = new Book(); b.setBid(101); b.setBname("Spring");
	 b.setBprice(105);
	 
	 txt.save(b);
	 
	 System.out.println("Record inserted.....");
	 
	}

}

