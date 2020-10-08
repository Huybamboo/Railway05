package entity;

import java.time.LocalDate;

public class Person {
// Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa
	//	chỉ với đầy đủ getter setter, constructor không tham số, constructor đầy
	//	đủ tham số
	protected String name;
	protected Gioi_tinh gender;
	protected LocalDate birthDate;
	protected String address;
	
	public Person() {
		}
	
	public Person(String name, Gioi_tinh gender, LocalDate birthDate, String address) {
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Gioi_tinh getgender() {
		return gender;
	}
	public void setgender(Gioi_tinh gender) {
		this.gender = gender;
	}
	public LocalDate getbirthDate() {
		return birthDate;
	}
	public void setbirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getaddress() {
		return  address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	@Override
		public String toString() {
			String result = "";
			result += "Ten la: " + name + " dia chi la: " + address + " gioi tinh la: " + gender + " ngay sinh " + birthDate;
			return result;
		}
}
