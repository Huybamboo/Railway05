package FinalExam.entity;

public class user {
	private int IDUser;
	private String FullName;
	private String Email;
	private String Password;
	private EUser Roles;
	
	
	
	public user(int iDUser, String fullName, String email, String password, EUser roles) {
		this.IDUser = iDUser;
		this.FullName = fullName;
		this.Email = email;
		this.Password = password;
		this.Roles = roles;
	}
	
	public int getIDUser() {
		return IDUser;
	}
	public void setIDUser(int iDUser) {
		IDUser = iDUser;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public EUser getRoles() {
		return Roles;
	}
	public void setRoles(EUser roles) {
		Roles = roles;
	}
	

	public String toString() {
		String result ="";
		result += "IDUser là " + IDUser + 	"\nFullName là: " + FullName + "\nEmail là: " + Email + "\nChức vụ là: " + Roles;
		return result;
	}
	
}
