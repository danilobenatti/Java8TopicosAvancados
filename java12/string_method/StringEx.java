package string_method;

public class StringEx {
	
	public static void main(String[] args) {
		
		String text = """
			Olá mundo!
			Este é o módulo Java 12.
			""";
		
		// add 4(four) spaces
		text = text.indent(4);
		System.out.println(text);
		
		// remove 2(two) spaces
		text = text.indent(-2);
		System.out.print(text);
		
		// reverse and upper-case text
		text = text.indent(-2).transform(
				s -> new StringBuilder(s).reverse().toString().toUpperCase());
		System.out.println(text);
		
	}
	
}
