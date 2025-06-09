package com.inventory.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Long productId;
	    private Integer stock;
		public Integer getStock() {
			
			return null;
		}
		public Object getProductId() {
			
			return null;
		}
		
		
	
	}



