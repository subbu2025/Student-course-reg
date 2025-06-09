package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {
	public User()
	{
		
	}
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer loginid;
	public User(Integer loginid, String username, String passward, String email) {
		super();
		this.loginid = loginid;
		this.username = username;
		this.passward = passward;
		this.email = email;
	}
	public Integer getLoginid() {
		return loginid;
	}
	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String username;
	private String passward;
	private String email;
	

}
