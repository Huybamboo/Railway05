package Exercise_1;

import java.util.Scanner;

public class TuyenSinh extends Quan_ly_hs_thi_DH implements ITuyenSinh{
	Khoi_Thi Khoi;
	public TuyenSinh(Khoi_Thi Khoi, int SBD, String name, String address, Muc_uu_tien uuTien){
		super(SBD, name, address, uuTien);
	this.Khoi = Khoi;
	}
	public Khoi_Thi getKhoi() {
		return Khoi;
	}
	public void setKhoi(Khoi_Thi Khoi) {
		this.Khoi = Khoi;
	}

	@Override
	public void addHS() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Khoi thi (A, B , C): ");
		scanner.nextLine();
		String Khoi = scanner.nextLine();
		this.Khoi = Khoi_Thi.valueOf(Khoi);
		System.out.println("SBD cua hssv can them");
		int SBD  = scanner.nextInt();
		System.out.println("ten cua hssv can them");
		String name = scanner.nextLine();
		System.out.println("dia chi cua hssv can them");
		String address = scanner.nextLine();
		System.out.println("muc uu tien cua hssv can them(tu Muc_1 - Muc_3)");
		scanner.nextLine(); 					// convert String sang enum
		String uuTien = scanner.nextLine();
		this.uuTien = Muc_uu_tien.valueOf(uuTien);
		System.out.println("thong tin sv vua nhap la: " + Khoi + " " + SBD + " " + name + " " + address + " " + uuTien);
		// TuyenSinh[] addx = {SBD, name, address, uuTien};
		// System.out.println(addx);
		
	}

	@Override
	public void show_info() {
		System.out.println("thong tin sv la: " + SBD + " " + name + " " + address + " " + uuTien + " va khoi thi la:" + Khoi );
		
		
	}

	@Override
	public void search() {
		
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String result = super.toString();
		result += " Khoi" + Khoi;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
