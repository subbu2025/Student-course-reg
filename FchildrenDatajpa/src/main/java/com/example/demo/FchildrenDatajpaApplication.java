package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FchildrenDatajpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con=SpringApplication.run(FchildrenDatajpaApplication.class, args);
		RepoInterf txt= con.getBean(RepoInterf.class);
		Fdet a= new Fdet();
		a.setNo(1);
		a.setName("Subbarao");
		a.setClas(16);
		a.setSchool("Nagarjuna");
		txt.save(a);
		
		System.out.print("The Record Is Inserted");
		
	}

}
