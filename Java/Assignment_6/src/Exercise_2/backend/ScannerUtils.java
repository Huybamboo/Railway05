package Exercise_2.backend;

import java.util.Scanner;

public class ScannerUtils {
	
	
	public ScannerUtils() {
		this.scanner = new Scanner(System.in);
	}
	
	private Scanner scanner; 
	
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
	
	
}
