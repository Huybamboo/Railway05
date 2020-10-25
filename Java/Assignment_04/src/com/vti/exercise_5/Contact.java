package com.vti.exercise_5;

public class Contact {
	long number;
	String name;
	
	public Contact() {
		
	}
	
	public Contact(long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
