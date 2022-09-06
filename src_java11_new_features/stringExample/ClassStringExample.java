package stringExample;

import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ClassStringExample {
	
	public static void main(String[] args) {
		
		var nome1 = "   ";
		var nome2 = "";
		var nome3 = "Java11\n342\nbeta";
		var nome4 = "Java11 342 beta";
		
		System.out.println(nome1.isBlank());
		
		System.out.println(nome2.isBlank());
		
		System.out.println(nome3.isBlank());
		
		System.out.println(nome3.lines().collect(Collectors.toList()));
		
		System.out.println(nome4.repeat(3));
		
		var x = 100;
		System.out.println(x);
		
		/**
		 * Function<String, String> concatena = (var s) -> s + ". ";
		 **/
		@SuppressWarnings("unused")
		UnaryOperator<String> concatena = (var s) -> s + ". ";
		
	}
	
}
