package lambda_expressions;

import java.util.ArrayList;
import java.util.List;

class Produto {
	
	String nome;
	Double preco;
	
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
		return "Product: " + this.nome + ", Price: " + this.preco;
	}
	
	public void printOut() {
		System.out.printf("Product: %s / Price: %.2f%n", this.nome, this.preco);
	}
}

class Printer {
	
	public static void printOut(Produto produto) {
		System.out.printf("Product: %s | Price: %.2f%n", produto.getNome(),
				produto.getPreco());
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
		produtos.forEach(p -> System.out.println(p.toString()));
		
		// Lambda Expression with two arguments. Order by price ASC
		System.out.println("--- # ---");
		produtos.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		produtos.forEach(p -> System.out.println(p.toString()));
		
		// Lambda with multiple expressions
		System.out.println("--- # ---");
		produtos.forEach(p -> {
			System.out.println(p.getNome());
			System.out.println(p.getPreco());
		});
		// Method references of class
		System.out.println("--- # ---");
		produtos.forEach(Printer::printOut);
		
		// Method references of object
		System.out.println("--- # ---");
		produtos.forEach(Produto::printOut);
		
	}
	
}
