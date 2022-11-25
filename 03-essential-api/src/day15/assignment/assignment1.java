package day15.assignment;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class assignment1 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student st1 = new Student(1, "Luffy");
		Student st2 = new Student(2, "Zoro");
		Student st3 = new Student(3, "Nami");
		Student st4 = new Student(4, "Usopp");
		Student st5 = new Student(5, "Sanji");
		
		Set<Student> students = new LinkedHashSet<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
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
				
				while(inputNo <= 0 || inputNo >= 7) {
					System.err.println("Try again");
					inputNo = sc.nextInt();
				}
				
				switch(inputNo) {
				
				case 1: {//inserting new student
					System.out.println("Enter new student's roll number: ");
					int newRno = sc.nextInt();
					
					Set<String> hasStudent = new LinkedHashSet<>();
					
					students.forEach( stu -> {
						if( newRno == stu.getRno()) {
							System.err.println("roll number already exist!");
							return;
						}
					});
					if(hasStudent.size() == 0) {
						System.out.println("Enter Student name: ");
						sc.nextLine();
						String newName = sc.nextLine();
						students.add(new Student(newRno, newName));
					}
					break;
				}
				
				case 2: {//sorting and display
					TreeSet<Student> sorting = new TreeSet<>(new sortingRno());
					sorting.addAll(students);
					System.out.println("---Students---");
					sorting.forEach( stu -> {
						System.out.println(stu.getRno() + "\t" + stu.getName());
					});
					break;
				}
				
				case 3: {
					System.out.println("---Students---");
					students.forEach( stu -> {
						System.out.println(stu.getRno() + "\t" + stu.getName());
					});
					break;
				}
				
				case 4: {//updating
					TreeSet<String> upName = new TreeSet<>();
					System.out.println("Enter student noll number that you want to update: ");
					int upRno = sc.nextInt();
					students.forEach( stu -> {
						if(upRno == stu.getRno()) {
							System.out.println("Enter name: ");
							sc.nextLine();
							stu.setName(sc.nextLine());
							System.out.println("Update success!");
							upName.add("has");
						}
					});
					if(upName.size() == 0) {
						System.err.println("Something's wrong! Please check again");
					}
					break;
				}
				
				case 5: {//searching with rno
					Set<String> ipRno = new LinkedHashSet<>();
					System.out.println("Enter roll number: ");
					int searchRno = sc.nextInt();
					students.forEach( stu -> {
						if(searchRno == stu.getRno()) {
							System.out.println("Roll Number: " + searchRno + "\n" + "Name: " + stu.getName());
							ipRno.add("has");
						}
					});
					if(ipRno.size() == 0) {
						System.err.println("Invalid Roll number!");
					}
					break;
				}
				
				case 6: {//delete according to rno
					int size = students.size();
					System.out.println("Enter student roll number that you want to delete: ");
					int deleteRno = sc.nextInt();
					students.removeIf( rno -> rno.getRno() == deleteRno);
					
					if( size != students.size()) {
						System.out.println("Successfully removed!");
					}else {
						System.out.println("Removal failed");
					}
					break;
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("---Wrong input---");
			e.getMessage();
		}
	}
}

class sortingRno implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRno() - o2.getRno();
	}
		
}
