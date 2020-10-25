package FinalExam.entity;

public class project {
	
	private int projectId;
	private String nameproject;
	private int teamSize;
	private int idManager;
	private int idEmployees;
	
	
	public project(int projectId, int teamSize, int idManager, int idEmployees, String nameproject ) {
		this.projectId 		= projectId;
		this.nameproject 	= nameproject;
		this.teamSize 		= teamSize;
		this.idManager 		= idManager;
		this.idEmployees 	= idEmployees;
	}


	public String getNameproject() {
		return nameproject;
	}


	public void setNameproject(String nameproject) {
		this.nameproject = nameproject;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public int getIdManager() {
		return idManager;
	}


	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}


	public int getIdEmployees() {
		return idEmployees;
	}


	public void setIdEmployees(int idEmployees) {
		this.idEmployees = idEmployees;
	}


	@Override
	public String toString() {
		String result = "";
		result += "projectId là: " + projectId + "Tên của dự án là: " + nameproject + "số người trong dự án là: " + teamSize + "id của người quản lý là: " 
					+ idManager + "số thành viên trong team là: " + idEmployees;
		return result;
	}
	
	
	
}
