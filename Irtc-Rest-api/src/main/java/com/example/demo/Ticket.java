package com.example.demo;

public class Ticket {
	public Ticket()
	{
	
	}
	private Integer num;
	public Integer  getNum() {
		return num;
	}
	public void setNum(int id) {
		this.num = id;
	}
	private String email;
	public Ticket(String email, String gender, String from, String to, String doj, String trianno, String status) {
		super();
		this.email = email;
		this.gender = gender;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trianno = trianno;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String gender;
	private String from;
	private String to;
	private String  doj;
	private String trianno;
	private String status;

}


