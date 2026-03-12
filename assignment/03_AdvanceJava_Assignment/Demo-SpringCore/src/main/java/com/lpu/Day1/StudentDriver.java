package com.lpu.Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		// creating container
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		
//		System.out.println("Main start");
//		
////		Student student = new Student();
//		Student student = context.getBean("myStudent", Student.class); // IOC
//		student.study();
//		
//		Employee emp = context.getBean("emp", Employee.class);
//		emp.work();
//		
//		College coll = context.getBean("college", College.class);
//		coll.course();
//		
//		System.out.println("Main end");
		
//		Employee e = context.getBean("emp", Employee.class);
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		Laptop laptop = e.getLaptop();
//		laptop.start();
//		e.work();
		
		College col = context.getBean("college", College.class);
		col.showData();
	}
}
