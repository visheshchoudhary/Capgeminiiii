package com.lpu.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
	private String name;
	private long phone;
	
//	@Autowired
	private StudentID id;
	
	@Autowired
	@Qualifier("bike")
	private Vehicle v; // it don't create interface object it will create child class object i.e Car
	
	@Autowired
	@Qualifier("mango")
	private Fruit f;
	
	public Student()
	{
		
	}

//	@Autowired
//	public Student(StudentID id, Vehicle v) 
//	{
//		this.id = id;
//		this.v = v;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public StudentID getId() {
		return id;
	}

	public void setId(StudentID id) {
		this.id = id;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public Fruit getF() {
		return f;
	}

	public void setF(Fruit f) {
		this.f = f;
	}
	
	
}
