package lesson_4;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Group;
import com.vti.entity.Position;


public class Testing_4 {
	public static void main(String[] args) {

		
//  Exercise 1 (Optional): Constructor

	// Question 1
		// a)không có parameters
		Department sale = new Department(); 			// Department
		sale.id  		= 1;
		sale.name 		= "sale";
		
		System.out.println(sale.id + sale.name);
		
		// b) Có 1 parameter là nameDepartment và default id của Department = 0
		Department baove = new Department("abc");
		
		System.out.println(baove);
		
		
	// Question 2
		// a) Không có parameters
		Account acc = new Account();
		System.out.println(acc);
		
		// b) Có các parameter là id, Email, Username, FirstName,
				// LastName (với FullName = FirstName + LastName)
		
		Account acc1 = new Account(1, "abc@gmail.com", "abc", "Pham Van", "Huy");
		System.out.println(acc1);
		
		// c) Có các parameter là id, Email, Username, FirstName,
				//		LastName (với FullName = FirstName + LastName) và
				//		Position của User, default createDate = now
		Position po1 = new Position();
		Account Long = new Account(2, "Long@gmail.com", "Long", "Le Duc", "Long", po1);
		System.out.println(Long);
		// d) Có các parameter là id, Email, Username, FirstName,
				//		LastName (với FullName = FirstName + LastName) và
				//		Position của User, createDate
		Position po2 = new Position();
		Account Tham = new Account(2, "Tham@gmail.com", "Tham", "Vu Thi", "Tham", po2);
		System.out.println(Tham);
	// Question 3
		// a) không có parameters
		Group nhom = new Group();
		System.out.println(nhom);
		
		// b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
		Account creator = new Account(1, "Hiep@gmail.com", "Hiepx", "Do Minh", "Hiep");
		Account Tu = new Account(2, "Tu@gmail.com", "Tus", "Pham Van", "Tu");
		Account Nguyet = new Account(3, "Nguyet@gmail.com", "Nguyetm", "Nguyen Thi", "Nguyet");
		Account[] accounts = { creator, Tu, Nguyet };
		Group group1 = new Group(1, "Sale", creator, accounts, LocalDate.parse("2020-01-01"));
		System.out.println(group1);
		// c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
				// Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
															// username, các thông tin còn lại = null).
		
// Exercise 2: Package
	// Question 1: DONE
	// Question 2: con cau b
	
		
// Exercise 3: Access Modifier
	// Question 1: private access modifier
		// Thay đổi access modifier và tạo getter/ setter của những class trong package entity, frontend, backend cho phù hợp
		
// Exercise 4 : Encapsulation
	// Question 1 Question 1:
			//	Tạo Object Student có các property id, name, hometown, điểm học lực
			//	a) Tất cả các property sẽ để là private để các class khác không
			//	chỉnh sửa hay nhìn thấy
			//	b) Tạo constructor cho phép khi khởi tạo mỗi student thì người
			//	dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
			//	c) Tạo 1 method cho phép set điểm vào
			//	d) Tạo 1 method cho phép cộng thêm điểm
			//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
			//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
			//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
			//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
			//	Demo các chức năng trên bằng class ở front-end.
} 
}
