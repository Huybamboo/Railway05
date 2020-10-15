package Entity;

public class Student {
	private static int counter =0;
	private int id;
	private String name;
	
	public Student(int id , String name) {
		counter ++;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String result = "";
		result += "ID là: " + id + " Tên học sinh là: " + name + "\n";
		return result;
	}

}
