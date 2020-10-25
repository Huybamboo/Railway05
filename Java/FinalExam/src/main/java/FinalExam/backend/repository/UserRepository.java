package FinalExam.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import FinalExam.entity.EUser;
import FinalExam.entity.user;
import Utils.JdbcUtils;

public class UserRepository implements Iuser{
	private JdbcUtils jdbcUtils;
	private Connection connection;
	
	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		jdbcUtils = new JdbcUtils();
		}


	@Override
	public user Login(String Email, String Password) throws Exception {
		try {
		connection = jdbcUtils.getConnect();
		String sql = "SELECT * FROM final_java.user" + "WHERE Email = ? AND Password = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// set parameter
		preparedStatement.setString(1, Email);
		preparedStatement.setString(2, Password);

		// Step 4: Execute Query
		ResultSet resultSet = preparedStatement.executeQuery();
		// Step 5: Handling result
		if (resultSet.next()) {
			int userId = resultSet.getInt("UserID");
			String fullName = resultSet.getString("FullName");
			EUser Roles = EUser.valueOf(resultSet.getString("Roles").toUpperCase());

			user user = new user(userId, fullName, Email, Password, Roles);		
			return user;
		} else {
			throw new Exception("Tai khoan hoac mat khau sai!");
		}
		} finally {
			connection.close();
		}
	}			
}
	


