package com.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Apartment
{
	private Map<String, Double> apartmentDetailsMap = new LinkedHashMap<>();
	
	public Map<String, Double> getMap()
	{
		return apartmentDetailsMap;
	}
	
	public void setMap(Map<String, Double> apartmentDetailsMap)
	{
		this.apartmentDetailsMap = apartmentDetailsMap;
	}
	
	public void addApartmentDetails(String apartmentNumber, double rent)
	{
		apartmentDetailsMap.put(apartmentNumber, rent);
	}
	
	public double findTotalRentOfApartmentInTheGivenRange(double minimumRent, double maximumRent)
	{
		double total = 0;
		
		for(Map.Entry<String, Double> entry : apartmentDetailsMap.entrySet())
		{
			double rent = entry.getValue();
			
			if(rent >= minimumRent && rent <= maximumRent)
				total += rent;
		}
		
		return total;
	}
}

public class HeavenHomes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Apartment apart = new Apartment();
		
		System.out.println("Enter number of details to be added");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the details (Apartment number: Rent)");
		
		for(int i = 0; i < n; i++)
		{
			String s = sc.nextLine();
			String[] arr = s.split(":"); 
			
			String id = arr[0];
			int cost = Integer.parseInt(arr[1]);
			
			apart.addApartmentDetails(id, cost);
		}
		
		System.out.println("Enter the range to filter the details");
		
		double minRent = sc.nextDouble();   
		double maxRent = sc.nextDouble();
		
		System.out.println("Total rent in the range " + minRent + " to " + maxRent + " USD:" + apart.findTotalRentOfApartmentInTheGivenRange(minRent, maxRent));
	}
}
