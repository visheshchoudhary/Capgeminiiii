package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class CakeOrder
{
	private Map<String, Double> orderMap = new LinkedHashMap<>();
	
	public Map<String, Double> getMap()
	{
		return orderMap;
	}
	
	public void setMap(Map<String, Double> orderMap)
	{
		this.orderMap = orderMap;
	}
	
	public void addOrderDetails(String orderId, double cakeCost)
	{
		orderMap.put(orderId, cakeCost);
	}
	
	public Map<String, Double> findOrdersAboveSpecified(double cakeCost)
	{
		Map<String, Double> res = new LinkedHashMap<>();
		
		for(Map.Entry<String, Double> entry : orderMap.entrySet())
		{
			if(entry.getValue() > cakeCost)
				res.put(entry.getKey(), entry.getValue());
		}
		
		return res;
	}
}

public class CakeQuestion {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CakeOrder cake = new CakeOrder();
		
		System.out.println("Enter the number of cakes orders to be added");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the cake order details (Order Id: CakeCost)");
		
		for(int i = 0; i < n; i++)
		{
			String s = sc.nextLine();
			String[] arr = s.split(":");
			
			String orderId = arr[0];
			double cost = Double.parseDouble(arr[1]);
			
			cake.addOrderDetails(orderId, cost);
		}
		
		System.out.println("Enter the cost to search the cake orders");
		
		double cakeCost = sc.nextDouble();
		
		Map<String, Double> res = cake.findOrdersAboveSpecified(cakeCost);
		
		if(res.isEmpty())
			System.out.println("Cake not found");
		else
		{
			System.out.println("Cake Orders above the specified cost");
			for(Map.Entry<String, Double> entry : res.entrySet())
			{
				System.out.println("Order ID: " + entry.getKey() + ", Cake Cost: " + entry.getValue());
			}
		}
		
	}
}
