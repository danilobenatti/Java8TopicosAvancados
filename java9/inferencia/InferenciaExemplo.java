package inferencia;

public class InferenciaExemplo {
	
	public static void main(String[] args) {
		
		// Anonymous inner class
		SomaTudo<String> somaString = new SomaTudo<>() {
			
			@Override
			public String soma(String a, String b) {
				return a + b;
			}
		};
		
		System.out.println(somaString.soma("Olá", " Mundo!"));
		
	}
	
}
