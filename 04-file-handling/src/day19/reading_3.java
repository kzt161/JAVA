package day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class reading_3 {
	
	public static void main(String[] args) throws IOException {
		
		//define location
		Path path = Path.of("src/day19/employee.txt");
		
		//read
		List<String> lines = Files.readAllLines(path);
		
		//convert line to obj
		List<Employee> empList = lines.stream()
										.map(Employee::convertLineToObject)
										.toList();
		empList.forEach(emp -> {
			System.out.println("ID: " + emp.getId());
			System.out.println("Name: " + emp.getName());
			System.out.println("City: " + emp.getCity());
			System.out.println("--------x-------");
		});
	}
}
