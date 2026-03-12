package com.collections;

import java.util.HashMap;

class Salary
{
	HashMap<String, Integer> empList = new HashMap<>();
	
	public int totalSalary()
	{
		int total = 0;
		
		for(int i : empList.values())
			total += i;
		
		return total;
	}
	
	public String getSalary(String designation)
	{
		if(empList.containsKey(designation))
			return "Salary is " + empList.get(designation);
		else
			return "No designation matching";
	}
	
	public void updateSalary(String designation, int newSalary)
	{
		empList.put(designation, newSalary);
	}
}

public class SalaryDesignation {
	public static void main(String[] args) {
		
		Salary obj = new Salary();
		obj.empList.put("CEO", 20000);
		obj.empList.put("Developer", 5000);
		
		System.out.println(obj.totalSalary());
		
		obj.updateSalary("Developer", 6000);
		System.out.println(obj.getSalary("Developer"));
	}
}
