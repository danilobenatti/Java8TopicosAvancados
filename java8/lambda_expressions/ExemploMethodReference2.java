package lambda_expressions;

interface Image {
	
	void drawing(Double height, Double width);
	
}

class Rectangle {
	
	public Rectangle(Double a, Double b) {
		System.out.printf("Dimension: height %.2f, width %.2f%n", a, b);
	}
	
}

public class ExemploMethodReference2 {
	
	public static void main(String[] args) {
		
		Image image = Rectangle::new;
		image.drawing(5.666, 6.777);
		
	}
	
}
