package com.lpu.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lpu.jdbc.Calculator;

public class TestCalculator {
		
	static Calculator c = null;
	
	@BeforeAll
	public static void CreateObject()
	{
		System.out.println("Before all");
		c = new Calculator();
	}
	
	@Test
	public void testAdd()
	{
		Calculator c = new Calculator();
		int add = c.add(4, 4);
		Assertions.assertEquals(8, add);
		System.out.println("Add method");
	}
	
	@Test
	public void testMul()
	{
		int mul = c.multi(2, 2);
		Assertions.assertEquals(4, mul);
		System.out.println("Multi method");
	}
	
	@Test
	public void testSub()
	{
		int sub = c.sub(10, 5);
		Assertions.assertEquals(0, sub);
		System.out.println("Sub method");
	}
	
	@AfterAll
	public static void afterall()
	{
		System.out.println("After all");
	}
}
