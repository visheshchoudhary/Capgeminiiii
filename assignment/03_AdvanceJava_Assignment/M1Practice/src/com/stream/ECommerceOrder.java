package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Order
{
	int orderId;
	String customerName;
	String category;
	double amount;
	String city;
	String status;
	
	public Order(int orderId, String customerName, String category, double amount, String city, String status)
	{
		this.orderId = orderId;
		this.customerName = customerName;
		this.category = category;
		this.amount = amount;
		this.city = city;
		this.status = status;
	}
	
	public int getOrderId()
	{
		return orderId;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	@Override
	public String toString()
	{
		return (orderId + " " + customerName + " " + category + " " + amount + " " + city + " " + status);
	}
}

public class ECommerceOrder {

	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order(1, "rishi", "footwear", 3500, "hyd", "paid"));
		list.add(new Order(2, "raju", "clothes", 2200, "phg", "unpaid"));
		list.add(new Order(3, "raju", "footwear", 1300, "lud", "paid"));
		list.add(new Order(4, "udaya", "accesory", 500, "hyd", "unpaid"));
		list.add(new Order(5, "anshul", "footwear", 90000, "hyd", "unpaid"));
		list.add(new Order(6, "tanmay", "clothes", 4000, "lud", "paid"));
		list.add(new Order(7, "anjan", "clothes", 2500, "phg", "paid"));
		list.add(new Order(8, "raju", "footwear", 590, "phg", "unpaid"));
		list.add(new Order(9, "jotham", "accesory", 200, "lud", "paid"));
		
		// get all paid orders
//		list = list.stream().filter(n -> n.getStatus().equals("paid")).collect(Collectors.toList());
//		System.out.println(list);
		
		// count total orders
//		long count = list.stream().count();
//		System.out.println(count);
		
		// find total revenue from paid orders
//		double res = list.stream().filter(n -> n.getStatus().equals("paid")).mapToDouble(Order::getAmount).sum();
//		System.out.println(res);
		
		// find highest order value
//		double res = list.stream().mapToDouble(Order::getAmount).max().orElse(0);
//		System.out.println(res);
		
		// find lowest paid order values
//		double res = list.stream().filter(status -> status.getStatus().equalsIgnoreCase("paid")).mapToDouble(Order::getAmount).min().orElse(0);
//		System.out.println(res);
		
		
		// get unique customer name
//		List<String> res = list.stream().map(Order::getCustomerName).distinct().collect(Collectors.toList());
//		System.out.println(res);
		
		
		// find orders above 50000
//		list = list.stream().filter(n -> n.getAmount() > 50000).collect(Collectors.toList());
//		System.out.println(list);
		
		
		// sort customer by order amount descending
//		list = list.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).collect(Collectors.toList());
//		System.out.println(list);
		
		
		// find top 3 highest orders
//		list = list.stream().sorted(Comparator.comparingDouble(Order::getAmount).reversed()).limit(3).collect(Collectors.toList());
//		System.out.println(list);
		
		
		// group order by category
//		Map<String, List<Order>> map = list.stream().collect(Collectors.groupingBy(Order::getCategory));
//		System.out.println(map);
		
		
		// count orders per category
//		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.counting()));
//		System.out.println(map);
		
		
		// total sales per category
//		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.summingDouble(Order::getAmount)));
//		System.out.println(map);
		
		
		// maximum order per category
//		Map<String, Optional<Order>> map = list.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.maxBy(Comparator.comparingDouble(Order::getAmount))));
//		System.out.println(map);
		
		
		// average order value per category
//		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Order::getCategory, Collectors.averagingDouble(Order::getAmount)));
//		System.out.println(map);
		
		
		// group order by city
//		Map<String, List<Order>> map = list.stream().collect(Collectors.groupingBy(Order::getCity));
//		System.out.println(map);
		
		
		// find city with highest total revenue
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(Order::getCity, Collectors.summingDouble(Order::getAmount)));
		System.out.println(map);
	}
}
