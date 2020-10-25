package Exercise_2;

import java.util.Scanner;

public class Student_person extends Person{
	int MSV;
	String email;
	int diemtb;
	
	public Student_person(int MSV, String email, int diemtb) {
		super();
		this.MSV = MSV;
		this.email = email;
		this.diemtb = diemtb;
	}

	public int getMSV() {
		return MSV;
	}

	public void setMSV(int mSV) {
		MSV = mSV;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDiemtb() {
		return diemtb;
	}

	public void setDiemtb(int diemtb) {
		this.diemtb = diemtb;
	}
// 	public void inputInfo() {
//	}
	@Override
	public String toString() {
		String result = super.toString();
		result += "ma sinh vien la: " + MSV + "email la: " + email + "diem trung binh la: " + diemtb;
		return result;
	}
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi ban nhap thong tin");
		
	}

}
