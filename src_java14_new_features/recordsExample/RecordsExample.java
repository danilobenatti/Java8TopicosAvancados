package recordsExample;

interface Figure2D {
}

record Rectangle(double width, double height) implements Figure2D {
	public static void area(double width, double height) {
		System.out.println("Area: " + width * height);
	}
}

public class RecordsExample {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(300.0, 200.0);
		
		double width = rectangle.width();
		System.out.println(width);
		double height = rectangle.height();
		System.out.println(height);
		
		rectangle.area(width, height);
	}
	
}
