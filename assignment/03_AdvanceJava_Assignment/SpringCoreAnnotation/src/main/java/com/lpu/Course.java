package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCourse")
public class Course {
	
	@Value("Advance Java")
	private String courseName;
	
	@Value("Sandeep Sir")
	private String trainerName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public void getDetails()
	{
		System.out.println(courseName + " " + trainerName);
	}
}
