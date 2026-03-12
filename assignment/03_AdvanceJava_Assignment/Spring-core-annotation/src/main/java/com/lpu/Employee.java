package com.lpu;

import org.springframework.stereotype.Component;

@Component(value = "myEmp")
public class Employee {
	
	public void work()
	{
		System.out.println("Working");
	}
}
