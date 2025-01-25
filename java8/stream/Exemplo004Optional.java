package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Course {
	
	private String title;
	
	private List<Student> students;
	
	public Course(String title) {
		this.title = title;
		this.students = new ArrayList<>();
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
		this.name = name;
		this.registry = Optional.empty();
	}
	
	public Optional<Registry> getRegistry() {
		return registry;
	}
	
	public void setRegistry(Registry registry) {
		this.registry = Optional.of(registry);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [");
		builder.append("registry=");
		builder.append(this.registry.get().getCode());
		builder.append(", name=");
		builder.append(this.name);
		builder.append("]");
		return builder.toString();
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
		
		Student student1 = new Student("João Fonseca");
		student1.setRegistry(new Registry("10A20"));
		course.getStudents().add(student1);
		
		Student student2 = new Student("Ana Paula");
		student2.setRegistry(new Registry("10B10"));
		course.getStudents().add(student2);
		
		// not registered student
		Student student3 = new Student("Pedro Henrique");
		course.getStudents().add(student3);
		
		Student student4 = new Student("Paulo Guedes");
		student4.setRegistry(new Registry("10A10"));
		course.getStudents().add(student4);
		
		/**
		 * course.getStudents().forEach(System.out::println);
		 */
		
		course.getStudents().stream().filter(s -> s.getRegistry().isPresent())
				.forEach(System.out::println);
		
		course.getStudents().stream().forEach(s -> s.getRegistry()
				.ifPresent(r -> System.out.println(r.getCode())));
		
	}
}
