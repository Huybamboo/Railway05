package frontend;

import java.util.Random;

import entity.Student;

public class Program {
	public static void main(String[] args) {
		
		
// Exercise 2: Polymorphism
//		Question 1: Interface Management
//		Tạo 1 class Student gồm các property id, name, group(int)
//		Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(),
//		đi dọn vệ sinh()
//		Class Student sẽ implement interface như sau:
//		Method điểm danh() sẽ in ra nội dung như sau:
//		"Nguyễn Văn A điểm danh"
//		"Nguyễn Văn B điểm danh"
//		"Nguyễn Văn C điểm danh"
//		….
//		Method học Bài () sẽ in ra nội dung như sau:
//		"Nguyễn Văn A đang học bài"
//		"Nguyễn Văn B đang học bài "
//		"Nguyễn Văn C đang học bài "
//		…
//		Tương tự với các method còn lại
//		Hãy viết chương trình thực hiện các lệnh sau:
//		a) Tạo 10 học sinh, chia thành 3 nhóm
//		b) Kêu gọi cả lớp điểm danh.
//		c) Gọi nhóm 1 đi học bài
//		d) Gọi nhóm 2 đi dọn vệ sinh
		Student[] students = new Student[10];
		Random random = new Random();
		
		for (int i = 0; i < students.length; i++) {
			int group = 1 + random.nextInt(3);
			students[i] = new Student(i, "Nguyen Van A" + (i+1) , group);
			System.out.println(students[i]);
			
		}
		
		
	// b 
	for (Student student : students) {
		student.diemDanh();
		
	}
	
	// c) Gọi nhóm 1 đi học bài
		for (Student student : students) {
			if (student.getGroup() == 1)
				System.out.println("tên là: " + student.getName() + student.getGroup() + " đi học bài");
				}
	// d) Gọi nhóm 2 đi dọn vệ sinh
		for (Student student : students) {
			if (student.getGroup() == 2)
				System.out.println(" Học sinh " + student.getName() + student.getGroup() + " đi dọn vệ sinh" );
			
		}

		
		
		
// Question 2 (Optional): 
//		2
//		Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối
//		C. Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa
//		chỉ, mức ưu tiên.
//		Thí sinh thi khối A thi các môn: Toán, Lý, Hoá.
//		Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh.
//		Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
//		a) Xây dựng các class để quản lý các thi sinh dự thi đại học.
//		b) Xây dựng interface ITuyenSinh và class TuyenSinh có các
//		chức năng:
//		a. Thêm mới thí sinh.
//		b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
//		c. Tìm kiếm theo số báo danh.
//		d. Thoát khỏi chương trình.
}
}
