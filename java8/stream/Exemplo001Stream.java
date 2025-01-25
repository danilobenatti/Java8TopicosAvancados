package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=").append(name)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}
	
}

class ProductOrderByPrice implements Comparator<Product> {
	
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}
	
}

class PrintProducts {
	
	private PrintProducts() {
	}
	
	public static void print(List<Product> list) {
		if (!list.isEmpty()) {
			list.forEach(p -> System.out.println(p.toString()));
		} else {
			System.out.println("Lista de produtos vazia.");
		}
	}
	
}

public class Exemplo001Stream {
	
	public static void main(String[] args) {
		
		// Products list.
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Geladeira 350L", 3500.00));
		productList.add(new Product(2, "Micro-ondas 10L", 980.00));
		productList.add(new Product(3, "Liquidificador Turbo Slice", 545.50));
		productList.add(new Product(4, "Geladeira 550L", 5025.50));
		productList.add(new Product(5, "Fogão Master Chef 5 bocas", 2346.72));
		productList.add(new Product(6, "TV OLed 55\" Smart", 5050.50));
		productList.add(new Product(7, "Geladeira Frigobar", 2000.50));
		
		// Refrigerators list.
		List<Product> refrigeratorList = new ArrayList<>();
		for (Product product : productList) {
			if (product.getName().toUpperCase()
					.contains(("Geladeira").toUpperCase())) {
				refrigeratorList.add(product);
			}
		}
		
		// Oder list by 'price'.
		Collections.sort(refrigeratorList, new ProductOrderByPrice());
		
		// Create list of refrigerator by 'NAME'.
		List<String> refrigeratorListByName = new ArrayList<>();
		for (Product product : refrigeratorList) {
			refrigeratorListByName.add(product.getName().toUpperCase());
		}
		
		// Show refrigerator names.
		System.out.println("--- #1 ---");
		for (String string : refrigeratorListByName) {
			System.out.println(string);
		}
		
		// Lambda + Stream [pipeline process]
		System.out.println("--- #2 ---");
		productList.stream()
				.filter(p -> p.getName().toLowerCase().contains("Geladeira"))
				.sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
				.map(p -> p.getName().toUpperCase())
				.forEach(System.out::println);
		
		System.out.println("--- #3 ---");
		productList.stream()
				.takeWhile(p -> p.getName().toLowerCase().contains("geladeira"))
				.sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
				.map(p -> p.getName().toUpperCase())
				.forEach(System.out::println);
		
		System.out.println("--- #4 ---");
		productList.stream()
				.dropWhile(p -> p.getName().toLowerCase().contains("geladeira"))
				.sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()))
				.map(p -> p.getName().toUpperCase())
				.forEach(System.out::println);
		
		System.out.println("--- #5 ---");
		PrintProducts.print(productList);
		System.out.println("--- #6 ---");
		PrintProducts.print(new ArrayList<>());
		
	}
}
