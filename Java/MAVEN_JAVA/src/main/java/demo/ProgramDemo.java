package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ProgramDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("E:\\Java_core\\workspace\\MAVEN_JAVA\\database.properties"));
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url, username, password );
		
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM question_level";
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String level = resultSet.getString("level");
			
			System.out.println("ID: " + id);
			System.out.println("Level: " + level);
		}
		connection.close();
	}

}
