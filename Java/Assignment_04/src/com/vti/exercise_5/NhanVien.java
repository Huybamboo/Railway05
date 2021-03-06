package com.vti.exercise_5;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congviec;
	
	public NhanVien() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap cong viec:");
		this.congviec = scanner.nextLine();
	}
	
	public NhanVien (String congviec, String name, int tuoi, Enum_canbo gioiTinh, String address) {
		super ( name,  tuoi,  gioiTinh,  address);
		this.congviec = congviec;
	}
	public String getcongviec() {
		return congviec;
	}
	public void setcongviec(String congviec) {
		this.congviec = congviec;
	}
	@Override
	public String toString() {
		String result = super.toString();
		result += "cong viec la: "+ congviec;
 		return result;
	}
}
