package nullPointExceptionsExample;

class Student {
	
	private String name = null;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
	}
	
}

public class NullPointExceptionsExample {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.getName().substring(0, 1);
		
	}
	
}
