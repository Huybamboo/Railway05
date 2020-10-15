package Exercise_2.backend;

import java.util.Scanner;

public class ScannerUtils {
	
	
	public ScannerUtils() {
		this.scanner = new Scanner(System.in);
	}
	
	private Scanner scanner; 
	
	// Question 7
	public int inputInt() { 									// lấy cái method này làm cha
		while (true) {
			try {
				int number = scanner.nextInt();
				return number;
			} catch (Exception e) {
				System.err.println("Bạn chỉ được nhập số");
				System.out.println("Mời bạn nhập lại: ");
				scanner.nextLine();
			}
		}
	}
	
	// Question 8
	public float inputFloat() {
		while (true) {
			try {
				float no_float = scanner.nextFloat();
				return no_float;
			} catch (Exception e) {
				System.err.println("Bạn chỉ được nhập số");
				System.out.println("Mời bạn nhập lại: ");
				scanner.nextLine();
			}
		}
		
	}
	
	public double inputDouble() {
		while (true) {
			try {
				double no_double = scanner.nextDouble();
				return no_double;
			} catch (Exception e) {
				System.err.println("Bạn chỉ được nhập số");
				System.out.println("Mời bạn nhập lại: ");
				scanner.nextLine();
			}
		}
		
	}
	public void inputString() {
		String inString = scanner.nextLine();
		System.out.println(" thông tin bạn vừa nhập là: " + inString);
		
	}
	
}
