package day15.assignment;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class assignment2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student(1, "Luffy");
		Student st2 = new Student(2, "Zoro");
		Student st3 = new Student(3, "Nami");
		Student st4 = new Student(4, "Usopp");
		Student st5 = new Student(5, "Sanji");
		
		Map<Integer, Student> students = new LinkedHashMap<>();
		students.put(st1.getRno(), st1);
		students.put(st2.getRno(), st2);
		students.put(st3.getRno(), st3);
		students.put(st4.getRno(), st4);
		students.put(st5.getRno(), st5);
		
		boolean start = true;
		
		try {
			
			while(start) {
				
				System.out.println("---Options---");
				System.out.println("1. Insert a new student.");
				System.out.println("2. Sort all students");
				System.out.println("3. Display all students");
				System.out.println("4. Update student data");
				System.out.println("5. Search student with roll number");
				System.out.println("6. Delete a specific student according to roll number");
				
				System.out.println("Type your option: ");
				int inputNo = sc.nextInt();
				
				while(inputNo <= 0 || inputNo >=7) {
					System.err.println("Try again");
					inputNo = sc.nextInt();
				}
				
				switch(inputNo) {
				
				case 1: {
					System.out.println("Enter new student roll number: ");
					int newSrno = sc.nextInt();
					Set<String> has = new LinkedHashSet<>();
					students.forEach((k, v) -> {
						if(newSrno == k) {
							System.err.println("Roll number already exist");
							has.add("has");
							return;
						}
					});
					if(has.size() == 0) {
						System.out.println("Enter new Student name: ");
						sc.nextLine();
						String newSname = sc.nextLine();
						students.put(newSrno, new Student(newSrno, newSname));
					}
					break;
				}
				
				case 2: {
					TreeMap<Integer, Student> sorting = new TreeMap<>(students);
					
					System.out.println("---Students---");
					sorting.forEach((k, v) -> {
						System.out.println(k + "\t" + v.getName());
					});
					break;
				}
				
				case 3: {
					System.out.println("---Students---");
					students.forEach((k, v) -> {
						System.out.println(k + "\t" + v.getName());
					});
					break;
				}
				
				case 4: {
					Set<String> upName = new LinkedHashSet<>();
					System.out.println("Enter student noll number that you want to update: ");
					int upRno = sc.nextInt();
					
					students.forEach((k, v) -> {
						if( upRno == k) {
							System.out.println("Enter new name: ");
							sc.nextLine();
							v.setName(sc.nextLine());
							System.out.println("Update successful");
							upName.add("has");
						}
					});
					if(upName.size() == 0 ) {
						System.err.println("Something's wrong! Please check again");
					}
					break;
				}

				case 5: {
					Set<String> ipRno =new LinkedHashSet<>();
					System.out.println("Enter roll number: ");
					int searchRno = sc.nextInt();
					
					students.forEach((k, v) -> {
						if( searchRno == k) {
							System.out.println("Roll Number: " + searchRno + "\n" + "Name: " + v.getName());
							ipRno.add("has");
						}
					});
					if( ipRno.size() == 0) {
						System.err.println("Invalid roll number!");
					}
					break;
				}

				case 6: {
					int size = students.size();
					System.out.println("Enter student roll number that you want to delete: ");
					int deleteRno = sc.nextInt();
					students.keySet().removeIf(r -> r.equals(deleteRno));
					
					if( size != students.size()) {
						System.out.println("Successfully removed");
					}else {
						System.out.println("removal failed");
					}
					break;
				}
				
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Wrong input");
			e.getMessage();
		}
	}
}
