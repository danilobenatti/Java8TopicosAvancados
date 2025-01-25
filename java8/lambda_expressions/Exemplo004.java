package lambda_expressions;

@FunctionalInterface
interface Picture {
	
	Circule drawing(Double radius);
	
}

class Circule {
	
	public Circule(Double radius) {
		System.out.println("Area = " + (Math.pow(radius, 2) * Math.PI));
	}
	
}

public class Exemplo004 {
	
	public static void main(String[] args) {
		
		Picture picture = Circule::new;
		
		picture.drawing(10.0);
		
	}
	
}
