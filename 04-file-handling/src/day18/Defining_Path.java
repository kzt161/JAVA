package day18;

import java.nio.file.Path;
import java.nio.file.Files;

public class Defining_Path {
	
	public static void main(String[] args) {
		
		Path path1 = Path.of("user/yeewaikhaing/z2p");
		
		System.out.println("Exist: " + Files.exists(path1));
		
		Path path2 = Path.of("./src/day18/hello.txt");
		
		System.out.println("Exist: " + Files.exists(path2));
		System.out.println("Relative path: " + path2);
		System.out.println("Absolute path: " + path2.toAbsolutePath());
		
		//create file
		System.out.println("Creating file...");
		
		path1 = Path.of("./testing");
//		Files.createDirectories(path1);
		System.out.println();
		
	}
}
