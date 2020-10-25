package Ultis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Ultis.Properties.DatabaseProperties;



public class JDBCUtils {
	private Connection connection;
	private DatabaseProperties databaseproperties; 
	
	public JDBCUtils() throws FileNotFoundException, IOException {
		databaseproperties = new DatabaseProperties();
	}
	
	public void isConnectForTesting() throws ClassNotFoundException, SQLException {
		String url = databaseproperties.getProperty("url");
		String username = databaseproperties.getProperty("username");
		String password = databaseproperties.getProperty("password");
		Class.forName(databaseproperties.getProperty("driver"));
		connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect success!");
		
	}
	
	public Connection connect() throws ClassNotFoundException, SQLException {
		String url = databaseproperties.getProperty("url");
		String username = databaseproperties.getProperty("username");
		String password = databaseproperties.getProperty("password");
		Class.forName(databaseproperties.getProperty("driver"));
		connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
	}

	public void disconnect() throws SQLException {
		connection.close();
	}
}
