package com.lpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("101")
	private int id;
	
	@Value("Ansh")
	private String name;
	
//	@Autowired
	private AadharCard card;
	
	public Person()
	{
		
	}
	
	@Autowired
	public Person(AadharCard card)
	{
		this.card = card;
	}
	
//	@Autowired
	public void setCard(AadharCard card) {  // here autowired goes to local variable then global i.e card
		this.card = card;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharCard getCard() {
		return card;
	}
	
}
