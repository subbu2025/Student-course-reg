package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Student {
		@Id
		private  Integer sid;
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public void setSage(Integer sage) {
			this.sage = sage;
		}
		public Integer getSid() {
			return sid;
		}
		public String getSname() {
			return sname;
		}
		public Integer getSage() {
			return sage;
		}
		private  String sname;
		private Integer sage;
}
		