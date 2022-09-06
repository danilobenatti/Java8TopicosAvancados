package stringExample;

public class StringExample {
	
	public static void main(String[] args) {
		
		String text = "Hello World!\nWelcome to Java 12";
		
		// add 4 whitespace
		text = text.indent(4);
		System.out.println(text);
		
		// remove 1 whitespace
		text = text.indent(-1);
		System.out.println(text);
		
		String stringReverse = text
				.transform(s -> new StringBuilder(s).reverse().toString());
		System.out.println(stringReverse);
		
	}
	
}
