package reflect_method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Product {
	
	private long id;
	
	private String name;
	
	private Double price;
	
	public Product() {
		this.id = 0;
		this.name = "";
		this.price = 0.0;
	}
	
	public Product(long id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id = " + id + ", name = " + name + ", price = " + price
			+ "]";
	}
	
}

public class ExampleReflection {
	
	public static void main(String[] args) {
		
		// Class Instance product
		Product p = new Product(1, "Refrigerador Frost-Free", 3500.00);
		System.out.println(p);
		
		// Class Instance for Class
		Class<?> c = p.getClass();
		
		// All existing methods into product class
		Method[] declaredMethods = c.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.printf("%n%s", method.getName());
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.printf("(%s)%n", parameter);
			}
		}
		
		// All existing fields into product class
		Field[] declaredFields = c.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.printf("%n%s(%s)", field.getName(), field.getType());
		}
		
	}
	
}
