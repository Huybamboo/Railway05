package com.vti.exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class QLCB {

	private List<CanBo> canBos;
	private Scanner scanner;

	public QLCB() {
		canBos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}

	public QLCB(List<CanBo> canBos) {
		this.canBos = canBos;
	}

	public void addCanBo() {
		System.out.print("Bạn muốn add bao nhiêu cán bộ: ");
		int x = scanner.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.print("Bạn muốn nhập vào nhân viên(nhập vào 1), Công nhân (nhập vào 2), kỹ sư (nhập vào 3): ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				canBos.add(new NhanVien(null, "Nguyen van A", 15, null, null));
				break;
			case 2:
				canBos.add(new CongNhan());
				break;
			case 3:
				canBos.add(new KySu(null, "Nguyen B", 13, null, null));
				break;
			}
			System.out.println("Nhập thành Cán bộ " + (i + 1));
		}
	}

	public void findByName() {
		// TODO
		System.out.println("findByName");
	}

	public void printListCanBo() {
		for (int i = 0; i < canBos.size(); i++) {
			System.out.println("Thông tin cán bộ " + (i + 1) + " là: ");
		}
		System.out.println("----------------------------");
	}

	public void deleteCanBo(String name) {
		// TODO
		System.out.println("deleteCanBo");
	}

	public void deleteCanBo() {

		String inputName = scanner.nextLine();
		deleteCanBo(inputName);
	}
}
