package new_features;

public class NullPointerEx {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		String string = student.getName().substring(0, 1);
		
		System.out.println(string);
		
	}
	
}

class Student {
	
	private String name = null;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
