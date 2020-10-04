package com.vti.entity;

import java.time.LocalDate;

public class Account {
	private int  accountID;
	private String email;
	private String userName;
	private String fullName;
	private Department department;
	private Position position;
	private LocalDate createDate;
	private Gender_account gender;
	private GroupAccount[] groups;
	
	public Account() {      // a) k co parameter
	}
	// b) Có các parameter là id, Email, Username, FirstName,LastName (với FullName = FirstName + LastName)
	public Account(int accountID, String email, String userName, String lastname, String fisrtname ) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fisrtname + " " + lastname;		
	}
	// c) Có các parameter là id, Email, Username, FirstName,
			//	LastName (với FullName = FirstName + LastName) và
			//	Position của User, default createDate = now
	public Account(int accountID, String email, String userName, String lastname, String fisrtname, Position position) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fisrtname + " " + lastname;
		this.position = position;
		this.createDate = LocalDate.now();		
	}
	
	// d) d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và
			// Position của User, createDate
	public Account(int accountID, String email, String userName, String lastname, String fisrtname, Position position, LocalDate createDate) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fisrtname + " " + lastname;
		this.position = position;
		this.createDate = createDate;		
	}
	public int getaccountID() {
		return accountID;
	}
	public void getaccountID (int accountID) {
		this.accountID = accountID;
	}
	public String email() {
		return email;
	}
	public void getemail (String email) {
		this.email = email;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName (String userName) {
		this.userName = userName;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName (String fullName) {
		this.fullName = fullName;
	}
	public Department getdepartment() {
		return department;
	}
	public void setdepartment (Department department) {
		this.department = department;
	}
	public Position getposition() { 
		return position;
	}
	public void setposition (Position position) {
		this.position = position;
	}
	public LocalDate getcreateDate () {
		return createDate;
	}
	public void setcreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Gender_account getgender() {
		return gender;
	}
	public void setgender(Gender_account gender) {
		this.gender = gender;
	}
	public GroupAccount[] groups() {
		return groups;
	}
	public void setgroups(GroupAccount[] groups) {
		this.groups = groups();
	}
}
