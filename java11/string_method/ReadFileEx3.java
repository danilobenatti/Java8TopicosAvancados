package string_method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx3 {
	
	public static void main(String[] args) {
		
		File file = new File("./java11/string_method/mytext.txt");
		
		String s;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while ((s = reader.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
