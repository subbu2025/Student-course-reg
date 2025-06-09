package com.price.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="cost")
public class Pcost {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Pcost()
	{
		
	}
	public Pcost(Integer id, Integer productid, Integer price) {
		super();
		this.id = id;
		this.productid = productid;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	private Integer productid;
	private Integer price;

}
