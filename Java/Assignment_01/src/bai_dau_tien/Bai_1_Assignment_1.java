package bai_dau_tien;

import java.time.LocalDate;

public class Bai_1_Assignment_1 {
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
	Group thangdautien 		= new Group();
	thangdautien.group 		= 1;
	thangdautien.groupName 	= "nhom_1";
	thangdautien.creatorID 	= 1;
	thangdautien.createDate = LocalDate.of(1994,7,12);
	
	Group thangthuhai 		= new Group();
	thangthuhai.group 		= 2;
	thangthuhai.groupName 	= "nhom_2";
	thangthuhai.creatorID 	= 2;
	thangthuhai.createDate 	= LocalDate.of(1993, 5, 6);
	
	Group thangthuba 		= new Group();
	thangthuba.group 		= 3;
	thangthuba.groupName 	= "nhom_3";
	thangthuba.creatorID 	= 3;
	thangthuba.createDate 	= LocalDate.of(1998, 7, 9);

	
											// GroupAccount
	
	GroupAccount No_1 	= new GroupAccount();
	No_1.group			= thangdautien;
	No_1.account		= Huy;
	No_1.joinDate		= LocalDate.of(1994,7,12);
	
	GroupAccount No_2 	= new GroupAccount();
	No_2.group			= thangthuhai;
	No_2.account		= Long;
	No_2.joinDate		= LocalDate.of(1993, 5, 6);
	
	GroupAccount No_3 	= new GroupAccount();
	No_3.group			= thangthuhai;
	No_3.account		= Tham;
	No_3.joinDate		= LocalDate.of(1998, 7, 9);
	
	
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
	System.out.println("fullName cua Huy la : "			 + Huy.fullName);
	System.out.println("ten phong ban cua Long la : "	 + Long.department.name);
	System.out.println("email cua Tham la : "			 + Tham.email);
	// Assignment_2
	
	
	
}
}