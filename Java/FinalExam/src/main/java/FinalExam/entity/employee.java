package FinalExam.entity;

public class employee extends user{

	private project projectId;
	private Eemployee ProSkill;
	
	
	public employee(int iDUser, String fullName, String email, String password, EUser roles, project projectId,
			Eemployee proSkill) {
		super(iDUser, fullName, email, password, roles);
		this.projectId = projectId;
		ProSkill = proSkill;
	}
	
	
	public project getProjectId() {
		return projectId;
	}
	public void setProjectId(project projectId) {
		this.projectId = projectId;
	}
	public Eemployee getProSkill() {
		return ProSkill;
	}
	public void setProSkill(Eemployee proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [ID dự án là: " + projectId + "\nKỹ năng của nhân viên là: " + ProSkill + "\nIDUser là " + getIDUser() + 	"\nFullName là: " + getFullName() + "\nEmail là: " 
				+ getEmail() + "\nChức vụ là: " + getRoles() + "]";
	}
	
	
	 
	
	
	

}
