package entity;

public class Student_Exercise_1 {
	// Question 1: static variable
		//	Khai báo 1 class student có các thuộc tính id, name, college
		//	Với college là static variable.
	public static int counter = 0;
	private int id;
	private String name;
	static String college;
	static int moneyGroup = 0;
	
	public Student_Exercise_1() {
		counter ++ ;
	}
	
	public Student_Exercise_1(int id, String name) {
		this.id = id;
		this.name = name;
		counter ++ ;
		moneyGroup += 100; // mỗi hs sẽ nộp 100k tiền quỹ
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
	public static String getcollege() {
		return college;
	}
	public static void setcollege(String College) {
		college = College;
	}
	public static int getMoneyGroup() {
		return moneyGroup;
	}
	public static void chiquylop(int chiquylop) {
		Student_Exercise_1.moneyGroup -= chiquylop;
	}
	public static void themquylop(int themquylop) {
		Student_Exercise_1.moneyGroup += themquylop;
	}
	public static void setMoneyGroup(int tienquy) {
		moneyGroup = tienquy;
	}
	
	@Override
	public String toString() {
		String result ="";
		result += "ID là: " + id + " Tên là: " + name + " "  + college + " tien quy lop " + moneyGroup;
				return result;
	}

}
