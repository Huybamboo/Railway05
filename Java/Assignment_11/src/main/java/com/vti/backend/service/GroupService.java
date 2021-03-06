package com.vti.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.entity.Group;
import com.vti.backend.repository.GroupRepository;
import com.vti.backend.repository.IGroupRepository;

public class GroupService implements IGroupService {

	private IGroupRepository groupRepository;

	public GroupService() {
		groupRepository = new GroupRepository();
	}

	public List<Group> getListGroup() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return groupRepository.getGroups();
	}

	public void createGroup(String name) {
		groupRepository.createGroup(name);
	}

	public void deleteGroup(int id) {
		groupRepository.deleteGroup(id);
	}

	public boolean isGroupNameExists(String name) {
		return groupRepository.isGroupNameExists(name);
	}
}
