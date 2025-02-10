package new_features;

public class RecordsEx {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(200.0, 300.0);
		
		System.out.println(rectangle.heigth());
		System.out.println(rectangle.width());
		rectangle.info();
		
	}
	
}

record Rectangle(double heigth, double width) implements Figure2D {
	
	public void info() {
		double area = heigth * width;
		System.out.println("I'm a rectangle!, my area is " + area);
		
	}
	
}

interface Figure2D {
	
}