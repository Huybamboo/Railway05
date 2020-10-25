package FinalExam.backend.repository;

import FinalExam.entity.user;

public interface Iuser {
	user Login(String Email, String Password) throws Exception;

}
