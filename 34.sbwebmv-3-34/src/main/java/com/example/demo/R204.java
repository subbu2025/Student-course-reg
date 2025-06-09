package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class R204 {
	public R204()
	{
		
	}
	@Id
	private Integer no;
	@Override
	public String toString() {
		return "R204 [no=" + no + ", deg=" + deg + ", name=" + name + ", sal=" + sal + ", village=" + village + "]";
	}
	public R204(Integer no, String deg, String name, Integer sal, String village) {
		super();
		this.no = no;
		this.deg = deg;
		this.name = name;
		this.sal = sal;
		this.village = village;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	private String deg;
	private String name;
	private Integer sal;
	private String village;

}
