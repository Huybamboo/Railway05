package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise_1 {
	public void Question_1() throws SQLException, ClassNotFoundException {
				
				String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
				String userName = "root" ;
				String password = "root" ;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection(url, userName, password );
				
			
				Statement statement = connection.createStatement();
				String sql = "SELECT * FROM question_level";
				
			
				ResultSet resultSet = statement.executeQuery(sql);
				
			
				while (resultSet.next()) {
					// item
					int id = resultSet.getInt("id");
					String level = resultSet.getString("level");
					
					System.out.println("ID: " + id);
					System.out.println("Level: " + level);
				}
				
			
				connection.close();
				
				
				
			}
	public void Question_2() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root" ;
		String password = "root" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password );
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM testing_system.position";
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int PositionID = resultSet.getInt("PositionID");
			String PositionName = resultSet.getString("PositionName");
			
			System.out.println("PositionID la: " + PositionID);
			System.out.println("PositionName la: " + PositionName);
		}
		connection.close();
	}
	public void Question_3() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root" ;
		String password = "root" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password );
		
		// Step 3
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap vao positionName: ");
		String input = scanner.nextLine();
		String sql = " INSERT INTO position (`PositionName`)"
						+ "VALUE ( '" + input + "') ";
		int rowAffectedAmount = statement.executeUpdate(sql);
		
		System.out.println("Số lượng thay đổi là:" + rowAffectedAmount);
		connection.close();
		
	}
	
	public void Question_4() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root" ;
		String password = "root" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password );
		
		Statement statement = connection.createStatement();

		String sql = "UPDATE `position`" 
					+ "SET `PositionName` = 'Dev' "
					+ "WHERE `PositionID` = 5 ";

		int rowAffectedAmount = statement.executeUpdate(sql);
		System.out.println("Số lượng thay đổi là:" + rowAffectedAmount);
		
		connection.close();
		
	}
	
	public void Question_5() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root" ;
		String password = "root" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password );
		
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời nhập vào PositionID cần Delete: ");
		int deleteQ5 = scanner.nextInt();
		String sql = "DELETE FROM `Position`"
					+ "WHERE PositionID = " + deleteQ5;
		
		int rowAffectedAmount = statement.executeUpdate(sql);
		
		System.out.println("Số lượng thay đổi là:" + rowAffectedAmount);
		connection.close();
	}
	
}
