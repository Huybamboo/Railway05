package Frontend;

import java.sql.SQLException;

import Backend.DepartmentDao;

public class Program2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DepartmentDao departmentDao = new DepartmentDao();
//		departmentDao.getDepartments();
//		System.out.println("--------------------");
		departmentDao.getDepartmentById();
	}

		
	

}
