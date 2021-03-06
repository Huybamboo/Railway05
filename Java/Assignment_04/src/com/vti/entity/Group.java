package com.vti.entity;

import java.time.LocalDate;

public class Group {
	private Account creator;
	private int id;
	private String name;
	private LocalDate createDate;
	private Account[] accounts;
	
	// a) không có parameters
	public Group() {
	}
	
	// b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
	public Group(int id, String name, Account creator, Account[] accounts, LocalDate createDate) {
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}
	
	// c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
		// Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
													// username, các thông tin còn lại = null).
	public Group(String name, Account creator, String[] userNames, LocalDate createDate ) {
		this.name = name;
		this.creator =creator;
		this.createDate = createDate;
		
		Account[] bangaccount = new Account[userNames.length];
		for (int i = 0; i < userNames.length; i++) {
			bangaccount[i] = new Account(userNames[i]);
		}
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

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
		

	
}
