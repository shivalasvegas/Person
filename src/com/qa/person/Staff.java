package com.qa.person;

public class Staff extends User {
	private String role;
	
	// constructors
	public Staff() {
		super();
		
	}
	
	public Staff(int id, String name, int age) {
		super(id, name, age);
		
	}
	
	public Staff(int id, String name, int age, String role) {
		super(id, name, age);
		this.role = role;
	}

	@Override
	public String toString() {
		return "Staff [getName()=" + getName() + ", getGender()=" + getGender() + "]";
	}

	
	
}
