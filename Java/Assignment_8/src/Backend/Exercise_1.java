package Backend;

import java.util.ArrayList;
import java.util.List;
import Entity.Student;

public class Exercise_1 {
	public void Question_1() {
		List<Student> student = new ArrayList<>();
		student.add(new Student("Nguyễn Văn A"));
		student.add(new Student("Nguyễn Văn A"));
		student.add(new Student("Nguyễn Văn A"));
		student.add(new Student("Nguyễn Văn B"));
		student.add(new Student("Nguyễn Văn C"));
		student.add(new Student("Nguyễn Văn D"));
		student.add(new Student("Nguyễn Văn F"));
		student.add(new Student("Nguyễn Văn E"));
		student.add(new Student("Nguyễn Văn X"));
		student.add(new Student("Nguyễn Văn Y"));
		
		System.out.println("Câu a: ");
		System.out.println("Số lượng học sinh hiện có là: " + Student.getCounter());
		System.out.println("Câu b: ");
		
		
			
		
	}

}