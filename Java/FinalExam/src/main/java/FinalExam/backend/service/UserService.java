package FinalExam.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import FinalExam.backend.repository.Iuser;
import FinalExam.backend.repository.UserRepository;
import FinalExam.entity.user;

public class UserService implements Iuser {
	private Iuser userRepository;
	
	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();

}

	@Override
	public user Login(String Email, String Password) throws Exception {
		
		return userRepository.Login(Email, Password);
	}
}