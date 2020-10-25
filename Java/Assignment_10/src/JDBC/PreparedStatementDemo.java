package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String userName = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, userName, password);
		System.out.println("Succesfully! ");
		// Step 3
		String sql = "INSERT INTO `Group` (`name`, author_ID)" 
				   + " VALUES 				(? ,     ?    )";

		PreparedStatement preparedStament = connection.prepareStatement(sql);
		String groupName = "Java Senior";
		short authorId = 6;
		preparedStament.setString(1, groupName);
		preparedStament.setShort(1, authorId);
		
		int effectedRecordAmount = preparedStament.executeUpdate();
		System.out.println("Effected: " + effectedRecordAmount);
		
		connection.close();
	}

}
