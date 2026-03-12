package com.lpu.DI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentID {
	
	@Value("101")
	private int id;
	
	public void displayId()
	{
		System.out.println("Student id is : " + id);
	}
}
