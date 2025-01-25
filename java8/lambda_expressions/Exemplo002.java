package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

class Produto {
	
	private String nome;
	
	private Double preco;
	
	public Produto(String name, Double price) {
		this.nome = name;
		this.preco = price;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Product: " + getNome() + ", Price: " + getPreco();
	}
	
	public void printOut() {
		System.out.printf("Product: %s / Price: %.2f%n", getNome(), getPreco());
	}
}

class Printer {
	
	private Printer() {
	}
	
	public static void printOut(Produto produto) {
		System.out.printf("Product: %s | Price: %.2f%n", produto.getNome(),
				produto.getPreco());
	}
}

class PrintProducts {
	
	public static void print(List<Produto> products) {
		if (!products.isEmpty()) {
			products.forEach(System.out::println);
		} else {
			System.out.println("Empty list!");
		}
	}
	
}

public class Exemplo002 {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Geladeira 350L", 3500.00));
		produtos.add(new Produto("Micro-ondas 10L", 980.00));
		produtos.add(new Produto("Liquidificador Turbo Slice", 545.50));
		produtos.add(new Produto("Fogão Master Chef 5 bocas", 2346.72));
		produtos.add(new Produto("TV OLed 55\" Smart", 5050.50));
		
		// Lambda Expression with one argument.
		System.out.println("--- #1 ---");
		produtos.forEach(p -> System.out.println(p.toString()));
		
		// Lambda Expression with two arguments. Order by price ASC
		System.out.println("--- #2 ---");
		produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		produtos.forEach(p -> System.out.println(p.toString()));
		
		// Order by price DESC
		System.out.println("--- #3 reversed ---");
		produtos.sort((p1, p2) -> p2.getPreco().compareTo(p1.getPreco()));
		produtos.forEach(System.out::println);
		
		// Lambda with multiple expressions
		System.out.println("--- #4 ---");
		produtos.forEach(p -> {
			System.out.print(String.format("Product: %s, ", p.getNome()));
			System.out.println(String.format("Price: %.2f", p.getPreco()));
		});
		
		// Method references of class
		System.out.println("--- #5 ---");
		produtos.forEach(Printer::printOut);
		
		// Method references of object
		System.out.println("--- #6 ---");
		produtos.forEach(Produto::printOut);
		
		// List<> example
		System.out.println("--- #7 ---");
		PrintProducts.print(produtos);
		System.out.println("--- #7 empty list ---");
		PrintProducts.print(new ArrayList<>());
		
	}
	
}
