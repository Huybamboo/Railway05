package bai_dau_tien;

import java.util.Locale;

public class testing_2_excercise {
	public static void main(String[] args) {
		// Exercise 2 (Optional): System out printf
		// Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra sốnguyên đó
		System.out.println("Exercise 2");
		System.out.println("Question 1");
		int a = 5;
		System.out.println("Số nguyên là: " + a);
		
		// Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
		int b = 100000000 ;
		System.out.printf(Locale.US, "%,d %n", b);
		
		
		// Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
		double c = 5.0567098;
		System.out.printf(".0567'%n", c	);
		
}
}
