package Exercise_2.backend;

import java.util.Scanner;

public class Question_7 {
	// Question 7: làm tương tự câu 6
		//	Tạo 1 class ScannerUtils, trong class sẽ tạo 1 method inputInt() chuyên
		//	để nhập dữ liệu dạng int như age, id, …
		//	Gợi ý: inputInt() sẽ có parameter là String errorMessage để người dùng
		//	có thể tự điền được errorMessage vào

	public static void main(String[] args) {
		String errorMess = InputInt_7();
		 
		
	}
	public static int InputInt_7() {
		Scanner scanner = new Scanner(System.in);
		while(true)
		try {
			System.out.println("Mời nhập errorMessage ");
			String errorMess = scanner.nextLine();
			int convert = Integer.parseInt(errorMess);
			return convert;
		} catch (Exception e) {
			System.out.println("vui lòng nhâp lại");
		}finally {
			System.out.println("Kết thúc");
		}
		
	}
}
