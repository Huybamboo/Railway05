package Frontend;

import Backend.Exercsie_3;
import Entity.MyMap;

public class Program_3 {
public static void main(String[] args) {
		MyMap<Integer, String> no_1= new MyMap<>(1, "Long");
		System.out.println(no_1);
		
		Exercsie_3 exercsie_3 = new Exercsie_3();
		exercsie_3.Print(10);
		exercsie_3.question4();
		exercsie_3.question5();
		exercsie_3.question7();
		exercsie_3.question8();
		
}
}