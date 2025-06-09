package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RoomApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con=SpringApplication.run(RoomApplication.class, args);
	
	Services srm=con.getBean(Services.class);
	//srm.savedetails();
	//srm.saveMoreDet();
	//srm.find();
	//srm.findtwo();
	//srm.findtot();
	srm.del();
	}
}
