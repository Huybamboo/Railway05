package backend;

import java.util.ArrayList;
import java.util.List;



import entity.MyMath_Exercise_1;
import entity.Student_Exercise_1;

public class Exercise_1{
	
	public  void Question1_1() {
		List<Student_Exercise_1> students = new ArrayList<>();
		students.add(new Student_Exercise_1(1 , "Nguyễn Văn A"));
		students.add(new Student_Exercise_1(2 , "Nguyễn Văn B"));
		students.add(new Student_Exercise_1(3 , "Nguyễn Văn C"));

		Student_Exercise_1.setcollege("Đại học bách khoa");
		for (Student_Exercise_1 student : students) {
			System.out.println(student);
		}
}
	
	public void Question1_2() {
		List<Student_Exercise_1> students = new ArrayList<>();
		students.add(new Student_Exercise_1(1 , "Nguyễn Văn A"));
		students.add(new Student_Exercise_1(2 , "Nguyễn Văn B"));
		students.add(new Student_Exercise_1(3 , "Nguyễn Văn C"));

		
		Student_Exercise_1.setcollege("Đại học công nghệ");
		for (Student_Exercise_1 student : students) {
			System.out.println(student);
		}
		System.out.println("----------------");
		System.out.println("Question2: ");
		// hs 1 chi 50k
		Student_Exercise_1.chiquylop(50);
		System.out.println(Student_Exercise_1.getMoneyGroup());
		//  Student thứ 2 lấy 20k đi mua bánh mì
		Student_Exercise_1.chiquylop(20);
		System.out.println(Student_Exercise_1.getMoneyGroup());
		//  Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
		Student_Exercise_1.chiquylop(150);
		System.out.println(Student_Exercise_1.getMoneyGroup());
		// cả nhóm mỗi người lại đóng quỹ mỗi người 50k
		for (Student_Exercise_1 student : students) {
			student.themquylop(50);
		}
		System.out.println("Số tiền quỹ lớp sau khi đóng thêm 50k mỗi người là: " + Student_Exercise_1.getMoneyGroup());
	}
	public void Question3() {
		System.out.println("Question3: ");
		System.out.println(MyMath_Exercise_1.max(6, 9));
		System.out.println(MyMath_Exercise_1.min(6, 9));
		System.out.println(MyMath_Exercise_1.sum(6, 9));
	}
	
	public void Question4() {
		System.out.println("Question4: ");
		List<Student_Exercise_1> students = new ArrayList<>();
		students.add(new Student_Exercise_1(1 , "Nguyễn Văn A"));
		students.add(new Student_Exercise_1(2 , "Nguyễn Văn B"));
		students.add(new Student_Exercise_1(3 , "Nguyễn Văn C"));
		Student_Exercise_1.setcollege("Đại học đã thay đổi");
		for (Student_Exercise_1 student : students) {
			System.out.println(student);
		}
	}
	public void Question5() {
		System.out.println("Question5: ");
		List<Student_Exercise_1> students = new ArrayList<>();
		students.add(new Student_Exercise_1(1 , "Nguyễn Văn A"));
		students.add(new Student_Exercise_1(2 , "Nguyễn Văn B"));
		students.add(new Student_Exercise_1(3 , "Nguyễn Văn C"));
		
		System.out.println("Số hs đc tạo ra là: " + Student_Exercise_1.counter);
		
	}
	
	
}