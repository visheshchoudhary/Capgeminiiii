package com.lpu.DI;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}
}
