package com.example.demo;

public class Pasenger {
	
	public Pasenger()
	{
	
	}
	private String name;
	public Pasenger(String name, String email, String gender, String from, String to, String doj, String trianno) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trianno = trianno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrianno() {
		return trianno;
	}
	public void setTrianno(String trianno) {
		this.trianno = trianno;
	}
	private String email;
	private String gender;
	private String from;
	private String to;
	private String  doj;
	private String trianno;

}
