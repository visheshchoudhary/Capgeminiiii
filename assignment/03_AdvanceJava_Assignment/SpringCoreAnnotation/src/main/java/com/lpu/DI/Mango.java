package com.lpu.DI;

import org.springframework.stereotype.Component;

@Component
public class Mango implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating Mango");
	}
	
}
