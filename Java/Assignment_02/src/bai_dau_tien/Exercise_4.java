package bai_dau_tien;

import java.time.LocalDate;
import java.util.Random;

public class Exercise_4 {
	public static void main(String[] args) {
		// Question 1: In ngẫu nhiên ra 1 số nguyên
		Random random = new Random();
		int x = random.nextInt();
		System.out.println("Question 1:");
		System.out.println(x);
		System.out.println("-----------------------");
		
		// Question 2: In ngẫu nhiên ra 1 số thực
		System.out.println("Question 2:");
		float y = random.nextFloat();
		System.out.println(y);
		System.out.println("-----------------------");
		
		// Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
		System.out.println("Question 3:");
		String[] arrays = {"Huy", "Long", "Tham"};
		int t = random.nextInt(arrays.length);
		System.out.println(arrays[t]);
		System.out.println("-----------------------");
		
		// Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
		System.out.println("Question 4:");
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long ngau_nhien = minDay + random.nextInt(maxDay - minDay );
		LocalDate ngay_ngau_nhien = LocalDate.ofEpochDay(ngau_nhien);
		System.out.println(ngay_ngau_nhien);
		System.out.println("-----------------------");
		
		// Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
		System.out.println("Question 5:");
		int now = (int) LocalDate.now().toEpochDay();
		int motnam = now - random.nextInt(365);
		long ngaunhien = motnam + random.nextInt(now - motnam);
		LocalDate ngaycantim = LocalDate.ofEpochDay(ngaunhien);
		System.out.println(ngaycantim);
		System.out.println("-----------------------");
		
		// Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ
		System.out.println("Question 6");
		int baygio = (int) LocalDate.now().toEpochDay();
		int quakhu = baygio - random.nextInt(999999);
		long qknn = quakhu + random.nextInt(baygio - quakhu);
		LocalDate ngaydo = LocalDate.ofEpochDay(qknn);
		System.out.println(ngaydo);
		System.out.println("-----------------------");
		
		// Question 7:Lấy ngẫu nhiên 1 số có 3 chữ số
		int k = random.nextInt(999 - 100 + 1) + 100;
		System.out.println(k);
	
	
	
	
	
	
	
	
	
	
	
}

}
