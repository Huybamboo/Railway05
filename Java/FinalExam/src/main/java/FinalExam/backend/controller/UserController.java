package FinalExam.backend.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;



import FinalExam.backend.repository.Iuser;
import FinalExam.backend.service.UserService;
import FinalExam.entity.user;

public class UserController {
	private  Iuser userService;
	
	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}		
	public user Login(String email, String password) throws Exception {
			return userService.Login(email, password);

}
}
