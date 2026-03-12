package com.lpu.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Order {

	private int Order_ID;
	private String Order_date;
		
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@OneToOne
	@JoinColumn(name = "delivery_id")
	private Delivery delivery;
	
	@ManyToMany
	@JoinTable(
			name = "order_product",
			joinColumns = @JoinColumn(name = "order_id"))
	
	private List<Products> products;

	public int getOrder_ID() {
		return Order_ID;
	}

	public void setOrder_ID(int order_ID) {
		Order_ID = order_ID;
	}

	public String getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(String order_date) {
		Order_date = order_date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
}
