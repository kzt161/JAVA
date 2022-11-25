package day19;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class reading_2 {
	
	public static void main(String[] args) {
		
		Path path = Path.of("src/day19/employee.txt");
		
		try(BufferedReader reader = Files.newBufferedReader(path)){
			
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e){
			
		}
	}
}
