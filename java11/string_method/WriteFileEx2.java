package string_method;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class WriteFileEx2 {
	
	public static void main(String[] args) {
		
		File file = new File("./java11/string_method/mytext.txt");
		String text = "Tést Test";
		
		try {
			Files.writeString(file.toPath(), text, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
