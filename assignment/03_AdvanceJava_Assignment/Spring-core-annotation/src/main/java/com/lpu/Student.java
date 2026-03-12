package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent") // bean id if not giving value then it will by default take the class name for ex student for this class
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("XYZ")
	private String name;
	
	public void study()
	{
		System.out.println("Sleeping");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
