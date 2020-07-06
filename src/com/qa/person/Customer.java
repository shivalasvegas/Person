package com.qa.person;

public class Customer extends User {
	
	
	private boolean isEmployed;
	
	// Customers
	public Customer() {
		super();
		
	}

	public Customer(int id, String name, int age) {
		super(id, name, age);
		
	}
	
	public Customer(int id, String name, int age, boolean isEmployed) {
		super(id, name, age);
		this.isEmployed = isEmployed;
	}
	
	
}
