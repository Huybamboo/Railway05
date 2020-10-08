package lesson_4;

public class Department {
	int id;
	String name;
	Department(){
		
	}
	Department(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Department(String name){ // default id = 0
		this.id = 0;
		this.name = name;
	}
	@Override
	public String toString() {
		String result = ""; 
		result = "ID:" + id;
		result = name;
		return result;
	
}
	@Override
	public boolean equals(Object obj) {
		Department otherDepartment = (Department) obj;
		if (name == otherDepartment.name) {
			return true;
			
		}
		return false;
}
	
}
