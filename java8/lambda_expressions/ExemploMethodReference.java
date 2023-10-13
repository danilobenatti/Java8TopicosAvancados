package lambda_expressions;

@FunctionalInterface
interface Image2D {
	
	void show(Double height, Double width);
	
}

class Rectangle2D {
	
	public void size(Double a, Double b) {
		System.out.printf("Dimension: height %.2f, width %.2f%n", a, b);
	}
	
}

public class ExemploMethodReference {
	
	public static void main(String[] args) {
		
		// Lambda Expression example
		Image2D img = (h, w) -> System.out.printf("Ht: %.2f, Wh: %.2f%n", h, w);
		img.show(5.0, 10.0);
		
		// Object
		Rectangle2D rectangle2d = new Rectangle2D();
		// Method reference
		Image2D image = rectangle2d::size;
		image.show(5.256, 10.998);
		
	}
	
}
