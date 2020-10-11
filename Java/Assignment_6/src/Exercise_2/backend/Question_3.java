package Exercise_2.backend;

public class Question_3 {
		public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[10]);
			
		} catch (Exception e) {
			System.out.println("numbers[10] vượt quá giới hạn của dãy numbers, vui lòng nhập lại ");
		}	
		}
}
