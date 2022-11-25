package day16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 6000, "Monywa")
				);
		
		List<String> cities = empList.stream()
									 .map(obj -> obj.getCity())
									 .distinct()
									 .collect(Collectors.toList());
		
		System.out.println("cities: " + cities);
		
		//salaries
		int[] salaries = empList.stream()
							.filter(obj -> obj.getSalary() > 6000)
							.mapToInt(obj -> obj.getSalary())
							.toArray();
		System.out.println("Salaries: " + Arrays.toString(salaries));
		
		//salary list
		List<Integer> salaryList = empList.stream()
										.map(obj -> obj.getSalary())
										.filter(val -> val < 10000)
										.toList();
		System.out.println("salaries under 10k: " + salaryList);
		
		//max salary
		int maxSalary = empList.stream()
							.mapToInt(emp -> emp.getSalary())
							.max()
							.getAsInt();
		System.out.println("max salary: " + maxSalary);
		
		//min salary
		int minSalary = empList.stream()
							.mapToInt(emp -> emp.getSalary())
							.min()
							.getAsInt();
		System.out.println("min salary: " + minSalary);
	}
}
