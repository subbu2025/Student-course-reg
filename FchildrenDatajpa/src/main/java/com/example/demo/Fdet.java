package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity

public class Fdet {
	@Id
	private Integer no;
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getClas() {
		return clas;
	}
	public void setClas(Integer clas) {
		this.clas = clas;
	}
	public String getSchool() {
		return school;
	}
	private String name;
	private Integer clas;
	private String school;
	public void setSchool(String string) {
		// TODO Auto-generated method stub
		
	}

}
