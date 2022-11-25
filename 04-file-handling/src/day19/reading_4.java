package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class reading_4 {
	
	public static void main(String[] args) throws IOException {
		
		//readAllBytes();
//		readString();
		readWithBufferedReader();
		
	}
	private static void readWithBufferedReader() {
		Path path = Path.of("src/day19/employee.txt");
		try(BufferedReader reader = Files.newBufferedReader(path)) {
			List<String> list = reader.lines()
										.filter(line -> line.contains("aung"))
										.toList();
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void readString() throws IOException {
		
		Path path = Path.of("src/day19/employee");
		String data = Files.readString(path);
		System.out.println(data);
		
	}
	private static void readAllBytes() throws IOException{
		Path path= Path.of("src/day19/employee.txt");
		
		byte[] byteArr = Files.readAllBytes(path); 
		
		for( var value: byteArr) {
//			String tmp = String.valueOf(value);
			System.out.println(value);
		}
		System.out.println("Data => " + new String(byteArr));
	}
	
}
