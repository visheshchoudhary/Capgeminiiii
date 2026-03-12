package com.lpu.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Delivery_ID;
	private String type;
	private String status;
	
	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private List<Order> order;

	public int getDelivery_ID() {
		return Delivery_ID;
	}

	public void setDelivery_ID(int delivery_ID) {
		Delivery_ID = delivery_ID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
}
