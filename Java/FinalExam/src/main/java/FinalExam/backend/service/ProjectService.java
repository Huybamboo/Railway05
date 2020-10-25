package FinalExam.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import FinalExam.backend.repository.Iproject;
import FinalExam.backend.repository.ProjectRepository;

import FinalExam.entity.project;

public class ProjectService implements Iproject {
	private Iproject projectRepository;
	
	public ProjectService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		projectRepository = new ProjectRepository();
	}
	@Override
	public List<project> getListProject() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		
		return projectRepository.getListProject();
	}

	@Override
	public project inputProjectByName(String nameproject) throws SQLException, ClassNotFoundException {
		
		return projectRepository.inputProjectByName(nameproject);
	}

	@Override
	public project getManager(int ExpInYear) throws SQLException, ClassNotFoundException {
		
		return projectRepository.getManager(ExpInYear);
	}

}
