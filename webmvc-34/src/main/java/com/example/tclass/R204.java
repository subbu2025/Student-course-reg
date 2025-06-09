package com.example.tclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class R204 {

    @Id
    private Integer no;  // Room number or unique identifier

    private String deg;  // Degree (or position/department/role)
    private String name; // Name of the person
    private Integer sal; // Salary
    private String village; // Village name (location)

    // Default constructor (required by JPA)
    public R204() {
    }

    // Parameterized constructor for easy object creation
    public R204(Integer no, String deg, String name, Integer sal, String village) {
        this.no = no;
        this.deg = deg;
        this.name = name;
        this.sal = sal;
        this.village = village;
    }

    // Getters and Setters
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

    // Optional: Add a toString method for debugging or logging
    @Override
    public String toString() {
        return "R204 [no=" + no + ", deg=" + deg + ", name=" + name + ", sal=" + sal + ", village=" + village + "]";
    }
}
