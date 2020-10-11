package Demo;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int age = inputInt();
		System.out.println("Tuổi của bạn là: " + age);
	
		
		System.out.println("Chương trình đã xong");
		
	}
	
	public static int inputInt() {

		Scanner scanner = new Scanner(System.in);
		while(true) {
		try {
			System.out.println("Mời bạn nhập vào tuổi: ");
			int age = scanner.nextInt();
			
			return age;
		} catch (Exception e) {
			System.out.println("mày nhập sai rồi, nhập lại đi");
			scanner.nextLine();
		}
	}
}
	
	

}