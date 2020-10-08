package com.vti.Exercise_4;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private int diemhl;
	
	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.diemhl = 0;
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
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public int getDiemhl() {
		return diemhl;
	}
	// c) Tạo 1 method cho phép set điểm vào
	public void setDiemhl(int diemhl) {
		this.diemhl = diemhl;
	}

	// d) Tạo 1 method cho phép cộng thêm điểm
	public void plusDiemhl(int diemhl) {
		this.diemhl += diemhl;
	}
	//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
	//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm >
	//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0
	//	thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	public String toString() {
		String danhgia;
		if (diemhl < 4.0) {
			danhgia = "Yếu";
		} else if (diemhl < 6) {
			danhgia = "Trung bình";
		} else if (diemhl < 8) {
			danhgia = "Khá";
		} else {
			danhgia = "Giỏi";
		}

		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", hometown='" + hometown + '\'' + ", diem hoc luc="
				+ diemhl + ", Danh gia='" + danhgia + '\'' + '}';
	}
	
}
