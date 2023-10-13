package factoryMethod;

import java.util.List;
import java.util.Set;

public class FactoryMethodExample {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("Grape", "Apple", "Pear", "Pineapple");
		for (String string : list) {
			System.out.print(string + ", ");
		}
		
		System.out.printf("%n--- # ---%n");
		
		Set<String> set = Set.of("Grape", "Pear", "Apple", "Orange", "Banana");
		for (String string : set) {
			System.out.print(string + ", ");
		}
	}
	
}
