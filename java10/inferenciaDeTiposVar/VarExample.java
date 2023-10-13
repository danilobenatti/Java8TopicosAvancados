package inferenciaDeTiposVar;

import java.util.List;

public class VarExample {
	
	public static void main(String[] args) {
		
		String v1 = "Java ";
		var v2 = 10;
		System.out.println(v1 + v2);
		
		var fruitList = List.of("Grape", "Pear", "Apple", "Banana", "Pinapple");
		
		for (var fruit : fruitList) {
			System.out.println(fruit);
		}
		
		for (var i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		var exception = new ArrayIndexOutOfBoundsException();
		String message = exception.getMessage();
		System.out.println(message);
	}
	
}
