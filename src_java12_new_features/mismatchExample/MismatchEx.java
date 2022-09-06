package mismatchExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchEx {
	
	public static void main(String[] args) {
		
		File file1 = new File(
				"./src_java12_new_features/mismatchExample/text1.txt");
		File file2 = new File(
				"./src_java12_new_features/mismatchExample/text2.txt");
		try {
			long result = Files.mismatch(file1.toPath(), file2.toPath());
			if (result == -1) {
				System.out.println("Arquivos são idênticos: " + result);
			} else {
				System.out.println(" Arquivos são diferentes: : " + result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
