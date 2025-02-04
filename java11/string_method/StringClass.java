package string_method;

import java.util.function.UnaryOperator;

public class StringClass {
	
	public static void main(String[] args) {
		
		String str1 = "";
		String str2 = "   ";
		String str3 = "Java\n11";
		String str4 = "Java Advanced Topics";
		
		System.out.println(str3.lines().toList());
		
		System.out.println(str4.concat("\s").repeat(3));
		
		/**
		 * Function<String, String> concatStrings = (var s) -> s.concat(".");
		 */
		UnaryOperator<String> concatStrings = (var s) -> s.concat(".");
		System.out.println(concatStrings.apply(str4));
		
		boolean blank1 = str1.isBlank();
		boolean blank2 = str2.isBlank();
		boolean blank3 = str3.isBlank();
		
		System.out.println(blank1);
		System.out.println(blank2);
		System.out.println(blank3);
		
		boolean empty1 = str1.isEmpty();
		boolean empty2 = str2.isEmpty();
		boolean empty3 = str3.isEmpty();
		
		System.out.println(empty1);
		System.out.println(empty2);
		System.out.println(empty3);
		
	}
	
}
