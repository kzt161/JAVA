package day17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import day16.Employee;

public class Grouping {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 6000, "Monywa")
				);
		
		//count by city
		Map<String, Long> counting = empList.stream()
											.collect(Collectors.groupingBy(
													emp -> emp.getCity(), //key
													Collectors.counting() //value
													));
		System.out.println("Counting: " + counting);
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		
		//total salary by each city(sum)
		Map<String, Integer> sum = empList.stream()
											.collect(Collectors.groupingBy(
													emp -> emp.getCity(),
													Collectors.summingInt(emp ->  emp.getSalary())
													));
		System.out.println("Total salary in each city: " + sum);
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		//avg salary in each city
		Map<String, Double> avg = empList.stream()
										.collect(Collectors.groupingBy(
												emp -> emp.getCity(),
												Collectors.averagingDouble(emp -> emp.getSalary())
												));
		System.out.println("Average salary in each city: " + avg);
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		//employee in each salary
		Map<Integer, List<Employee>> salary = empList.stream()
													.collect(Collectors.groupingBy(
															emp -> emp.getSalary()
															));
		System.out.println("------Employee in each salary------");
		salary.forEach((k, v) -> {
			System.out.println(k + "ks.");
			v.forEach(emp -> {
				System.out.printf("\t %s(%s)\n", emp.getName(), emp.getCity());
			});
		});
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		//Employee names in each city
		Map<String, List<String>> names = empList.stream()
												.collect(Collectors.groupingBy(
														emp -> emp.getCity(), //key
														Collectors.mapping(emp -> emp.getName(), //obj -> string
																Collectors.toList())
														));
		System.out.println("----Employee names in each city-----");
		names.forEach((k, v) -> {
			System.out.println(k);
			System.out.println("\t" + v);
			System.out.println("---------");
		});
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");
		
		//employee in same city
		Map<String, List<Employee>> employee = empList.stream()
												.collect(
														Collectors.collectingAndThen(
																Collectors.groupingBy(emp -> emp.getCity()),
																map -> map.entrySet()//Map<City, List<Employee>>
																		.stream()
																		.filter(value -> value.getValue().size() > 1)
																		.collect(Collectors.toMap(
																				value -> value.getKey(), //city(key)
																				value -> value.getValue() //List<employee> (value)
																				))
																));
		System.out.println("-------Employee names who stay in same city-----");
		employee.forEach((k, v) -> {
			System.out.println(k);
			v.forEach(obj -> {
				System.out.println("\t" + obj.getName());
			});
		});								
	}
}
