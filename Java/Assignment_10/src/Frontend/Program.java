package Frontend;

import java.sql.SQLException;

import Backend.Exercise_1;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Exercise_1 exercise_1 = new Exercise_1();
		System.out.println("Question_1 ");
		exercise_1.Question_1();
		System.out.println("--------------- Connect success! ----------------");
		
		System.out.println("Question_2 ");
		exercise_1.Question_2();
		System.out.println("--------------- Connect success! ----------------");
		
		System.out.println("Question_3 ");
		exercise_1.Question_3();
		System.out.println("--------------- Connect success! ----------------");
		
		System.out.println("Question_4 ");
		exercise_1.Question_4();
		System.out.println("--------------- Connect success! ----------------");
		
		System.out.println("Question_5 ");
		exercise_1.Question_5();
		System.out.println("--------------- Connect success! ----------------");
	}

}
