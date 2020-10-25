package FinalExam.backend.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import FinalExam.backend.repository.Iproject;
import FinalExam.backend.service.ProjectService;
import FinalExam.entity.project;

public class ProjectController {
	private Iproject projectService;
	
	public ProjectController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		projectService = new ProjectService();
	}
	public project inputProjectByName(String nameproject) throws SQLException, ClassNotFoundException {
		
		return projectService.inputProjectByName(nameproject);
	}
	
	public project getManager(int ExpInYear) throws SQLException, ClassNotFoundException {
		
		return projectService.getManager(ExpInYear);
	}

}
