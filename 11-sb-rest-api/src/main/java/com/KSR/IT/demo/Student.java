package com.KSR.IT.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student

{
	public Student()
	{
		
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sid;
		public Student(Integer sid, String sname, Integer sclass) {
			super();
			this.sid = sid;
			Sname = sname;
			this.sclass = sclass;
		}
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public Integer getSclass() {
			return sclass;
		}
		public void setSclass(Integer sclass) {
			this.sclass = sclass;
		}
		private String Sname;
		private Integer sclass;
		
}
