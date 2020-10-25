package com.vti.backend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.enum_position;

public class Excercise_1 {
//	Question 1:
//		Tạo constructor cho department:
//		a) không có parameters
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
	
	public void Question_1() {
		Department baove_noparameters = new Department();
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
		Department baove = new Department("sale");
		// prin
		System.out.println(baove_noparameters);
		System.out.println(baove);
	}
	
	
	
//	Question 2:
//		Tạo constructor cho Account:
//		a) Không có parameters
//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
//		d) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, createDate
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public void Question_2() {
		// a) Không có parameters
		Account acc_noparameeters = new Account();
		// b) Có các parameter là id, Email, Username, FirstName,
		//		LastName (với FullName = FirstName + LastName)
		Account acc_b = new Account(1, "huy@gmail.com" , "Huybamboo", "Huy", "Pham");
		// c) Có các parameter là id, Email, Username, FirstName,
		//		LastName (với FullName = FirstName + LastName) và
		//		Position của User, default createDate = now
		Account acc_c = new Account(2, "Long@gmail.com", "Longlong", "Long", "Le");
		// d) Có các parameter là id, Email, Username, FirstName,
		//		LastName (với FullName = FirstName + LastName) và
		//		Position của User, createDate
		
		Account acc_d= new Account(3, "vutham@gmail.com", "vutham", "thamvu", "vu");
		
		
		System.out.println("cau a" + acc_noparameeters);
		System.out.println("cau b" + acc_b);
		System.out.println("cau c" + acc_c);
		System.out.println("cau d" + acc_d);
	}
	// Question 3:
		//	Tạo constructor cho Group:
		//		a) không có parameters
		//		b) Có các parameter là GroupName, Creator, array Account[]
		//		accounts, CreateDate
		//		c) Có các parameter là GroupName, Creator, array String[]
		//		usernames , CreateDate
		//		Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
		//		username, các thông tin còn lại = null).
		//		Khởi tạo 1 Object với mỗi constructor ở trên
	public void Question_3() {
		// a) không có parameters
		Group gr_a = new Group();
		System.out.println("cau a" + gr_a);
		// b) Có các parameter là GroupName, Creator, array Account[]
		//		accounts, CreateDate
		Account creator = new Account(1, "long1@gmail.com", "longsan", "Long1", "Le 1");
		Account creator1 = new Account(1, "long2@gmail.com", "longsan2", "Long2", "Le 2");
		Account creator2 = new Account(1, "long3@gmail.com", "longsan3", "Long3", "Le 3");
		Account[] acc_creator = {creator, creator1, creator2};
		Group gr_b = new Group(1, "g1", creator, acc_creator, LocalDate.parse("2020-01-01"));
		System.out.println("cau b " + gr_b);
		// c) Có các parameter là GroupName, Creator, array String[]
		//		usernames , CreateDate
		String[] usernamess = {"rong1" , "rong2" , "rong3"};
		Group gr_c = new Group("acb", creator, usernamess, LocalDate.parse("2020-01-01"));
		System.out.println(gr_c);
	}

}
