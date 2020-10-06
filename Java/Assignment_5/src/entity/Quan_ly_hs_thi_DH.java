package entity;

public class Quan_ly_hs_thi_DH {
	protected int SBD;
	protected String name;
	protected String address;
	protected Muc_uu_tien uuTien;
	
	public Quan_ly_hs_thi_DH(int SBD, String name, String address, Muc_uu_tien uuTien) {
		this.SBD = SBD;
		this.name = name;
		this.address = address;
		this.uuTien = uuTien;
	}
	
	public int getSBD() {
		return SBD;
	}
	public void setSBD(int SBD) {
		this.SBD = SBD;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	public Muc_uu_tien getuuTien() {
		return uuTien;
	}
	public void setuuTien(Muc_uu_tien uuTien) {
		this.uuTien = uuTien;
	}
	@Override
	public String toString() {
		String result = "";
		result += "So Bao Danh la: " + SBD + " Ten hoc sinh la: " + name + " Dia chi la: " + address + " Muc uu tien la: " + uuTien;
		return result;
	}
}
