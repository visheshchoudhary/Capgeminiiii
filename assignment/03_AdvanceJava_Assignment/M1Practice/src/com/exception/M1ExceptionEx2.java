package com.exception;

import java.util.Scanner;

class InvalidGadgetException extends Exception
{
	public InvalidGadgetException(String message)
	{
		super(message);
	}
}

class GadgetValidatorUtil
{
	public static boolean validateGadgetId(String gadgetId) throws InvalidGadgetException
	{
		if(!gadgetId.matches("^[A-Z]{1}\\d{3}$"))
			throw new InvalidGadgetException("Invalid gadget ID");
		return true;
	}
	
	public static boolean validateWarrantyPeriod(int period) throws InvalidGadgetException
	{
		if(period < 6 || period > 36)
			throw new InvalidGadgetException("Invalid warranty period");
		
		return true;
	}
}

public class M1ExceptionEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of gadget entries");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Enter gadget " + i + " details");
			String input = sc.nextLine();
			try
			{
				String[] arr = input.split(":");
				String id = arr[0];
				
				int period = Integer.parseInt(arr[2]);
				
				GadgetValidatorUtil.validateGadgetId(id);
				GadgetValidatorUtil.validateWarrantyPeriod(period);
				
				System.out.println("Warranty accepted, stock updated");
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
