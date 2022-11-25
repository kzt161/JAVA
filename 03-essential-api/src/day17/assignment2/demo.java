package day17.assignment2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class demo {
		
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Htet Htet", "Yangon", 	  "Electronics", 900_000, LocalDate.of(1991, 10, 16));
		Employee emp2 = new Employee("Cherry",	  "Yangon", 	  "Electronics", 820_000, LocalDate.of(1991, 10, 16));
		Employee emp3 = new Employee("Kyaw Kyaw", "Yangon", 	  "Electronics", 780_000, LocalDate.of(1991, 10, 16));
		Employee emp4 = new Employee("Aung Aung", "Mandalay",     "IT",			 600_000, LocalDate.of(1991, 10, 16));
		Employee emp5 = new Employee("Jeon", 	  "Mandalay",     "IT",			 600_000, LocalDate.of(1991, 10, 16));
		Employee emp6 = new Employee("Hsu Hsu",   "Pyin Oo Lwin", "IT", 		 920_000, LocalDate.of(1991, 10, 16));
		Employee emp7 = new Employee("Aye Aye",   "Yangon", 	  "HR", 	 	 500_000, LocalDate.of(1991, 10, 16));
		Employee emp8 = new Employee("Gay Gay",   "Taung Gyi",    "HR", 	 	 400_000, LocalDate.of(1991, 10, 16));
		Employee emp9 = new Employee("Phway Phway", "Monywa", 	  "HR",			 300_000, LocalDate.of(1991, 10, 16));
		Employee emp10 = new Employee("Ko Ko",    "Monywa", 	  "IT", 		 500_000, LocalDate.of(1991, 10, 16));
		
		List<Employee> empList = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
		
		//1
		int min = empList.stream()
							.mapToInt( sal -> sal.getSalary()).min()
							.getAsInt();
		System.out.println("---Minimum salary of employees---");
		System.out.println("=================================");
		System.out.println(min);
		System.out.println("\n");
		
		//2  (youngest)
		List<Employee> sorting = empList.stream()
										.sorted(Comparator.comparing(Employee::getBirthday).reversed())
										.limit(1)
										.collect(Collectors.toList());
		System.out.println("---The youngest employee's information---");
		System.out.println("=========================================");
		System.out.println(sorting);
		System.out.println("\n");
		
		//3 count of emp whose bd is >+ 1995-2-12
		LocalDate bd = LocalDate.of(1995, 02, 12);
		long count = empList.stream()
				.filter( b -> (b.getBirthday().equals(bd)) || b.getBirthday().isBefore(bd))
				.count();
		System.out.println("---Count of employees whose birthday is greater than or equal '1995-2-12'--- ");
		System.out.println("=============================================================================");
		System.out.println("Count: " + count);
		System.out.println("\n");
		
		//4 total salary
		int total = empList.stream()
							.mapToInt( sal -> sal.getSalary())
							.sum();
		System.out.println("---Total Salary of all employees---");
		System.out.println("===================================");
		System.out.println("Total salary: " + total);
		System.out.println("\n");
		
		//5 three max salaries
		List<Employee> maxThree = empList.stream()
										.sorted(Comparator.comparing(Employee::getSalary).reversed())
										.limit(3)
										.collect(Collectors.toList());
		System.out.println("---Three Maximum salaries---");
		System.out.println("============================");
		//System.out.println(maxThree);
		maxThree.forEach( e -> System.out.println(e.getSalary()));
		System.out.println("\n");
		
		//6 avg salary of HR
		Map<String, Double> avgSalHR = empList.stream()
											.filter( e -> e.getDepartment().equals("HR"))
											.collect(Collectors.groupingBy(Employee::getDepartment,
													 Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("---Average salary of department 'HR'---");
		System.out.println("=======================================");
		avgSalHR.forEach((k, v) -> System.out.println("Average Salary of department " + k + " is " + v));
		System.out.println("\n");
		
		//7 emp who gets smallest salary]
		Employee smallest = empList.stream()
									.min(Comparator.comparingInt( e -> e.getSalary()))
									.get();
		System.out.println("---Employee who get smallest amount of salary---");
		System.out.println("================================================");
		System.out.println(smallest.getName());
		System.out.println("\n");
		
		//8 highest salary of emp in each city
		System.out.println("---Highest salary of employee in each city---");
		System.out.println("=============================================");
		Map<String, List<Employee>> highestInEachCity = empList.stream()
																.collect(Collectors.groupingBy(e -> e.getCity()));
		highestInEachCity.forEach((k, v) -> {
			System.out.println(k);
			Employee maxS = empList.stream()
								.max(Comparator.comparingInt(e -> e.getSalary()))
								.get();
			System.out.println(maxS.getSalary());
		});
		System.out.println("\n");
		
		//9  Employees who got the same salary
		System.out.println("---Employees who get the same salary---");
		System.out.println("=======================================");
		Map<Integer, List<Employee>> sameSalary = empList.stream()
														.collect(Collectors.collectingAndThen(
																Collectors.groupingBy(e -> e.getSalary()),
																map -> map.entrySet().stream()
																					.filter(e -> e.getValue().size() > 1)
																					.collect(Collectors.toMap(
																							e -> e.getKey(), 
																							e -> e.getValue()))
																					));
		
		sameSalary.forEach((k, v)-> {
			System.out.println("Employees who get the same salary are " + k);
			System.out.println("Name \t City \t Department \t Salary \t Birthday");
			System.out.println("................................................");
			v.forEach( e -> {
				System.out.println(e.getName() + "\t" + e.getCity() + "\t" + e.getDepartment() + "\t" + e.getSalary() + "\t" + e.getBirthday());
			});
		});
		System.out.println("\n");
		
		//10 List of emp name in each department
		Map<String, List<String>> empDepartment = empList.stream()
														.collect(Collectors.groupingBy(
																e -> e.getDepartment(), Collectors.mapping(
																											e -> e.getName(), 
																											Collectors.toList()
																											)
																));
		System.out.println("---List of Employee names in each department---");
		System.out.println("===============================================");
		empDepartment.forEach((k, v) -> {
			System.out.println("Employees of department '" + k + "' are: ");
			v.forEach(e -> System.out.println(e));
		});
									
	}
}
