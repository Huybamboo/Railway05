package bai_dau_tien;


import java.util.Scanner;

public class Extra_2 {
	public static void main(String[] args) {
// Exercise 1:
		// Question 1: Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet (cm).
					//Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch (số thực, có 2 số lẻ thập phân).
					//Với 1 inch = 2.54 cm và 1 foot = 12 inches.
		System.out.println("EXERCISE 1");
		System.out.println("Question 1");
		Scanner Q_1 = new Scanner(System.in);
		System.out.println("Nhập vào một số thực: ");
		float a = Q_1.nextFloat();
		double b = (float) a*12*2.54;
		double c = a*2.54;
		System.out.println( a + " cm");
		System.out.printf( "%.2f" , b);
		System.out.println("");
		System.out.printf( "%.2f" , c);
		System.out.println("\n------------------------------");
Q_1.close();				



		// Question 2: Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
						// [giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
						// Ví dụ: 02:11:05
		System.out.println("Question 2");
		Scanner Q_2 = new Scanner(System.in);
		System.out.println("Nhap số ngẫu nhiên từ 0 - 68399: ");
		int abc  = Q_2.nextInt();
		int gio  = abc/3600;
		int phut = (abc%3600)/60;
		int giay = abc%3600 - phut*60;
		System.out.format("%02d:%02d:%02d", gio, phut, giay);
		System.out.println("\n------------------------------");
Q_2.close();
		
		// Question 3:Viết chương trình nhập vào 4 số nguyên.
				//		Hiển thị ra số lớn nhất và nhỏ nhất
				//		Ví dụ:
				//		nhập vào 4 số 1,2,3,4 thì kết quả là:
				//		Số lớn nhất là: 4
				//		Số nhỏ nhất là: 1
		System.out.println("Question 3");
		Scanner Q_3 = new Scanner(System.in);
		System.out.println("Mời nhập 4 số nguyên:");
		int[] so_nguyen = new int[4];
		for (int i = 0; i < so_nguyen.length; i++) {
			System.out.println("Số nguyên thứ " + (i + 1) + " là: ");
			so_nguyen[i] = Q_3.nextInt();
		}
		int min = so_nguyen[0];
		int max = so_nguyen[0];
		for (int i = 0; i < so_nguyen.length; i++) {
			if (so_nguyen[i] < min) {
				min = so_nguyen[i];
				
			} else if (so_nguyen[i]> max) {
				max = so_nguyen[i];
				
		}
		}
		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Số bé nhất là: " + min);
		System.out.println("\n------------------------------");
Q_3.close();		
		
		// Question 4:Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
				//	Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai].
				//	Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].
		System.out.println("Question 4");
		Scanner Q_4 = new Scanner(System.in);
		System.out.println("Nhập vào hai số tự nhiên a và b tại đây: ");
		System.out.println("Số a là: ");
		int so_a = Q_4.nextInt();
		System.out.println("Số b là: ");
		int so_b = Q_4.nextInt();
		if (so_a - so_b > 0 ) {
			System.out.println("Số thứ nhất lớn hơn số thứ hai");
	
		} else {
			System.out.println("Số thứ nhất nhỏ hơn số thứ hai");

		}
Q_4.close();		
		
		// Question 5: Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không
		System.out.println("Question 5: ");
		Scanner Q_5 = new Scanner(System.in);
		System.out.println("Nhập vào hai số tự nhiên a và b tại đây: ");
		System.out.println("Số a là: ");
		int aa = Q_5.nextInt();
		System.out.println("Số b là: ");
		int bb = Q_5.nextInt();
		if (aa % bb == 0) {
			System.out.println("Số a có chia hết cho số b");
			
		} else {
			System.out.println("Số a không chia hết cho số b");

		}
Q_5.close();			
		// Question 6: Xếp loại sinh viên theo các qui luật dưới đây:
					//Nếu điểm >= 9.0 - Loại xuất sắc
					//Nếu 8.0<= điểm < 9.0 - Loại giỏi
					//Nếu 7.0<= điểm < 8.0 - Loại khá 
					//Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
					//Nếu 5.0 <= điểm < 6.0 - Loại trung bình
					//Nếu điểm < 5.0 - Loại kém
			// Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4  
				//Viết Chương trình:
					//a. Nhập vào điểm 3 môn học
					//b. Tính điểm trung bình
					//c. Xác định học lực của học sinh dựa trên điểm trung bình
					//d. Hiển thị học lực của học sinh
		System.out.println("Question 6:");
		System.out.println("câu a:");
		Scanner Q_6 = new Scanner(System.in);
		System.out.println("Nhập điểm Toán tại đây:");
		int toan = Q_6.nextInt();
		System.out.println("Nhập điểm Lý tại đây:");
		int ly = Q_6.nextInt();
		System.out.println("Nhập điểm Hoá tại đây:");
		int hoa = Q_6.nextInt();
		
		System.out.println("câu b:");
		int diem_tb = (toan*2 + ly + hoa)/4 ; 
		System.out.println("Điểm trung bình là: " + diem_tb);
		
		System.out.println("câu c và d:");
		if (diem_tb >= 9) {
			System.out.println("Học lực là: Loại xuất sắc");
		} else 
			if (diem_tb >= 8 && diem_tb < 9) {
				System.out.println("Học lực là: Loại giỏi");
		} else 
			if (diem_tb >= 7 && diem_tb < 8) {
				System.out.println("Học lực là: Loại khá");
			
		} else 
			if (diem_tb >= 6 && diem_tb < 7) {
				System.out.println("Học lực là: Loại trung bình khá");
				
		} else 
			if (diem_tb >= 5 && diem_tb < 6) {
				System.out.println("Học lực là: Loại trung bình");
			
		} else {
				System.out.println("Học lực là: Loại Kém");
		}
Q_6.close();		
// Exercise 2:
		// Question 1:
					//Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
					//Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
		
}
}
