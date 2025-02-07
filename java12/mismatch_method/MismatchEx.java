package mismatch_method;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchEx {
	
	public static void main(String[] args) {
		
		File file1 = new File("./java12/mismatch_method/text1.txt");
		File file2 = new File("./java12/mismatch_method/text2.txt");
		
		try {
			long mismatch = Files.mismatch(file1.toPath(), file2.toPath());
			if (mismatch == -1) {
				System.out.println("The files are identical");
			} else {
				System.out.println("Different in position: " + mismatch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
