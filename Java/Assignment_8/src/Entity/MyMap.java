package Entity;

public class MyMap <K, V>{
	// Question 6: K & V generic
			//	Tạo 1 class có tên là MyMap, lưu dữ liệu theo dạng key, value
			//	Tạo các method
			//	a) GetValue()
			//	b) getKey ()
			//	Viết chương trình demo: tạo 1 object Student có key là Mã sinh viên
			//	và value là tên của sinh viên đó
	K id;
	V name;
	
	public MyMap(K id , V name) {
		this.id = id;
		this.name = name;
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}
	
	public void GetValue() {
		System.out.println(name);
	}

	public void getKey() {
		System.out.println(id);
	}
	
	@Override
	public String toString() {
		String result = "";
		result = "ID là: " + id + "\nTên là: " + name;
		return result;
	}
}
