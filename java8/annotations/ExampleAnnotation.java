package annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Voltagens.class)
@interface Voltagem {
	String tensao();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens {
	Voltagem[] value();
}

@Voltagem(tensao = "110V")
@Voltagem(tensao = "220V")
class Product {
	
	long id;
	String name;
	Double price;
	
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

public class ExampleAnnotation {
	
	public static void main(String[] args) {
		
		Voltagem[] volts = Product.class.getAnnotationsByType(Voltagem.class);
		for (Voltagem voltagem : volts) {
			System.out.println(voltagem.tensao());
		}
		
	}
	
}
