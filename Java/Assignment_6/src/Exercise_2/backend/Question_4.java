package Exercise_2.backend;

public class Question_4 {
	public static void main(String[] args) {
		try {
			String[] departments = {"department_1" , "department_2", "department_3"};
			System.out.println(departments[2]);
		} catch (Exception e) {
			System.out.println("Cannot find department.Please try again");
		} finally {
			System.out.println("Đã tìm department");
		}
		
	}
	// Question 4:
		//	Tạo 1 array departments gồm 3 phần tử
		//	Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ
		//	index trong array departments. Nếu index vượt quá length lấy ra thì sẽ
		//	in ra text "Cannot find department."
		
		
		
	public static String departments(String a, String b , String c) {

			return a; 
		}

}