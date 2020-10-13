package Entity;

public class Student {
	private static int counter =0;
	private static int id = 0;
	private String name;
	
	public Student(String name) {
		counter ++;
		id ++;
		this.name = name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public static int getCounter() {
		return counter;
	}


	

	public static int getId() {
		return id;
	}


	@Override
	public String toString() {
		String result = "";
		result += "ID của học sinh là: " + id + " Tên của học sinh là: " + name;
		return result;
	}

}