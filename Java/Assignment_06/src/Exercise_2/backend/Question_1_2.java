package Exercise_2.backend;

public class Question_1_2 {
	// Question 1: try…catch…finally
			 // Hãy xử lý exception cho VD trên, khi bị lỗi thì sẽ in ra text "cannot divide 0"

		public static void main(String[] args) {
			try {
				float result = devide(7 , 0);
				System.out.println(result);
			} 
			catch (ArithmeticException e) {
				
				System.out.println("cannot devide 0");
			}
			finally {
				System.out.println("divide completed!");
			}
		}
		
		
		public static float devide(int a, int b) {			 // method
			return a/b;
			
			}
		

	}



