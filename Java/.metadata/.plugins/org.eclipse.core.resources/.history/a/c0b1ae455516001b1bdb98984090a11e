package com.vti.backend.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.entity.Group;
import com.vti.backend.service.GroupService;
import com.vti.backend.service.IGroupService;

public class GroupController {

	private IGroupService groupService;

	public GroupController() {
		groupService = new GroupService();
	}

	public List<Group> getListGroup() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return groupService.getListGroup();
	}

	public void createGroup(String name) {
		groupService.createGroup(name);
	}

	public void deleteGroup(int id) {
		groupService.deleteGroup(id);
	}

	public boolean isGroupNameExists(String name) {
		return groupService.isGroupNameExists(name);
	}
}
