package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Course {
	
	private String title;
	
	private List<Student> students;
	
	public Course(String title) {
		this.setTitle(title);
		this.setStudents(new ArrayList<>());
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}

class Student {
	
	private Optional<Registry> registry;
	
	private String name;
	
	public Student(String name) {
		this.setName(name);
		this.registry = Optional.empty();
	}
	
	public Optional<Registry> getRegistry() {
		return registry;
	}
	
	public void setRegistry(Optional<Registry> registry) {
		this.registry = registry;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

class Registry {
	
	private String code;
	
	public Registry(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
}

public class Exemplo004Optional {
	
	public static void main(String[] args) {
		
		Course course = new Course(null);
		course.setTitle("Administração");
		
		Student student1 = new Student("João");
		student1.setRegistry(Optional.of(new Registry("10A20")));
		course.getStudents().add(student1);
		
		Student student2 = new Student("Maria");
		student2.setRegistry(Optional.of(new Registry("10B10")));
		course.getStudents().add(student2);
		
		Student student3 = new Student("Pedro");
		course.getStudents().add(student3);
		
		Student student4 = new Student("Paulo");
		student4.setRegistry(Optional.of(new Registry("10A10")));
		course.getStudents().add(student4);
		
		course.getStudents().stream().filter(t -> t.getRegistry().isPresent())
				.forEach(t -> System.out.println(
						t.getName() + ", " + t.getRegistry().get().getCode()));
	}
}
