package entity;

public class Student {
	private static int id;
	private String name;
	
	public Student( String name) {
		this.id ++;
		this.name = name;
	}
	@SuppressWarnings("deprecation")
	public static int getId(int id) {
		return id;
	}

	@Override
	public String toString() {
		String result = " ";
		result = "MSV" + id + " Name: " + name;
		return result;
	}
	
	

}
