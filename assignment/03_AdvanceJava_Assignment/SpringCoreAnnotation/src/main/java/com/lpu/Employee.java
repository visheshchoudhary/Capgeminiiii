package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
	
@Component("myEmp")
public class Employee {

	private int id;
	private String name;
	private double sal;
	
//	public Employee() { 
//		default values will come 0, null, 0.0
//	}

	public Employee(@Value("101") int id, @Value("Raju") String name, @Value("40000") double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}
	
//	@Value("108")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

//	@Value("Ansh")
	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}
	
//	@Value("50000")
	public void setSal(double sal) {
		this.sal = sal;
	}
}
