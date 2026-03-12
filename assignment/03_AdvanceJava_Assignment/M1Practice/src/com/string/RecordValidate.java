package com.string;

import java.util.Scanner;

public class RecordValidate {

	public static String validate(String record)
	{
		String[] arr = record.split("|");
		String tran = arr[0];
		
		if(!tran.startsWith("TXN-"))
			return "INVALID LOG";
		
		if(tran.charAt(4) == 0)
			return "INVALID LOG";
		
		char[] c = tran.substring(4, 9).toCharArray();
		int count = 1;
		
		for(int i = 0; i < c.length - 1; i++)
		{
			if(c[i] == c[i + 1])
				count++;
			else
				count = 1;
		}
		
		if(count > 3)
			return "INVALID LOG";
		
		String b = arr[1];
		String[] date = b.split("-");
		int year = Integer.parseInt(date[0]);
		String month = date[1];
		int day = Integer.parseInt(date[2]);
		
		if(year < 2000 && year > 2099)
			return "INVALID LOG";
		
		switch(month)
		{
			case "01":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "02":
					if(year > 2000 && year < 2099 && year % 4 == 0)
					{
						if(day < 1 && day > 29)
							return "INVALID LOG";
					}
					else
					{
						if(day < 1 && day > 28)
							return "INVALID LOG";
					}
				break;
				
			case "03":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "04":
				if(day < 1 && day > 30)
					return "INVALID LOG";
				break;
				
			case "05":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "06":
				if(day < 1 && day > 30)
					return "INVALID LOG";
				break;
				
			case "07":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "08":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "09":
				if(day < 1 && day > 30)
					return "INVALID LOG";
				break;
				
			case "10":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
				
			case "11":
				if(day < 1 && day > 30)
					return "INVALID LOG";
				break;
				
			case "12":
				if(day < 1 && day > 31)
					return "INVALID LOG";
				break;
			default:
				System.out.println("INVALID LOG");
		}
		
		
		String curr = arr[2];
		if(!(curr.equals("INR") || curr.equals("CAD") || curr.equals("UK") || curr.equals("USD")))
				return "INVALID LOG";
		
		double amount = Double.parseDouble(arr[3]);
		
		if(amount < 0 && amount > 999999.99)
			return "INVALID LOG";
		
		String status = arr[4];
		
		if(!(status.equals("SUCCESS") || status.equals("PENDING") || status.equals("COMPLETED")))
			return "INVALID LOG";
		
		return "VALID LOG";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		while(T-- > 0)
		{
			String s = sc.nextLine();
			System.out.println(validate(s));
		}
		
		
	}
}
