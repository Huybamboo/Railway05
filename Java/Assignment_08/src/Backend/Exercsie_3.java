package Backend;


import java.util.Scanner;
import Entity.Employee;
import Entity.Phone;
import Entity.Staff;
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
	
	// Question 4: E generic
//	Tạo 1 array int, 1 array float, 1 array long, 1 array double
//	Tạo 1 method có parameter là array và in ra các số trong array đó
	
	public void question4() {
		// init array
		Integer[] arrInt = { 5, 10, 15 };
		Float[] arrFloat = { 6f, 5f, 15f };
		Double[] arrDouble = { 5.2, 2.6, 6.9 };

		// print array
		printArray(arrInt);
		printArray(arrFloat);
		printArray(arrDouble);
	}
	
	// Question 5: E generic 
	
	public void question5() {
		// khởi tạo employee có salaries datatype là int
		Integer[] salaryEmployee1 = { 1000, 1200, 1200 };
		Employee<Integer> employee1 = new Employee<Integer>(1, "Đăng", salaryEmployee1);

		System.out.println("Employee vừa khởi tạo: ");
		Print(employee1);
		System.out.println("Tháng lương cuối cùng của employee 1: " + salaryEmployee1[salaryEmployee1.length - 1]);

		// khởi tạo employee có salaries datatype là Float
		Float[] salaryEmployee2 = { 1000f, 1200f, 1200f, 3000f };
		Employee<Float> employee2 = new Employee<Float>(1, "Duy", salaryEmployee2);

		System.out.println("Employee vừa khởi tạo: ");
		Print(employee2);
		System.out.println("Tháng lương cuối cùng của employee 2: " + salaryEmployee2[salaryEmployee2.length - 1]);

		// khởi tạo employee có salaries datatype là double
		Double[] salaryEmployee3 = { 1000d, 1200d, 1200d, 6900d, 9600d, 12000d };
		Employee<Double> employee3 = new Employee<Double>(1, "Thắng", salaryEmployee3);

		System.out.println("Employee vừa khởi tạo: ");
		Print(employee3);
		System.out.println("Tháng lương cuối cùng của employee1: " + salaryEmployee3[salaryEmployee3.length - 1]);
	}
	
	
	// Question 7: K & V generic 
	
	public void question7() {
		// <email, phone number>
		Phone<String, String> email = new Phone<String, String>("duynn03@gmail.com", "0332782799");
		System.out.println("Email: " + email.getKey() + " / " + "Phone Number: " + email.getPhoneNumber());

		// <id, phone number>
		Phone<Integer, String> id = new Phone<Integer, String>(1, "0332782799");
		System.out.println("id: " + id.getKey() + " / " + "Phone Number: " + id.getPhoneNumber());

		// <name, phone number>
		Phone<String, String> name = new Phone<String, String>("Duy", "0332782799");
		System.out.println("Name: " + name.getKey() + " / " + "Phone Number: " + name.getPhoneNumber());
	}

	
	// // Question 8: K & V generic 
	
	public void question8() {
		// Integer
		Staff<Integer> staff1 = new Staff<Integer>(1, "Nguyễn Văn A");
		System.out.println("ID: " + staff1.getId() + " / " + "Name: " + staff1.getName());

		// Float
		Staff<Float> staff2 = new Staff<Float>(1.5f, "Nguyễn Văn A");
		System.out.println("ID: " + staff2.getId() + " / " + "Name: " + staff2.getName());
	}
	
	
	
	private <T> void print(T a) {
		System.out.println(a);
	}
	
	
	private <T> void printArray(T[] arr) {
		for (T x : arr) {
			System.out.println(x);
		}
	}

}