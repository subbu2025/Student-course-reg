package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Data
@Entity
public class Person {
	@Id
	private  int pid;
	private int page;
	private String pname;

	
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAge(int page) {
		this.page = page;
	}
}
	
