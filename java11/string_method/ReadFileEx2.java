package string_method;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ReadFileEx2 {
	
	public static void main(String[] args) {
		
		File file = new File("./java11/string_method/mytext.txt");
		
		try {
			String s = Files.readString(file.toPath(), StandardCharsets.UTF_8);
			System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
