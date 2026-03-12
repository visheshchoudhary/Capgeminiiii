package com.lpu.DAY3;

public class RegEx {
	
	public static boolean isValid(String s)
	{
		return s.matches("^[A-Za-z]{5}/\\d{4}");
	}

	public static void main(String[] args) {
		String s = "GOAIR/1233";
		
		System.out.println(isValid(s));
	}
}
