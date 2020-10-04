package com.vti.entity;

public class Department {
	private int id;
	private String name;
	public Account[] accounts;
	
	public Department() {
		
	}
	
	public Department(String name) {
		this.id = 0;
		this.name = name;
	}
	
	
	public int getid() {
		return id;
	}
		
	public void setId(int id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public String toString() {
		String result = "";
		result = "ID" + id;
		result = name;
		return result;
	}
}
