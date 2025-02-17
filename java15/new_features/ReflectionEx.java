package new_features;

import java.io.PrintWriter;
import java.lang.reflect.Field;

public class ReflectionEx {
	
	public static void main(String[] args) {
		
		PrintWriter console = new PrintWriter(System.out, true);
		
		Product product = new Product();
		
		console.println(product.getCode());
		
		try {
			Field codeAttribute = product.getClass().getDeclaredField("code");
			codeAttribute.setAccessible(true);
			codeAttribute.set(product, 654321);
			console.println(product.getCode());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			console.close();
		}
		
	}
	
}

class Product {
	
	private final Integer code = 123456;
	
	public Integer getCode() {
		return code;
	}
	
}
