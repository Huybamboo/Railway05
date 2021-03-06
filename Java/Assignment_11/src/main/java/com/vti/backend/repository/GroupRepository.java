package com.vti.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.entity.Group;
import com.vti.utils.JdbcUtils;

public class GroupRepository implements IGroupRepository {

	private JdbcUtils utils;
	private Connection connection;

	public GroupRepository() {
		utils = new JdbcUtils();
	}

	public List<Group> getGroups() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		List<Group> groups = new ArrayList<Group>();

		try {
			// get connection
			connection = utils.getConnect();
			// Step 3: Create a statement object
			Statement statement = connection.createStatement();
			String sql = "SELECT id, `name` FROM `Group`";
			// Step 4: Execute SQL query
			ResultSet resultSet = statement.executeQuery(sql);

			// Step 5: Handling Result Set
			while (resultSet.next()) {
				// item
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");

				groups.add(new Group(id, name));
			}
			return groups;

		} finally {
			// Step 6: Close connection
			connection.close();
		}
	}

	public Group getGroupById(int id) {
		return null;
	}

	public boolean isGroupNameExists(String name) {
		return true;
	}

	public void createGroup(String name) {

	}

	public void updateGroupName(int id, String newName) {

	}

	public void deleteGroup(int id) {

	}

}
