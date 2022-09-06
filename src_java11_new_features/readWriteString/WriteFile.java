package readWriteString;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class WriteFile {
	
	public static void main(String[] args) {
		
		String path = "./src_java11_new_features/readWriteString/texto.txt";
		String mytext = "Curso Java Tópicos Avançados";
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Qual código executar:(1,2 ou 3)? ");
			
			switch (input.nextInt()) {
			case 1:
				System.out.println("Exemplo 1");
				/*
				 * Escreve fluxos de caracteres (String) em arquivo. Maneira
				 * simples até então. Indicado para poucas operações de escrita.
				 */
				try (FileWriter fileWriter = new FileWriter(path)) {
					fileWriter.write(mytext);
				} catch (IOException ex) {
					ex.getMessage();
				}
				break;
			case 2:
				System.out.println("Exemplo 2");
				/*
				 * Grava o texto em uma stream de saída, usando mecanismo de
				 * buffer para gravação mais eficiente de caracteres.
				 */
				try (BufferedWriter bw = new BufferedWriter(
						new FileWriter(path))) {
					bw.write(mytext);
				} catch (IOException ex) {
					ex.getMessage();
				}
				break;
			case 3:
				System.out.println("Exemplo 3");
				
				try {
					Files.writeString(new File(path).toPath(), mytext,
							StandardCharsets.UTF_8);
				} catch (IOException ex) {
					ex.getMessage();
				}
				break;
			default:
				System.out.println("Nenhum código selecionado!");
				break;
			}
			
		}
		
	}
	
}
