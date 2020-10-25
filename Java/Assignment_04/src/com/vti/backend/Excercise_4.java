package com.vti.backend;

import com.vti.Exercise_4.Student;

public class Excercise_4 {
	public void Question_1_b() {
		Student student1 = new Student("Long" , "Hung Yen");
		student1.setDiemhl(7);
		System.out.println("cau b ex4 " + student1);		
	
	// c) set điểm vào
	
		Student student2 = new Student("Duong" , "Hung Yen");
		student2.setDiemhl(9);
		System.out.println("cau c " + student2);
	// d  cộng thêm điểm
		Student student3 = new Student("Tu" , "Hung Yen");
		student3.setDiemhl(1);
		student3.plusDiemhl(6);
		System.out.println(student3);
	
	
	}
}
