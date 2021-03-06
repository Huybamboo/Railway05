package Exercise_1;

import java.util.Scanner;

public class News implements INews {
	// Tạo một class News bao gồm thuộc tính:
//	ID (int), Title (String), PublishDate (String), Author (String),
//	Content (String) và AverageRate (float). 
	private int id;
	private String Title;
	private String PublishDate;
	private String Author;
	private String Content;
	private float AverageRate;
	
	// Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.
	public News() {	
	}
	
	public News(int id, String Title, String PublishDate, String Author, String Content, float AverageRate ) {
		this.id = id ; 
		this.Title = Title;
		this.PublishDate = PublishDate;
		this.Author = Author;
		this.Content = Content;
		this.AverageRate = AverageRate;
		
	}
	
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String Content) {
		this.Content = Content;
	}
	public float AverageRate() {
		return AverageRate;
	}
// Implement các method trong interface INews như sau:
		//	a) Method Display() sẽ in ra Title, PublishDate, Author,
		//	Content và AverageRate của tin tức ra console.
		
	@Override
	public void Display() {
		System.out.println(Title + " " +  PublishDate + " " +  Author + " " + Content + " " + AverageRate);
		
	}
		//	b) Method có tên Calculate() để thiết đặt thuộc tính
		//	Khai báo một array có tên Rates kiểu int gồm 3 phần tử
		//	AverageRate là trung bình cộng của 3 phần tử của array
		//	Rates.
	@Override
	public void Calculate() {		
		Scanner rate = new Scanner(System.in);
		System.out.println("Phan tu thu nhat la: ");
		int a = rate.nextInt();
		System.out.println("Phan tu thu hai la: ");
		int b = rate.nextInt();
		System.out.println("Phan tu thu ba la: ");
		int c = rate.nextInt();
		int[] Rates = {a, b, c};
		System.out.println("nhung phan tu vua nhap la: " + Rates);
		AverageRate = (float) (a + b + c)/3;
	
	}
	@Override
	public String toString() {
		String result = "";
		result += "ID la: " + id + " Title la: " + Title + " PublishDate la: " + PublishDate + " Author" + Author + " Content la:" + Content+ " AverageRate la: " + AverageRate;
		return result;
	}

	
}
