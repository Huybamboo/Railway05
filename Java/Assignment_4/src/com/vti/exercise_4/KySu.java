package com.vti.exercise_4;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;
	
	public KySu() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi ban nhap nganh dao tao");
		this.nganhDaoTao = scanner.nextLine();
	}
	
	public KySu (String nganhDaoTao , String name, int tuoi, Enum_canbo gioiTinh, String address) {
		super (name,  tuoi,  gioiTinh,  address);
		this.nganhDaoTao = nganhDaoTao;
		}
	public String getnganhDaoTao() {
		return nganhDaoTao;
	}
	public void setnganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	@Override
	public String toString() {
		String result = super.toString();
		result += "nganh dao tao: " + nganhDaoTao;
		return result;
	}
}