package lambda_expressions;

interface Image {
	
	void drawing(Double height, Double width);
	
}

interface Square {
	
	void size(Double l);
	
}

class Rectangle {
	
	public void size(Double a, Double b) {
		System.out.printf("Rectangle: height %.2f; width %.2f%n", a, b);
	}
	
}

class Area {
	
	public void value(Double x) {
		System.out.printf("Square area: %.2f", Math.pow(x, 2));
	}
	
}

public class ExemploMethodReference2 {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		Image image = rec::size;
		image.drawing(5.666, 6.777);
		
		Area area = new Area();
		
		Square square = area::value;
		square.size(5.666);
		
	}
}
