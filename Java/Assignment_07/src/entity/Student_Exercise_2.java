package entity;

public class Student_Exercise_2 {
	// Question 2:
	private final int id;
	private String name;
	
	
	public Student_Exercise_2(final int id , String name) {
		this.name = name;
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	// Student bắt buộc phải học bài, và việc học bài là như nhau đối với các
		//	học sinh  ta viết method void study(), bên trong method ta sẽ in ra
		//	text "Đang học bài…"
	public final void study() {
		System.out.println("Đang học bài");
	}
	@Override
	public String toString() {
		String result = "";
		result += "id " + id + " name " + name;
		return result;
	}
}
