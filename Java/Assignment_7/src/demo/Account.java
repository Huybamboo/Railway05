package demo;

public class Account {
	static int counter = 0;
	private int id;
	private String name;
	static int classFund;
	 
	public Account() {
		counter ++;
	}
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
		counter ++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static int getClassFund() {
		return classFund;
	}
	public static void setClassFund(int amount) {
		classFund = amount;
	}


	
}
