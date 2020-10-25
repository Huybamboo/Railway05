package com.vti.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.entity.Group;

public interface IGroupRepository {
	public List<Group> getGroups() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	public Group getGroupById(int id);

	public boolean isGroupNameExists(String name);

	public void createGroup(String name);

	public void updateGroupName(int id, String newName);

	public void deleteGroup(int id);
}
