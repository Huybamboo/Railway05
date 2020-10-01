package bai_dau_tien;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		// Exercise 2 (Optional): System out printf
		// Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra sốnguyên đó
		System.out.println("Exercise 2");
		System.out.println("Question 1");
		int a = 5;
		System.out.println("Số nguyên là: " + a);
		
		// Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
		System.out.println("Question 2");
		int b = 100000000 ;
		System.out.printf(Locale.US, "%,d %n", b);
		
		
		// Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
		System.out.println("Question 3");
		double c = 5.0567098;
		System.out.printf("%.4f", c	);
		System.out.println("");
		
		
		
		// Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau:
				//		Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
				//		Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
		System.out.println("Question 4");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập Họ và tên:");
		String name = scanner.next();
		System.out.println(name + " và tôi đang độc thân");
	
		
		// Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau:24/04/2020 11h:16p:20s 
//							Locale locale = new Locale("vi","VN");
//							DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//							String date = dateFormat.format(new Date());
//							System.out.println(date);
		
		System.out.println("Question 5");
		String pattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		// Question 6: In ra thông tin account (như Question 8 phần FOREACH) theo định dạng able (giống trong Database)
	
		System.out.println("-------------------");
		System.out.println("Question6");
		System.out.printf("%-20s %-30s %-40s \n"  , "ID", "FullName", "Email");
		System.out.printf("%-20d %-30s %-40s \n"  ,  1  , "Long"    , "Long@gmail.com");		
		System.out.printf("%-20d %-30s %-40s \n"  ,  2  , "Huy"     , "Huy@gmail.com");
		System.out.printf("%-20d %-30s %-40s \n"  ,  3  , "Duong"   , "Duong@gmiail.com");
		
		
		scanner.close();
		

		
		
		
		
		
		
		
		
		
	}
}
