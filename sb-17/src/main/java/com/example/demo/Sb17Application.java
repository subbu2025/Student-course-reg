package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb17Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext txt=
				SpringApplication.run(Sb17Application.class, args);
		 MainServ src=txt.getBean(MainServ.class);
		 src.mainRegister("ksr","kummarapallisubbarao1@gmail.com","SU@123456789");
		 
	}

}
