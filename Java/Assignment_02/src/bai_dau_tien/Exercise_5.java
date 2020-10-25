package bai_dau_tien;


import java.util.Scanner;

public class Exercise_5 {
	public static void main(String[] args) {
// Exercise 5: Input from console
		// Question 1:Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("Question 1");
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];
		System.out.println("Moi nhap:");
		for (int i = 0 ; i < 3; i ++) {
			System.out.print("Hay nhap so thu " + (i +1) + ":");
			numbers[i] = scanner.nextInt();
		}
		System.out.println("các số bạn vừa nhập là: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print( numbers[i] + " ");
		}
		System.out.println("");
		System.out.println("-----------------------------");
		
		
		// Question 2:Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
		System.out.println("Question 2");
		Scanner sothuc = new Scanner(System.in);
		float[] a = new float[2];
		System.out.println("nhập vào tại đây: ");
		for (int i = 0; i < 2; i++) {
			System.out.println("nhập số thứ " + (i +1) + ":");
			a[i]= sothuc.nextFloat();
sothuc.close();			
		}
		
		System.out.println("-----------------------------");
		
		
		// Question 3: Viết lệnh cho phép người dùng nhập họ và tên
		System.out.println("Question 3");
		System.out.println("Họ của bạn là :");
		String Ho = scanner.next();
		System.out.println("Tên của bạn là :");
		String Ten = scanner.next();
		System.out.println("Họ và tên của bạn là : " + Ho + " " + Ten);
		System.out.println("-----------------------------");
		
		// Question 4:Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("Question 4");
		System.out.println("Mời nhập");
		String ngay = scanner.next();
		System.out.println("Ngày sinh của bạn là: " + ngay);
		System.out.println("-----------------------------");
		
		// Question 5:
//		Viết lệnh cho phép người dùng tạo account (viết thành method)
//		Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//		chương trình sẽ chuyển thành Position.Dev, Position.Test,
//		Position.ScrumMaster, Position.PM
		
		// Question 6:Viết lệnh cho phép người dùng tạo department (viết thành method)
		taodepartment();
		
		// Question 7Nhập số chẵn từ console
		
		System.out.println("Mời bạn nhập vào số chẵn");
		int so	= scanner.nextInt();
		if (so % 2 == 0) {
			System.out.println("Số chẵn là : " + so);
		} else {
			System.out.println("Bạn nhập sai, hãy nhập lại");
		}
scanner.close();
} 
	
	// 
	
	
	// Question 6:Viết lệnh cho phép người dùng tạo department 
	public static void taodepartment() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Moi ban nhap ten department muon tao");
scanner.close();
}
}
