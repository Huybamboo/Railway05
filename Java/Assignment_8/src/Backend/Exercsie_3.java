package Backend;


import java.util.Scanner;

import Entity.StudentExercise3;

public class Exercsie_3 {
	// Exercsie_3 Question 1: T generic (class)
		//	Tạo class student có property id, name (trong đó id của student có thể
		//			là int, long, float)
		//			a) Tạo đối tượng student có id là int
		//			b) Tạo đối tượng student có id là float
		//			c) Tạo đối tượng student có id là double
	// a) Tạo đối tượng student có id là int
	public static void main(String[] args) {
	StudentExercise3<Integer> student1 = new StudentExercise3<>(1, "Long");
	System.out.println(student1);
	System.out.println("---------");
	// b) Tạo đối tượng student có id là float
	StudentExercise3<Float> student2 = new StudentExercise3<>(2f, "Dương");
	System.out.println(student2);
	System.out.println("---------");
	// c) Tạo đối tượng student có id là double
	StudentExercise3<Double> student3 = new StudentExercise3<>(3d, "Huy");
	System.out.println(student3);
	System.out.println("---------");
	
	
	//  Question 2:
	Exercsie_3 Question_2 = new Exercsie_3();
	Question_2.Print("student");
	Question_2.Print(4);
	Question_2.Print(4.0);
	
}
	
	
	// Question 2: T generic (method)
		//	Tạo method để in ra thông tin nhập vào (parameter)
		//	(parameter có thể là họ và tên, hoặc student, hoặc int)
		//	Gợi ý: tạo method print(T a) và cài đặt system out (a) ra
		//	Demo chương trình với print(student), print(4), print(4.0)
	
	public <X> void Print(X a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập thông tin");
		a = (X) scanner.next();
		System.out.println(a);
		}
}