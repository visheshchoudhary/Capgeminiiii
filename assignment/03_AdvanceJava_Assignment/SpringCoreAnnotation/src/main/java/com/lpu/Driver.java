package com.lpu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
//		Car c = context.getBean(Car.class, "myCar");
//		System.out.println(c.getName());
//		System.out.println(c.getCc());
//		
//		c.start();
//		
//		Course course = context.getBean(Course.class, "myCourse");
//		System.out.println(course.getCourseName());
//		System.out.println(course.getTrainerName());
//		
//		course.getDetails();
//		
//		Employee e = context.getBean(Employee.class, "myEmp");
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		System.out.println(e.getSal());
		
//		College1 col = context.getBean("myCollege1", College1.class);
//		System.out.println(col.getId());
//		System.out.println(col.getName());
//		System.out.println(col.getLocation());
//		System.out.println(col.getDepartment());
		
		Person p = context.getBean("person", Person.class);
		System.out.println(p.getId());
		System.out.println(p.getName());
		
		AadharCard card = p.getCard();
//		card.getInfo();
		
		System.out.println(card);
	}
}
