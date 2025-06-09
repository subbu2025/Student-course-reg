package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private Integer bid;
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	public Integer getBid() {
		return bid;
	}
	public String getBname() {
		return bname;
	}
	public Integer getBprice() {
		return bprice;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}
	private String bname;
	private Integer bprice;
	

}
