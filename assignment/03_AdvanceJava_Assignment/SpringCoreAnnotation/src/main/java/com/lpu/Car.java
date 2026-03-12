package com.lpu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCar")
public class Car {

	@Value("BMW")
	private String name;

	@Value("2000CC")
	private String cc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	
	public void start()
	{
		System.out.println("Car started");
	}
}
