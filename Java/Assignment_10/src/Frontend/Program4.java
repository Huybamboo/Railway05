package Frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import Backend.Transaction;

public class Program4 {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Ex_4();
		
	}
	public static void Ex_4() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap id: ");
		int inputId = scanner.nextInt();
		Transaction transaction = new Transaction();
		transaction.deleteEmployees(inputId);
	}

}
