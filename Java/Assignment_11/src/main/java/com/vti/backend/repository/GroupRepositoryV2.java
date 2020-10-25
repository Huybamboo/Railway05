package com.vti.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.entity.Group;

public class GroupRepositoryV2 implements IGroupRepository {

	/*
	 * @see com.vti.backend.repository.IGroupRepository#getGroups()
	 */
	public List<Group> getGroups() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see com.vti.backend.repository.IGroupRepository#getGroupById(int)
	 */
	public Group getGroupById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @see com.vti.backend.repository.IGroupRepository#isGroupNameExists(java.lang.
	 * String)
	 */
	public boolean isGroupNameExists(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * @see
	 * com.vti.backend.repository.IGroupRepository#createGroup(java.lang.String)
	 */
	public void createGroup(String name) {
		// TODO Auto-generated method stub

	}

	/*
	 * @see com.vti.backend.repository.IGroupRepository#updateGroupName(int,
	 * java.lang.String)
	 */
	public void updateGroupName(int id, String newName) {
		// TODO Auto-generated method stub

	}

	/*
	 * @see com.vti.backend.repository.IGroupRepository#deleteGroup(int)
	 */
	public void deleteGroup(int id) {
		// TODO Auto-generated method stub

	}

}
