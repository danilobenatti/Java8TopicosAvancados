package string_method;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileEx {
	
	public static void main(String[] args) {
		
		File file = new File("./java11/string_method/mytext.txt");
		String text = null;
		
		int i = 1;
		switch (i) {
			case 1:
				text = "Test1 Test1";
				example1(file, text);
				break;
			case 2:
				text = "Test2 Test2";
				example2(file, text);
				break;
			default:
				break;
		}
		
	}
	
	private static void example1(File file, String text) {
		try (FileWriter writer = new FileWriter(file)) {
			writer.write(text);
			System.out.println("Writed file, example 1");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void example2(File file, String text) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(text);
			System.out.println("Writed file, example 2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
