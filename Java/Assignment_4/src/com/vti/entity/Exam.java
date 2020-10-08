package com.vti.entity;

import java.time.LocalDate;


public class Exam {
	byte examID;
	short code;
	String title;
	CategoryQuestion category;
	String duration;
	Account creator;
	LocalDate createDate;
	public byte getExamID() {
		return examID;
	}
	public void setExamID(byte examID) {
		this.examID = examID;
	}
	public short getCode() {
		return code;
	}
	public void setCode(short code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CategoryQuestion getCategory() {
		return category;
	}
	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	
}
