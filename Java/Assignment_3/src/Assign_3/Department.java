package Assign_3;

public class Department {
	byte id;
	String name;
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
