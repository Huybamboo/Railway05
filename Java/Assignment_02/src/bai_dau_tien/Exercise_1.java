package bai_dau_tien;

// import java.text.DateFormat;
import java.time.LocalDate;
// import java.util.Locale;


public class Exercise_1 {
public static void main(String[] args) {
	Department sale = new Department(); 			// Department
	sale.id  		= 1;
	sale.name 		= "sale";
	
	Department marketting 	= new Department();
	marketting.id 			= 2;
	marketting.name 		= "marketting";
	
	Department dev 	= new Department();
	dev.id 			= 3;
	dev.name 		= "dev";
	
	
													// position

	Position baove = new Position();
	baove.positionID = 1;
	baove.positionName = enum_position.Dev;
	
	Position quanli = new Position();
	quanli.positionID = 2;
	quanli.positionName = enum_position.Test;
	
	
	Position giamdoc = new Position();
	giamdoc.positionID = 3;
	giamdoc.positionName = enum_position.Scrum_Master;	
	
													// account
	// insert Huy
	Account Huy 	= new Account();
	Huy.accountID 	= 1;
	Huy.email 		= "yeutudaumara@gmail.com";
	Huy.userName 	= "name1";
	Huy.fullName 	= "nguoiyeu";
	Huy.createDate 	= LocalDate.of(1997,8,27);
	Huy.gender 		= Gender_account.MALE;
	Huy.department 	= marketting;
	Huy.position 	= giamdoc;
	
	// insert Long
	Account Long 	= new Account();
	Long.accountID 	= 2;
	Long.email 		= "yeulaitudau@gmail.com";
	Long.userName 	= "namename";
	Long.fullName 	= "yeuem";
	Long.createDate = LocalDate.of(1997, 8, 23);
	Long.gender 	= Gender_account.MALE;
	Long.department	= marketting;
	Long.position 	= baove;

	// insert Tham
	Account Tham 	= new Account();
	Tham.accountID 	= 3;
	Tham.email 		= "chiyeuminhem@gmail.com";
	Tham.userName 	= "namethree";
	Tham.fullName 	= "whoareyou";
	Tham.createDate = LocalDate.of(1997, 4, 10);
	Tham.gender 	= Gender_account.FEMALE;
	Tham.department = sale;
	Tham.position	= quanli;
	
	
	
													// Group
	Group nhomdautien 		= new Group();
	nhomdautien.group 		= 1;
	nhomdautien.groupName 	= "nhom_1";
	nhomdautien.creatorID 	= 1;
	nhomdautien.createDate = LocalDate.of(1994,7,12);
	
	Group nhomthuhai 		= new Group();
	nhomthuhai.group 		= 2;
	nhomthuhai.groupName 	= "nhom_2";
	nhomthuhai.creatorID 	= 2;
	nhomthuhai.createDate 	= LocalDate.of(1993, 5, 6);
	
	Group nhomthuba 		= new Group();
	nhomthuba.group 		= 3;
	nhomthuba.groupName 	= "nhom_3";
	nhomthuba.creatorID 	= 3;
	nhomthuba.createDate 	= LocalDate.of(1998, 7, 9);

	
											// GroupAccount
	
	GroupAccount No_1 	= new GroupAccount();
	No_1.group			= nhomdautien;
	No_1.account		= Huy;
	No_1.joinDate		= LocalDate.of(1994,7,12);
	
	GroupAccount No_2 	= new GroupAccount();
	No_2.group			= nhomthuhai;
	No_2.account		= Long;
	No_2.joinDate		= LocalDate.of(1993, 5, 6);
	
	GroupAccount No_3 	= new GroupAccount();
	No_3.group			= nhomthuhai;
	No_3.account		= Huy;
	No_3.joinDate		= LocalDate.of(1998, 7, 9);
	
	GroupAccount[] nhomAcc = {No_1 , No_3};
	Huy.groups = nhomAcc;
	
	GroupAccount[] nhomGroup = {No_2, No_3};
	nhomthuhai.accounts = nhomGroup;
	
	// add acc to depn
	Account[] ten = {Huy, Long};
	marketting.accounts = ten;
	
	
											// CategoryQuestion
	CategoryQuestion CQ_1 = new CategoryQuestion();
	CQ_1.categoryID 	= 1;
	CQ_1.categoryName	= "Hoi_ve_lession_1";
	
	CategoryQuestion CQ_2 = new CategoryQuestion();
	CQ_2.categoryID 	= 2;
	CQ_2.categoryName	= "Hoi_ve_lession_2";
	
	CategoryQuestion CQ_3 = new CategoryQuestion();
	CQ_3.categoryID 	= 3;
	CQ_3.categoryName	= "Hoi_ve_lession_3";
	
	
											// TypeQuestion
	TypeQuestion Type_1 = new TypeQuestion();
	Type_1.typeID		= 1;
	Type_1.typeName		= enum_type_qtion.Multiple_Choice;
	
	TypeQuestion Type_2 = new TypeQuestion();
	Type_2.typeID		= 2;
	Type_2.typeName		= enum_type_qtion.Essay;
	
	TypeQuestion Type_3 = new TypeQuestion();
	Type_3.typeID		= 3;
	Type_3.typeName		= enum_type_qtion.Essay;
	
											// Question
	Question Que_1		= new Question();
	Que_1.questionID	= 1;
	Que_1.Content		= "lession_1_ntn";
	Que_1.category		= CQ_2;
	Que_1.type			= Type_3;
	Que_1.creator		= Huy;
	Que_1.createDate	= LocalDate.of(2020, 2, 1);
	
	Question Que_2		= new Question();
	Que_2.questionID	= 2;
	Que_2.Content		= "lession_1_giup_gi";
	Que_2.category		= CQ_1;
	Que_2.type			= Type_2;
	Que_2.creator		= Tham;
	Que_2.createDate	= LocalDate.of(2020,3, 3);
	
	
	Question Que_3		= new Question();
	Que_3.questionID	= 3;
	Que_3.Content		= "lession_1_ntn_can_nho_gi";
	Que_3.category		= CQ_3;
	Que_3.type			= Type_1;
	Que_3.creator		= Long;
	Que_3.createDate	= LocalDate.of(2020,9, 9);
	
												// Answer
	Answer cau_trl_1	= new Answer();
	cau_trl_1.answerID	= 1;
	cau_trl_1.content	= "nho_tat_ca";
	cau_trl_1.question	= Que_3;
	cau_trl_1.isCorrect = true;
	
	Answer cau_trl_2	= new Answer();
	cau_trl_2.answerID	= 2;
	cau_trl_2.content	= "khong_on_lam";
	cau_trl_2.question	= Que_1;
	cau_trl_2.isCorrect = false;
	
	Answer cau_trl_3	= new Answer();
	cau_trl_3.answerID	= 3;
	cau_trl_3.content	= "de_lap_trinh_java";
	cau_trl_3.question	= Que_2;
	cau_trl_3.isCorrect = true;
	
	
												// Exam
	Exam Ex_1		= new Exam();
	Ex_1.examID		= 1;
	Ex_1.code		= 006;
	Ex_1.title		= "bai_thi_dau_tien";
	Ex_1.category	= CQ_2;
	Ex_1.duration	= "90_phut";
	Ex_1.creator	= Huy;
	Ex_1.createDate	= LocalDate.of(2020, 9, 17);
	
	
	Exam Ex_2		= new Exam();
	Ex_2.examID		= 2;
	Ex_2.code		= 002;
	Ex_2.title		= "bai_thi_thu_hai";
	Ex_2.category	= CQ_3;
	Ex_2.duration	= "60_phut";
	Ex_2.creator	= Long;
	Ex_2.createDate	= LocalDate.of(2020, 8, 31);
	
	Exam Ex_3		= new Exam();
	Ex_3.examID		= 3;
	Ex_3.code		= 004;
	Ex_3.title		= "bai_thi_thu_ba";
	Ex_3.category	= CQ_1;
	Ex_3.duration	= "120_phut";
	Ex_3.creator	= Tham;
	Ex_3.createDate	= LocalDate.of(2020, 9, 9);
	
	
											// ExamQuestion
	ExamQuestion EQ_1	= new ExamQuestion();
	EQ_1.exam			= Ex_2;
	EQ_1.question		= Que_3;
	
	ExamQuestion EQ_2	= new ExamQuestion();
	EQ_2.exam			= Ex_3;
	EQ_2.question		= Que_1;
	
	ExamQuestion EQ_3	= new ExamQuestion();
	EQ_3.exam			= Ex_1;
	EQ_3.question		= Que_2;
	
	// print
//	System.out.println("fullName cua Huy la : "			 + Huy.fullName);
//	System.out.println("ten phong ban cua Long la : "	 + Long.department.name);
//	System.out.println("email cua Tham la : "			 + Tham.email);
	// Assignment_2
	// Question 1: Kiểm tra account thứ 2
		//	Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
		//	"Nhân viên này chưa có phòng ban"
		//	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
			System.out.println("Assignment 2 Testing");
			System.out.println("Question 1");
	if(Long.department.name == null)  {
		System.out.println("Nhân viên này chưa có phòng ban");
	} else {
		System.out.println("Phòng ban của nhân viên này là " + Long.department.name);
	};
	// Question 2:
		//	Kiểm tra account thứ 2
		//	Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
		//	Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
		//	này là Java Fresher, C# Fresher"
		//	Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
		//	quan trọng, tham gia nhiều group"
		//	Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		//	người hóng chuyện, tham gia tất cả các group"
	System.out.println("Question 2: ");
	if (Long.groups == null) {
		System.out.println("Nhân viên này chưa có group");
		
	} else if (Long.groups.length <= 2) {
		System.out.println("Group của nhân viên nay la: " + Long.groups);
	} else if (Long.groups.length == 3) {
		System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		
	} else {
		System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

	} {

	};
		

	// Question 3 Sử dụng toán tử ternary để làm Question 1
	System.out.println("Question 3");
	System.out.println(Long.department.name == null ?  // ternary chỉ dùng trong câu có 2 điều kiện 
			"Nhân viên này chưa có phòng ban" :
				"Phòng ban của nhân viên này là " + Long.department.name);
	// Question 4:
			//	Sử dụng toán tử ternary để làm yêu cầu sau:
			//	Kiểm tra Position của account thứ 1
			//	Nếu Position = Dev thì in ra text "Đây là Developer"
			//	Nếu không phải thì in ra text "Người này không phải là Developer"
	System.out.println("Question 4");
	System.out.println(Huy.position.positionName  == enum_position.Dev ? 
			"Đây là Developer" :
				"Người này không phải là Developer");
		

	// SWITCH CASE
		//	Question 5:
			//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
			//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
			//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
			//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
			//		Còn lại in ra "Nhóm có nhiều thành viên"
	System.out.println(" Question 5");
	switch (nhomAcc.length ) {
	case 1:
		System.out.println("Nhóm có một thành viên");
		break;
	case 2:
		System.out.println("Nhóm có hai thành viên");
	case 3:
		System.out.println("Nhóm có ba thành viên");
	default:
		break;
	}
	
	// Question 6: Sử dụng switch case để làm lại Question 2
	System.out.println(" Question 6");
	switch (Long.groups.length) {
	case 0:
		System.out.println(" Nhân viên này chưa có group" );
		break;
	case 1:
		System.out.println("Group của nhân viên nay la: " + Long.groups);
		break;
	case 2:
		System.out.println("Group của nhân viên nay la: " + Long.groups);
		break;
	case 3:
		System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		break;
	case 4:
		System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		break;
	default:
		break;
	};
	
	
//	 Question 7: Sử dụng switch case để làm lại Question 4
	System.out.println(" Question 7");
	switch (Huy.position.positionName) {
	case Dev:
		System.out.println("Đây là Developer");
		break;	
	default:
		System.out.println("Người này không phải là Developer");
		break;
	}
	
	// FOREACH
		//	Question 8:
				//In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
	System.out.println(" Question 8");
	Account[] nhomacc = {Huy, Long, Tham};
	for (Account account : nhomacc) {
		System.out.println("email la:"  + account.email);
		System.out.println("fullname la:" + account.fullName);
		System.out.println("Name la:" + account.department.name);
		System.out.println("--------------");
	}
	
	
	// Question 9: In ra thông tin các phòng ban bao gồm: id và name
	System.out.println(" Question 9");
	Department[] nhomdep = {sale, marketting, dev};
	for (Department department : nhomdep) {
		System.out.println("ID là: " + department.id);
		System.out.println("Tên phòng ban là:" + department.name);
		System.out.println("--------------");
	}
	
	
	// FOR
		//	Question 10:
			//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
			//		Thông tin account thứ 1 là:
			//		Email: NguyenVanA@gmail.com
			//		Full name: Nguyễn Văn A
			//		Phòng ban: Sale
			//		Thông tin account thứ 2 là:
			//		Email: NguyenVanB@gmail.com
			//		Full name: Nguyễn Văn B
			//		Phòng ban: Marketting 
	System.out.println(" Question 10");
	for (int i = 0; i < nhomacc.length; i++) {
		System.out.println("Thông tin account thứ " +  (i+1) + " là:");
		System.out.println("Email: " + nhomacc[i].email);
		System.out.println("Full Name: " + nhomacc[i].fullName);
		System.out.println("Phòng ban là: " + nhomacc[i].department.name);
		System.out.println("---------------");
		

	}
	

	
	// Question 11:
				//	In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
				//		Thông tin department thứ 1 là:
				//		Id: 1
				//		Name: Sale
				//		Thông tin department thứ 2 là:
				//		Id: 2
				//		Name: Marketing
	System.out.println(" Question 11");
	for (int i = 0; i < nhomdep.length; i++) {
		System.out.println("Thông tin department thứ " + (i + 1) + " là:");
		System.out.println("ID : " + nhomdep[i].id);
		System.out.println("Name:" + nhomdep[i].name);
		System.out.println("---------------------");
	}
	
	
//		// Question 12:Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10 
//	System.out.println(" Question 12");
//	for (int i = 0; i < nhomacc.length; i++) 
//	if (i <= 1) {
//		System.out.println("Thông tin account thứ " +  (i+1) + " là:");
//		System.out.println("Email: " + nhomacc[i].email);
//		System.out.println("Full Name: " + nhomacc[i].fullName);
//		System.out.println("Phòng ban là: " + nhomacc[i].department.name);
//		System.out.println("---------------");
//	} else {
//
//	}
//		
	
	// Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
	System.out.println(" Question 13");
	for (int i = 0; i < nhomacc.length; i++) 
	if (i != 1) {
		System.out.println("Thông tin account thứ " +  (i+1) + " là:");
		System.out.println("Email: " + nhomacc[i].email);
		System.out.println("Full Name: " + nhomacc[i].fullName);
		System.out.println("Phòng ban là: " + nhomacc[i].department.name);
		System.out.println("---------------");
	} else {

	}
		
		
	// Question 14: In ra thông tin tất cả các account có id < 4
	System.out.println(" Question 14");
	for (int i = 0; i < nhomacc.length; i++) 
	if (i <= 2) {
		System.out.println("Thông tin account thứ " +  (i+1) + " là:");
		System.out.println("Email: " + nhomacc[i].email);
		System.out.println("Full Name: " + nhomacc[i].fullName);
		System.out.println("Phòng ban là: " + nhomacc[i].department.name);
		System.out.println("---------------");
	} else {

	}
	
	
	// Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
	System.out.println("Question 15");
	for (int i = 0; i < 20; i++) {
		if (i == 10) {
		} else if (i % 2 == 0) {
			System.out.println(i);
		}
	}
	System.out.println("------------------------------------------------------------------------------");
	
					//WHILE
	
	//Question 16:
				//	Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
				//	lệnh break, continue
	System.out.println("question 16-10");
	int i = 0;
	while (i < nhomacc.length) {
		System.out.println("Thông tin account thứ " +  (i+1) + " là:");
		System.out.println("Email: " + nhomacc[i].email);
		System.out.println("Full Name: " + nhomacc[i].fullName);
		System.out.println("Phòng ban là: " + nhomacc[i].department.name);
		System.out.println("---------------");
	}
	
	System.out.println("question 16-11");
	i = 0;
	while ( i < nhomdep.length) {
		System.out.println("Thông tin department thứ " + (i + 1) + " là:");
		System.out.println("ID : " + nhomdep[i].id);
		System.out.println("Name:" + nhomdep[i].name);
		System.out.println("---------------------");
	}
	
	System.out.println("question 16-12");
	i = 0;
	while (i < nhomacc.length) {
		if (i <= 1) {
			System.out.println("Thông tin account thứ " +  (i+1) + " là:");
			System.out.println("Email: " + nhomacc[i].email);
			System.out.println("Full Name: " + nhomacc[i].fullName);
			System.out.println("Phòng ban là: " + nhomacc[i].department.name);
			System.out.println("---------------");
	}
	}
	
	System.out.println("question 16-13");

	i= 0;
	while (i < nhomacc.length) {
		if (i != 1) {
			System.out.println("Thông tin account thứ " +  (i+1) + " là:");
			System.out.println("Email: " + nhomacc[i].email);
			System.out.println("Full Name: " + nhomacc[i].fullName);
			System.out.println("Phòng ban là: " + nhomacc[i].department.name);
			System.out.println("---------------");
		} else {

		}
	}
	
	///////////////////////////////////////////
	System.out.println("question 16-14");
	i = 0;
	while(i < nhomacc.length) {
		if (i <= 2) {
			System.out.println("Thông tin account thứ " +  (i+1) + " là:");
			System.out.println("Email: " + nhomacc[i].email);
			System.out.println("Full Name: " + nhomacc[i].fullName);
			System.out.println("Phòng ban là: " + nhomacc[i].department.name);
			System.out.println("---------------");
		} else {

	}
	}
	
	////////////////
	System.out.println("question 16-15");
	i = 0;
	while (i<= 20) {
		if (i % 2 == 0) {
			System.out.println("Các số chẵn nhỏ hơn 20 là: ");
			System.out.print(i);
			System.out.println("-----------------");
		}
	}
	
	
	/////////////////////////////

}
}
