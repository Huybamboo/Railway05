package Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListStudent {
	private ArrayList<Student> students;
	Scanner scanner;
	
	public ArrayListStudent() {
		students = new ArrayList<>();
		inputStudent();
	}
	
	private void inputStudent() {
		students.add(new Student(1, "Long"	));
		students.add(new Student(2, "Dương"	));
		students.add(new Student(3, "Tú"	));
		students.add(new Student(4, "Long"	));
		students.add(new Student(5, "Long"	));
	}
	
	public void printfStudent() {
		for (Student student : students) {
			System.out.println(student);	
		}
	}
	
	public void A() {
		System.out.println("Câu a: ");
		System.out.println(Student.getCounter());
	}
	
	public void B() {
		System.out.println("Câu b: ");
		System.out.println(students.get(3));
	}
	
	public void C() {
		System.out.println("Câu c: ");
		System.out.println("Phần tử đầu tiên là: " + students.get(0));
		System.out.println("Phần tử cuối cùng là: " + students.get(students.size() - 1));
	}
	
	public void DFisrt() {
		System.out.println("Câu d: ");
		students.add(0, new Student(0, "Thắm"));
		System.out.println("Phần tử đầu tiên là: " + students.get(0));
	}
	public void ELast() {
		System.out.println("Câu e: ");
		students.add(students.size(), new Student(6 , "Vũ"));
		System.out.println("Phần tử cuối cùng là: " + students.get(students.size() - 1));
	}
	
	public void FDaonguoc() {
		System.out.println("Câu f: ");
		Collections.reverse(students);
		System.out.println("Sau khi đảo ngược là: ");
		printfStudent();
	}
	public void GFind() {
		System.out.println("Câu g: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập id cần tìm: ");
		int findId = scanner.nextInt();
		for (Student student : students) {
			if (student.getId() == findId) {
				System.out.println(student);
				
			} else 
				System.out.println("Không có học sinh nào có id = " + findId);
			return;
		}
	}
	
	public void HFindName() {
		System.out.println("Câu h: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập Name cần tìm: ");
		String findName = scanner.nextLine();
		for (Student student : students) {
			if (student.getName().equals(findName)) {
				System.out.println(student);
			} else
				System.out.println("Không có học sinh nào có tên là: " + findName);
			return;
		}
	}
	
	public void ITrungTen() {
		System.out.println("Câu i:");
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j <students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println("Học sinh trùng tên là: ");
					System.out.println(students.get(i));
					System.out.println(students.get(j));
					return;
				}
			}
			
		}
	}
	
//	public void JDeleteNameID2() {
//		System.out.println("Câu j:");
//		for (Student student : students) {
//			if (student.getId() == 2) {
//				student.setName(null);
//			}
//		}
//	}
//	
//	public void KDeleteId5() {
//		for (Student student : students) {
//			if (student.getId() == 5) {
//				students.remove(student);
//			}
//		}
//	}
	
	public void LCopy() {
		ArrayList<Student> studentCopies = new ArrayList<>();
		studentCopies.addAll(students);
		System.out.println(studentCopies);
		
	}
}
