package Exercise_2;


public class Student implements IStudent{
	private int id;
	private String name;
	private int group;
	
	
	public Student() {
		return;
	}
	
	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
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
	public int getGroup() {
		return group;
	}
	public void setgroup(int group) {
		this.group = group;
	}
	
	
	
	@Override
	public String toString() {
		String result = "";
		result += "Tên là: " + name + " ID là: " + id + " Nhóm là: " + group;
		return result;
	}
	@Override
	public void diemDanh() {
		System.out.println(name + " điểm danh");
		
	}
	@Override
	public void hocBai() {
		System.out.println(name + " đang học bài ");
		
	}
	@Override
	public void diDonVeSinh() {
		System.out.println(name + "đang dọn vệ sinh");
		
	}
	
}
