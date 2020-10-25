package FinalExam.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import FinalExam.backend.controller.ProjectController;
import FinalExam.backend.controller.UserController;
import FinalExam.entity.project;


public class Function {

	private ProjectController projectController;

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		projectController = new ProjectController();
	}
	public void getListProject() throws ClassNotFoundException, SQLException {
		List<project> users = projectController.get
		System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
		for (User user : users) {
			System.out.printf("%-15s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
					"*********");
		}
	}
}