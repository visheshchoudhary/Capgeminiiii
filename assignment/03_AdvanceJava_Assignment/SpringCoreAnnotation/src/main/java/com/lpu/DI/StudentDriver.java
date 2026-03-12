package com.lpu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lpu.MyConfig;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student s = context.getBean("student", Student.class);
//		StudentID id = s.getId();
//		id.displayId();
//		System.out.println(id);
		System.out.println(s);
		
//		Vehicle v = s.getV();
//		v.start();
		
//		Fruit f = s.getF();
//		f.eat();
		
		Student s2 = context.getBean("student", Student.class);
		System.out.println(s2);
		
	}
}
