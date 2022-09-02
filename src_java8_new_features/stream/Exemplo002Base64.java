package stream;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Exemplo002Base64 {
	
	public static void main(String[] args) {
		
		String text = "The Base64 class in Java 8";
		
		String encodeToString = Base64.getEncoder()
				.encodeToString(text.getBytes(StandardCharsets.UTF_8));
		System.out.println(encodeToString);
		
		System.out.println("--- # ---");
		
		byte[] decode = Base64.getDecoder().decode(encodeToString);
		String string = new String(decode, StandardCharsets.UTF_8);
		System.out.println(string);
	}
	
}
