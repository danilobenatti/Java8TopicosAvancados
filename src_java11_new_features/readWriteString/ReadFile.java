package readWriteString;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) {
		
		String path = "./src_java11_new_features/readWriteString/texto.txt";
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Qual código executar:(1,2 ou 3)? ");
			
			switch (input.nextInt()) {
			case 1:
				System.out.println("Exemplo 1");
				/*
				 * Lê de fluxos de caracteres(string). Maneira mais simples até
				 * então. Indicado para poucas operações de leitura.
				 */
				try (FileReader fileReader = new FileReader(path)) {
					int i;
					while ((i = fileReader.read()) != -1) { // -1 = EOF
						System.out.print((char) i);
					}
				} catch (IOException ex) {
					ex.getMessage();
				}
				break;
			case 2:
				System.out.println("Exemplo 2");
				/*
				 * Lê o texto em uma stream de entrada, usando mecanismo de
				 * buffer para leitura mais eficiente de caracteres.
				 */
				try (BufferedReader br = new BufferedReader(
						new FileReader(path))) {
					String s;
					while ((s = br.readLine()) != null) { // null = EOF
						System.out.print(s);
					}
				} catch (IOException ex) {
					ex.getMessage();
				}
				break;
			case 3:
				System.out.println("Exemplo 3");
				String s;
				try {
					s = Files.readString(new File(path).toPath(),
							StandardCharsets.UTF_8);
					System.out.println(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Nenhum código selecionado!");
				break;
			}
			
		}
		
	}
	
}
