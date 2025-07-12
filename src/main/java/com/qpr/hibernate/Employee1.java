package com.qpr.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee1 {

	@Id
	private int id;
	private String name;
	private Double sal;
	private String deg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	private long mob;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + ", deg=" + deg + ", mob=" + mob + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
