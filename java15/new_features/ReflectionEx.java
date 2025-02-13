package new_features;

import java.lang.reflect.Field;

public class ReflectionEx {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		System.out.println(product.getCode());
		
		try {
			Field attribute = product.getClass().getDeclaredField("code");
			attribute.setAccessible(true);
			attribute.set(product, 654321);
			System.out.println(product.getCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

class Product {
	
	private final Integer code = 123456;
	
	public Integer getCode() {
		return code;
	}
	
}
