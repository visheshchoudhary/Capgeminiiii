package com.lpu.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Delivery_ID;
	private String type;
	private String status;
	
	@OneToOne(mappedBy = "delivery")
	private Order order;
	
	
}
