package com.vti.exercise_5;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	
	public CongNhan() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap bac: ");
		this.bac = scanner.nextInt();
		}

	
	public CongNhan (int bac, String name, int tuoi, Enum_canbo gioiTinh, String address) {
		super ( name,  tuoi,  gioiTinh,  address);
		this.bac = bac;
		}
	
	public int getbac() {
		return bac;
	}
	
	public void setbac(int bac) {
		this.bac = bac;
	}
	@Override
	public String toString() {
		String result = super.toString();
		result += "Bac: " + bac;
		return result;
	}
}