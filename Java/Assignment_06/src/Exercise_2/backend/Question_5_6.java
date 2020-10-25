package Exercise_2.backend;

import java.util.Scanner;

public class Question_5_6 {
	// Question 5:
//	Tạo 1 method inputAge() và trả về 1 số int.
//	Trong method hãy cài đặt như sau:
//	B1: Sau đó dùng scanner để nhập vào 1 số
//	B2: Check exeption
//	Nếu người dùng nhập vào 1 số thì return về số đó
//	Nếu người dùng không nhập vào 1 số thì sẽ in ra dòng
//	text "wrong inputing! Please input an age as int, input
//	again."
//	Nếu người dùng không nhập vào 1 số < 0 thì sẽ in ra
//	dòng text "Wrong inputing! The age must be greater
//	than 0, please input again."
//	B3: hãy demo trong method main()
	public static void main(String[] args) {
		int age = InputInt();
		System.out.println("Tuổi bạn vừa nhập là: " + age);
	}
	public static int InputInt() {
		Scanner scanner = new Scanner(System.in);
		while (true)
		try {
			System.out.println("Mời nhập vào tuổi");
			int age = scanner.nextInt();
			return age;
			
		} catch (Exception e) {
			System.out.println("Bạn đã nhập không phải số.Mời nhập lại số");
			scanner.nextLine();
		}finally {
			System.out.println("chương trình đã chạy xong");
			
		}
		
	}
}
