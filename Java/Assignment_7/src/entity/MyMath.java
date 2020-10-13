package entity;

public class MyMath {
	public static void main(String[] args) {
	//	float PI = 3.15f; // giá trị PI = 3.14 không thay đổi đc
		sum(3);
		
	}
		// Question 1; Question 1: final variable
//	Tạo class MyMath, khai báo final variable số PI = 3.14
//			Viết method sum(int a) và trả về tổng của a và PI
//			Thử thay đổi số PI = 3.15 trong method xem có được ko?
		public static void sum(int a) {
			final float PI = 3.14f;
			float c = (float)a + PI;
			System.out.println(c);
		}
		// Question 2 : Tạo class Student có property id, name hãy thiết kế class Student sao
//		cho khi đã khởi tạo Student thì id là không thể thay đổi trong suốt quá
//		trình chạy chương trình chương trình

}
