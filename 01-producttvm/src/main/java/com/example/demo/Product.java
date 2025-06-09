package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id  // Primary key annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID
    private Integer loginid;  // This field will act as the primary key

    private String name;

    @Column(name = "category")  // Mapping the category column correctly in DB
    private String category;  // Fixed spelling from 'catageory' to 'category'

    private String description;
    private Integer price;

    // Getters and setters
    public Integer getLoginid() {
        return loginid;
    }

    public void setLoginid(Integer loginid) {
        this.loginid = loginid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
