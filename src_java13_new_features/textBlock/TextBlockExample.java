package textBlock;

public class TextBlockExample {
	
	public static void main(String[] args) {
		
		String text1 = "Hello world!\n" + "This module is\n" + "Java 13\n";
		System.out.println(text1);
		
		// ============= with java 13 =============
		String text2 = """
			Hello world!
			This module is
			Java 13
			""";
		System.out.println(text2);
	}
	
}
