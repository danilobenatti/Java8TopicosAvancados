package new_features;

import java.util.HashMap;

public class NullPointerExceptionEx {
	
	public static void main(String[] args) {
		
		HashMap<String, Employee> listOfEmployees = new HashMap<>();
		
		listOfEmployees.put("01A1", new Employee("Peter", "123456"));
		listOfEmployees.put("02A2", null);
		listOfEmployees.put("03A3", new Employee("Mary", "134679"));
		
		System.out.println(listOfEmployees.get("01A1").getRegistry());
		System.out.println(listOfEmployees.get("02A2").getRegistry());
		
	}
	
}

class Employee {
	
	private String registry;
	
	private String name;
	
	public Employee(String name, String registry) {
		this.name = name;
		this.registry = registry;
	}
	
	public String getRegistry() {
		return registry;
	}
	
	public void setRegistry(String registry) {
		this.registry = registry;
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
		builder.append("Employee [");
		builder.append("registry=");
		builder.append(this.registry);
		builder.append(", name=");
		builder.append(this.name);
		builder.append("]");
		return builder.toString();
	}
	
}