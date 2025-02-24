package new_features;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;

public class UTF8Ex {
	
	static final String BYTES = "bytes";
	
	public static void main(String[] args) {
		/**
		 * File file = new File( new
		 * String("./java18/new_features/file.txt".getBytes(),
		 * StandardCharsets.UTF_8));
		 */
		
		File file = new File("./java18/new_features/file.txt");
		
		int size = 32768; // 32768 bytes (32 Kb)
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter(file, StandardCharsets.UTF_8, true), size)) {
			bufferedWriter.write("你好世界！");
			bufferedWriter.newLine();
			bufferedWriter.append("Olá mundo!");
			bufferedWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(
				new FileReader(file, StandardCharsets.UTF_8), size)) {
			StringBuilder builder = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
				builder.append('\n');
			}
			System.out.println(builder.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(getFileSize1(file) + BYTES);
		System.out.println(getFileSize2(file) + BYTES);
		System.out.println(getFileSize3(file) + BYTES);
		System.out.println(getFileSize4(file) + BYTES);
	}
	
	private static long getFileSize1(File file) {
		return file.length();
	}
	
	private static long getFileSize2(File file) {
		Path path = Paths.get(file.getPath());
		long size = 0;
		try (FileChannel fileChannel = FileChannel.open(path)) {
			size = fileChannel.size();
		} catch (Exception e) {
			e.getStackTrace();
		}
		return size;
	}
	
	private static long getFileSize3(File file) {
		long size = 0;
		try {
			size = Files.size(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return size;
	}
	
	private static long getFileSize4(File file) {
		return FileUtils.sizeOf(file);
	}
	
}
