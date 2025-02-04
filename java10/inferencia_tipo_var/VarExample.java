package inferencia_tipo_var;

import java.util.Arrays;
import java.util.List;

public class VarExample {
	
	public static void main(String[] args) {
		
		String v1 = "Java ";
		var v2 = 10;
		
		System.out.println(v1 + v2);
		
		var fruitList = List.of("Grape", "Pear", "Apple", "Banana", "Pinapple");
		
		System.out.println("<<< 1 >>>");
		for (var fruit : fruitList) {
			System.out.println(fruit);
		}
		
		System.out.println("<<< 2 >>>");
		for (var i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		System.out.println("<<< 3 >>>");
		fruitList.forEach(System.out::println);
		
		System.out.println("<<< 4 >>>");
		fruitList.stream().filter(f -> f.toUpperCase().endsWith("E"))
				.forEach(System.out::println);
		
		System.out.println("<<< 5 >>>");
		fruitList.stream().filter(f -> f.matches("(?i).*E"))
				.forEach(System.out::println);
		
		var list = Arrays.asList(fruitList.stream()
				.filter(f -> f.matches("(?i).*E")).sorted().toArray());
		System.out.println("<<< " + list + " >>>");
		
		var ex = new ArrayIndexOutOfBoundsException();
		String message = ex.getMessage();
		System.out.println(message);
	}
	
}
