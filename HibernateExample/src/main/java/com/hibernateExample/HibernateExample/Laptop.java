package com.hibernateExample.HibernateExample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	private int lprice;
//	@ManyToOne
//private Employee employee;
	
	

//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLprice() {
		return lprice;
	}
	public void setLprice(int lprice) {
		this.lprice = lprice;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
	}
	
	
	
	
	

}
