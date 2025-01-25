package lambda_expressions;

interface Figure {
	
	void drawing();
	
}

interface FigConcrete {
	
	public static void drawing() {
		System.out.println("Figure3 by 'Method reference'");
	}
	
}

public class Exemplo003 {
	
	public static void main(String[] args) {
		
		// Anonymous class
		Figure f1 = new Figure() {
			@Override
			public void drawing() {
				System.out.println("Figure1 by 'Anonymous class'");
			}
		};
		f1.drawing();
		
		// Lambda expression
		Figure f2 = () -> System.out.println("Figure2 by 'Lambda expression'");
		f2.drawing();
		
		// Method reference
		Figure f3 = FigConcrete::drawing;
		f3.drawing();
		
	}
	
}
