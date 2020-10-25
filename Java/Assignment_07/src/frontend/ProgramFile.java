package frontend;



import Utils.FileManager;

public class ProgramFile extends FileManager{
	public static void main(String[] args) {

		// Question 1: Check File is exists
		boolean question1 = isFileExists("C:\\Users\\pc\\Desktop\\Test.txt");
		System.out.println(question1);
		
		// Question 2: Create new file
	//	String question2 = createNewFile("path", "text");

	}

}
