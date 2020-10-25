package Entity;

public class StudentExercise3 <T> {
	T id ;
	String name;
	
	public StudentExercise3(T id, String name) {
		this.id = id;
		this.name = name;
	}
	public StudentExercise3() {
		
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "ID là: " + id + "\nTên là: "  + name ;
		return result;
	}
}