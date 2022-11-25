package day17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import day16.Employee;

public class Reduction {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Maung Maung", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 6000, "Monywa")
				);
		
		//build-in reduction
		int totalSalary = empList.stream()
								.mapToInt(emp -> emp.getSalary())
								.sum();
		double avgSalary = empList.stream()
								.mapToDouble(emp -> emp.getSalary())
								.average()
								.getAsDouble();
		int maxSalary = empList.stream()		
								.mapToInt(emp -> emp.getSalary())
								.max()
								.getAsInt();
		long count = empList.stream()
							.filter(emp -> emp.getSalary() > 6000)
							.count();
		Employee maxEmp = empList.stream()
							.max(Comparator.comparingInt(emp -> emp.getSalary()))
							.get();
		Employee minEmp = empList.stream()
							.min(Comparator.comparingInt(emp -> emp.getSalary()))
							.get();
		
		System.out.println("total salary: " + totalSalary);
		System.out.println("average salary: " + avgSalary);
		System.out.println("max salary: " + maxSalary);
		System.out.println("salary above 6000: " + count);
		System.out.println("maximum employee: " + maxEmp);
		System.out.println("minimum employee: " + minEmp);
		System.out.println("-----------------------------");
		
		//custom reduction
		totalSalary = empList.stream()
							.mapToInt(emp -> emp.getSalary())
							.reduce(0, (sal1, sal2) -> (sal1 + sal2));
		int minSalary = empList.stream()
								.map(emp -> emp.getSalary())
								.reduce(Integer:: min)
								.get();
		minEmp = empList.stream()
						.reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2)
						.get();
							
		System.out.println("Total salary: " + totalSalary);
		System.out.println("minimum salary: " + minSalary);
//		System.out.println("minimum value: " Integer.min(100,200));
		System.out.println("min salary employee: " + minEmp);
	}
}
