package FinalExam.entity;

public class manager extends user {

	private int ExpInYear;

	public manager(int iDUser, String fullName, String email, String password, EUser roles, int expInYear) {
		super(iDUser, fullName, email, password, roles);
		this.ExpInYear = expInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [Năm kinh nghiệm là: " + ExpInYear + "IDUser là " + getIDUser() + 	"\nFullName là: " + getFullName() + "\nEmail là: " 
						+ getEmail() + "\nChức vụ là: " + getRoles() + "]";
	}

	
	
	
	
	
	
	
	
}
