package com.vti.exercise_5;

import java.util.Scanner;

public class CanBo {
// H�? tên, tuổi, giới tính(name, nữ,khác), địa chỉ.
	protected String name;
	protected int tuoi;
	protected Enum_canbo gioiTinh;
	protected String address;
	
	public CanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi nhap thong tin ten: ");
		this.name = scanner.nextLine();
		System.out.println("moi nhap thong tin tuoi: ");
		this.tuoi = scanner.nextInt();
		System.out.println("moi nhap thong tin gioi tinh: ");
		scanner.nextLine();			// chua xac định đc dòng lệnh kế tiếp phải chạy
		
		String gender = scanner.nextLine();			// convert tu enum sang String
		this.gioiTinh = Enum_canbo.valueOf(gender);
		
		System.out.println("moi nhap thong tin dia chi: ");
		this.address = scanner.nextLine();
	}
	
	public CanBo (String name,  int tuoi, Enum_canbo gioitinh, String address) {
		this.name = name;
		this.tuoi = tuoi;
		this.gioiTinh = gioitinh;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public Enum_canbo getGioiTinh() {
		return gioiTinh;
	}
	public void setgioiTinh(Enum_canbo gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	@Override // toSttring
	
	public String toString() {
			String result = ""; 
			result += "Ho ten: " + name + " Tuoi: " + tuoi + " gioi tinh: " + gioiTinh + " Dia chi: " + address;
			
			return result;	
	}
	@Override
	public boolean equals(Object obj) {
		String str1 = obj.toString();  // ep kieu object ve String
			if (str1.equals(name)) 
			return true;{
			}
			return false;
	}
	
	
}
