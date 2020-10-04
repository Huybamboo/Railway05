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
}
