package com.practice.model;

public class Book {
	private int bid;
	private String title;
	private String author;
	private double price; // price cannot be null in db
	
	// if a value can be null in db always use objects, wrapper class, never primitive data type
	
	public Book(int bid, String title, String author, double price)
	{
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
