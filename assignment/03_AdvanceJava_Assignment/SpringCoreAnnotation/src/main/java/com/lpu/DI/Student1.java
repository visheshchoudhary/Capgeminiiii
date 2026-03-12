package com.lpu.DI;
	
public class Student1 {
	
	private static Student1 student;
	
	private Student1()
	{
		System.out.println("Object Created");
	}
	
	public static Student1 instance()
	{
		if(student == null)
			student = new Student1();
		
		return student;
	}
	
	public static Student1 getStudent()
	{
		return student;
	}
	
	public static void main(String[] args) {
		Student1 s1 = Student1.instance();
		Student1 s2 = Student1.instance();
		Student1 s3 = Student1.instance();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}