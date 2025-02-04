package string_method;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
	
	public static void main(String[] args) {
		
		File file = new File("./java11/string_method/mytext.txt");
		
		int i;
		
		try (FileReader reader = new FileReader(file)) {
			while ((i = reader.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
