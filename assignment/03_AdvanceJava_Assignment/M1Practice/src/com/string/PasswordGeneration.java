package com.string;

import java.util.Scanner;

public class PasswordGeneration {

	public static String generatePass(String s)
	{
		if(s.length() != 8)
		{
			return "Invalid Username";
		}
		
		if(!s.matches("^[A-Z]{4}@(10[1-9]|11[0-5])"))
		{
			return "Invalid Username";
		}
		
		String firstFour = s.substring(0, 4).toLowerCase();
		
		int sum = 0;
		for(char c : firstFour.toCharArray())
		{
			sum += c;
		}
		
		String pass = "TECH_" + sum + s.substring(6, 8);
		return pass;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(generatePass(s));
	}
}
