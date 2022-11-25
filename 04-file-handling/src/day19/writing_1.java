package day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class writing_1 {
	
	public static void main(String[] args) throws IOException {
		
		//write_1();
//		write_2();
		write_3();
	}

	private static void write_3() {
		Path path = Path.of("src/day19/tester.text");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path)){
			
			writer.write("Java programming");
			writer.write("\n Php");
			writer.write("\n Javascript");
			writer.newLine();
			writer.write("Python");
			
			System.out.println("saved data...");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void write_2() throws IOException {
		Path path = Path.of("src/day19/employee.txt");
		
//		Files.writeString(path, "Hlaing", StandardOpenOption.APPEND);
		Files.writeString(path, "Hlaing", StandardOpenOption.CREATE_NEW);
		System.out.println("saved data...");
		
	}

	private static void write_1() throws IOException {
		Path path = Path.of("src/day19/employee.txt");
		List<String> list = List.of("yangon", "mandalay", "naypyitaw");
		
		//write
		Files.write(path, list);
		Files.write(path, "Insein".getBytes(), StandardOpenOption.APPEND);
		System.out.println("save data...");
		
	}
}
