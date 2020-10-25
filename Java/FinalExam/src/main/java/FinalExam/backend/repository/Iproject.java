package FinalExam.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import FinalExam.entity.project;

public interface Iproject {
	List<project> getListProject() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;
	
	
	
	project inputProjectByName(String nameproject) throws SQLException, ClassNotFoundException;
	
	project getManager(int ExpInYear) throws SQLException, ClassNotFoundException;
	

}
