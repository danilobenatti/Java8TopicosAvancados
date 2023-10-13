package try_catch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		File file = new File("./src_java9_new_features/try_catch/file.txt");
		try {
			TryCatchExample.readFileTryCatchFinally(file.getAbsoluteFile());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			TryCatchExample.readFileTryResource(file.getAbsoluteFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// Before java7 - "traditional way"
	public static void readFileTryCatchFinally(File file) throws IOException {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			br.close();
		}
		
	}
	
	// After java7
	public static void readFileTryResource(File file) throws IOException {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		try (br) {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		
	}
	
}
