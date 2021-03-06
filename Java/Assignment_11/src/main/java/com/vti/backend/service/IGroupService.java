package com.vti.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.entity.Group;

public interface IGroupService {

	public List<Group> getListGroup() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	public void createGroup(String name);

	public void deleteGroup(int id);

	public boolean isGroupNameExists(String name);
}
