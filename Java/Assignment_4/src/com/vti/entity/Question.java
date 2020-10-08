package com.vti.entity;

import java.time.LocalDate;

public class Question {
	short questionID;
	String Content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate createDate;
	
	public short getQuestionID() {
		return questionID;
	}
	public void setQuestionID(short questionID) {
		this.questionID = questionID;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public CategoryQuestion getCategory() {
		return category;
	}
	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}
	public TypeQuestion getType() {
		return type;
	}
	public void setType(TypeQuestion type) {
		this.type = type;
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
