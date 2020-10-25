package FinalExam.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import FinalExam.entity.project;
import Utils.JdbcUtils;

public class ProjectRepository implements Iproject{
	private JdbcUtils jdbcUtils;
	private Connection connection;
	
	public ProjectRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		jdbcUtils = new JdbcUtils();
		}
	
	
	public List<project> getListProject() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
		List<project> projects = new ArrayList<>();
		try {
			connection = jdbcUtils.getConnect();
			
			
			
		// Create a statment object
			Statement statement = connection.createStatement();
			
		// Execute query
		String proLists = "SELECT * FROM final_java.project";
		ResultSet resultSet = statement.executeQuery(proLists);
		// Handling result set
		while (resultSet.next()) {
			int projectId = resultSet.getInt("projectId");
			String nameproject = resultSet.getString("nameproject");
			int teamSize = resultSet.getInt("teamSize");
			int idManager = resultSet.getInt("idManager");
			int idEmployees = resultSet.getInt("idEmployees");

			project project = new project(projectId, teamSize, idManager, idEmployees, nameproject);
			projects.add(project);
		}
		return projects;
		}
		
		finally {
			// Step 6: Close connection
			connection.close();
		}
	}
	
	
	
	
	
	
	
	public project inputProjectByName(String nameproject) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	public project getManager(int ExpInYear) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
