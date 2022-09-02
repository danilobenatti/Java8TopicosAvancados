package lambda_expressions;

interface Imagem {
	
	void converte();
	
}

public class Exemplo001 {
	
	public static void main(String[] args) {
		
		Imagem imagem1 = new Imagem() {
			
			@Override
			public void converte() {
				System.out.println("Convert drawing 1!");
			}
		};
		
		imagem1.converte();
		
		Imagem imagem2 = () -> System.out.println("Convert drawing 2!");
		imagem2.converte();
		
	}
	
}
