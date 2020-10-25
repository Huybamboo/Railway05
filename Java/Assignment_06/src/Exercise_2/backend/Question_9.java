package Exercise_2.backend;

import java.util.Scanner;

public class Question_9 {
	private Scanner scanner;
	private String name;
	private int age;

	public Question_9() throws Exception {
		scanner = new Scanner(System.in);
		name = inputName();
		age = inputAge();
	}
	
	private int inputAge() throws Exception {
		try {
			System.out.println("Please input your age: ");
			int age = scanner.nextInt();
			return age;
		} catch (Exception e) {
			throw new Exception("Please input a number as int.");
		}
	}
	
	private String inputName() throws Exception {
		try {
			System.out.println("Please input your name: ");
			String name = scanner.nextLine();
			return name;
		} catch (Exception e) {
			throw new Exception("Please input a name.");
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
