package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Exemplo003StringJoiner {
	
	public static void main(String[] args) {
		
		String names = " João;  José; Maria; Ana Paula;Paulo Guedes;  Matheus";
		
		StringTokenizer tokenizer = new StringTokenizer(names, ";");
		
		List<String> list = new ArrayList<>();
		
		while (tokenizer.hasMoreElements()) {
			Object object = tokenizer.nextElement();
			list.add(object.toString().trim());
		}
		System.out.println(list);
		
		StringJoiner joiner = new StringJoiner(";");
		
		list.forEach(joiner::add);
		
		System.out.printf("%n--- # ---%n%s", joiner);
		
	}
	
}
