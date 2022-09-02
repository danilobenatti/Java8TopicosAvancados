package stream;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Exemplo003StringJoiner {
	
	public static void main(String[] args) {
		
		String names = "João,José,Maria,Ana,Paulo,Matheus";
		
		StringTokenizer tokenizer = new StringTokenizer(names, ",");
		
		while (tokenizer.hasMoreElements()) {
			Object object = tokenizer.nextElement();
			System.out.println(object);
		}
		
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("João");
		joiner.add("José");
		joiner.add("Maria");
		joiner.add("Ana");
		joiner.add("Paulo");
		joiner.add("Matheus");
		
		System.out.printf("%n--- # ---%n%s", joiner);
		
	}
	
}
