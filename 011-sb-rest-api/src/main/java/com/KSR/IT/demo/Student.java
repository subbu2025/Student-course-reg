package com.KSR.IT.demo;

import org.springframework.web.bind.annotation.RestController;


public class Student {
	public Student()
	{
		
	}
	private Integer sid;
	public Student(Integer sid, String sname, Integer sclass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSclass() {
		return sclass;
	}
	public void setSclass(Integer sclass) {
		this.sclass = sclass;
	}
	private String sname;
	private Integer sclass;

}
