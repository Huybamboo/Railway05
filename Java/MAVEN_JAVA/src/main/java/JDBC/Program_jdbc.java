package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program_jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1
		
		// Step 2
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root" ;
		String password = "root" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(url, userName, password );
		
		// Step 3
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM question_level";
		
		// Step 4
		ResultSet resultSet = statement.executeQuery(sql);
		
		// Step 5
		while (resultSet.next()) {
			// item
			int id = resultSet.getInt("id");
			String level = resultSet.getString("level");
			
			System.out.println("ID: " + id);
			System.out.println("Level: " + level);
		}
		
		// Step 6
		connection.close();
		
		
		
	}

}
