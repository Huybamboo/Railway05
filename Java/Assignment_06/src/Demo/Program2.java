package Demo;

public class Program2 {
	public static void main(String[] args) {
		try {
			float result = devide(7 , 0);
			System.out.println(result);
		} 
		catch (ArithmeticException e) {
			
			System.out.println("cannot devide 0");
		}
	}
	
	
	public static float devide(int a, int b) {
		return a/b;
		
		}
	

}