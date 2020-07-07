package com.qa.person;

abstract class User {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String maritalStatus;
	
	//constructors
	public User() {
		
	}
	
	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
				
	}
	
	public User(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
				
	}
	// getters and setters
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getMStatus() {
		return maritalStatus;
	}
	public void setMStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
	
	

}
