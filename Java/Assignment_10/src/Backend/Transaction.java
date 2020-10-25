package Backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Ultis.JDBCUtils;

public class Transaction {
	private JDBCUtils jDBCUtils;
	
	public Transaction() throws FileNotFoundException, IOException {
		jDBCUtils = new JDBCUtils();
	}
	
	public void deleteEmployees(int idDepartment) throws ClassNotFoundException, SQLException {
		Connection connection = jDBCUtils.connect();
		connection.setAutoCommit(false);
		
		String emp = "DELETE FROM `Account` WHERE DepartmentID = ?";
		PreparedStatement delEmp = connection.prepareStatement(emp);
		delEmp.setInt(1, idDepartment);
		
		String dep = "DELETE FROM `department` WHERE DepartmentID = ?";
		PreparedStatement delDep = connection.prepareStatement(dep);
		delDep.setInt(1, idDepartment);
		
		try {
			delEmp.executeUpdate();
			System.out.println("delete!");
			
			delDep.executeUpdate();
			System.out.println("delete!");
			
			connection.commit();
			System.out.println("Transaction Commit!");
			
		} catch (Exception e) {
			connection.rollback();
			System.out.println("Transaction Rollback!");
		}
		
		connection.setAutoCommit(true);
		jDBCUtils.disconnect();
	}

}
