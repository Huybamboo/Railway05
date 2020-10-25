package Assign_3;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Exercise_1_2_3_4 {
	public static void main(String[] args) {
		
		
// Exercise 1 (Optional): Datatype Casting
		//	Question 1:
					//	Khai báo 2 số lương có kiểu dữ liệu là float.
					//	Khởi tạo Lương của Account 1 là 5240.5 $
					//	Khởi tạo Lương của Account 2 là 10970.055$
					//	Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
					//	Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
		System.out.println("Question 1:");
		float luong1=  5240.5f;
		float luong2=  10970.055f;
		int account1 = (int) luong1;
		int account2 = (int) luong2;
		System.out.println(account1);
		System.out.println(account2);
		
		
		// Question 2:Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêmcó số 0 ở đầu cho đủ 5 chữ số)
		System.out.println("Question 2:");
		Random random = new Random();
		int A = 10000 + random.nextInt(99999 - 10000);
		System.out.println(A);
		
		// Question 3:Lấy 2 số cuối của số ở Question 2 và in ra.
				//Gợi ý:
				//Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
				//Cách 2: chia lấy dư số đó cho 100
		System.out.println("Question 3:");
		int B = A % 100 ;							// //Cách 2: chia lấy dư số đó cho 100
		if (B < 10) {
			System.out.println("0"+ B);
		} else {
		System.out.println(B);
		}
		
		// Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		System.out.println("Question 4:");
		Exercise_1_Question_4(1, 2);    // tương ứng Exercise_1_Question_4(a, b)
		System.out.println("--------------------------------------------------");
		
		
// Exercise 2 (Optional): Default value
		//Question 1: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp 
					  // (sử dụng vòng for để khởi tạo):
								//	 Email: "Email 1"
								//	 Username: "User name 1"
								//	 FullName: "Full name 1"
								//	 CreateDate: now
		System.out.println("Exercise 2:");
		System.out.println("Question 1:");
		Account[] bangmoi = new Account[5];
		for (int i = 0; i < bangmoi.length; i++) {
			bangmoi[i] = new Account();
			bangmoi[i].email = "Email " + (i+1);
			bangmoi[i].userName = "User name " + (i + 1);
			bangmoi[i].fullName = "Full name " + (i + 1);
			bangmoi[i].createDate = LocalDate.now();
			System.out.println(bangmoi[i].email + bangmoi[i].userName + bangmoi[i].fullName + bangmoi[i].createDate );
			
		}
		System.out.println("--------------------------------------------------");
		
// Exercise 3(Optional): Boxing & Unboxing
		// Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
					// Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân)
		System.out.println("Exercise 3:");
		System.out.println("Question 1:");
		Integer luong = 5000;
		float luong_convert = (float) luong;
		System.out.printf("%.2f" , luong_convert);
		
		
		// Question 2: Khai báo 1 String có value = "1234567"
					   //Hãy convert String đó ra số int
		System.out.println("Question 2:");
		String value = "1234567";
		int D = Integer.parseInt(value);
		System.out.println("");
		System.out.println("Số của String vừa khai báo là: " + D);
		
		
		// Question 3: Khởi tạo 1 số Integer có value là chữ "1234567"
						// Sau đó convert số trên thành datatype int
		System.out.println("Question 3:");
		int E = 1234567;
		String Q_3 = String.valueOf(E);
		System.out.println("String là: " + Q_3);
		System.out.println("--------------------------------------------------");

// Exercise 4: String
		// Question 1: Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó 
					// (các từ có thể cách nhau bằng nhiều khoảng trắng );
		System.out.println("Exercise 4:");
		System.out.println("Question 1:");
		String Day_value = "homnay la ngay thu nam trong    tuan";
		System.out.println(Day_value.length());
		
		// Question 2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		System.out.println("Question 2:");
		String s1 = "Hôm nay là";
		String s2 = " Tết Trung Thu";
		System.out.println(s1 + s2);
		
		// Question 3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên
		System.out.println("Question 3:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập tên của bạn: ");
		String input_user = scanner.next();
		String Name = ((String) input_user.subSequence(0, 1)).toUpperCase() + input_user.substring(1);
		System.out.println(Name);
scanner.close();		
		
		//Question 4: Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
					// VD: Người dùng nhập vào "Nam", hệ thống sẽ in ra 
// sử dụng split()
							//"Ký tự thứ 1 là: N"
							//"Ký tự thứ 1 là: A"
							//"Ký tự thứ 1 là: M" 
	
		// Question 5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và
						// hệ thống sẽ in ra họ và tên đầy đủ
		System.out.println("Question 5:");
		Scanner scanner_5 = new Scanner(System.in);
		System.out.println("Mời nhập họ của bạn: ");
		String ho = scanner_5.next();
		System.out.println("Mời nhập tên : ");
		String ten = scanner_5.next();
		System.out.println("Họ và tên đầy đủ của bạn là : " + ho + " " + ten);
scanner_5.close();		
		
		// Question 6:Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
					//VD:
					//Người dùng nhập vào "Nguyễn Văn Nam"
					//Hệ thống sẽ in ra
					//"Họ là: Nguyễn"
					//"Tên đệm là: Văn"
					//"Tên là: Nam"
		
		// Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
						//a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
								//VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
								//chuẩn hóa thành "nguyễn văn nam"
						//b) Viết hoa chữ cái mỗi từ của người dùng
								//VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
								//chuẩn hóa thành "Nguyễn Văn Nam"
//		System.out.println("ý a");
//		Scanner scanner_7 = new Scanner(System.in);
//		System.out.println("Mời nhập Họ và Tên đầy đủ của bạn: " );
//		String Fullname7 = scanner_7.next();
//		System.out.println(Fullname7.trim());
//		System.out.println("ý b");
		
		
		// Question 8: In ra tất cả các group có chứa chữ "Java"
		// q 10 sử dung string.reverse hoặc charAt
		// Question 14 (Optional): Replace character
					//Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
							//Ví dụ:
							//"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
		System.out.println("Question 14:");
		String Q_14 = "VTI Academy";
		String out_Q_14 = Q_14.replace("e", "*");
		System.out.println(out_Q_14);
		
		
		
		
		
		
		
}
public static void Exercise_1_Question_4(int a, int b) {

	float c = (float) a/b;
	System.out.println("Thương của hai số vừa nhập là: " + c);
	
}

}
