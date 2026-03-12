package com.exception;

import java.util.Scanner;

class InvalidEntryException extends Exception
{
	public InvalidEntryException(String message)
	{
		super(message);
	}
}

class EntryUtility
{
	public static boolean validateEmployeeId(String employeeId) throws InvalidEntryException
	{
		if(!employeeId.matches("^[A-Za-z]{5}/\\d{4}"))
			throw new InvalidEntryException("Invalid");
		
		return true;
	}
	
	public static boolean validateDuration(int duration) throws InvalidEntryException
	{
		if(duration < 1 || duration > 5)
			throw new InvalidEntryException("Invalid");
		return true;
	}
}

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of entries");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) 
		{
			System.out.println("Enter entry " + i + " details");
			String input = sc.nextLine();
			try {
				String[] arr = input.split(":");
				String id = arr[0];
				int duration = Integer.parseInt(arr[2]);
				EntryUtility.validateEmployeeId(id);
				EntryUtility.validateDuration(duration);
				
				System.out.println("Valid Entry Details");
				
			} catch (Exception e) {
				System.out.println("Invalid entry details");
			}
		}
	}
}
