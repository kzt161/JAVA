package day14.assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		
		ArrayList<String> students = new ArrayList<String>();
		
		students.add("Kings");
		students.add("Zoro");
		students.add("Nami");
		students.add("Melserg");
		students.add("Kelps");
		students.add("Chopper");
		students.add("Berserg");
		students.add("Kapper");
		students.add("Brook");
		students.add("Roug");
		
		try {
			
			while(start) {
				
				System.out.println("1. Show all the student names");
				System.out.println("2. List after sorting");
				System.out.println("3. Search the student and his position");
				System.out.println("4. Insert new student");
				System.out.println("5. Show the students whose name starts with 'K' or 'k' ");
				System.out.println("6. Remove Students whose name ends with 'G' or 'g' ..., and show the list");
				System.out.println("7. Clear the list");
				
				System.out.println("Enter your option: ");
				int inputNumber = sc.nextInt();
				
				while(inputNumber <=0 || inputNumber >= 9 ) {
					System.err.println("Invalid input! Please try again: ");
					inputNumber = sc.nextInt();
				}
				
				switch(inputNumber) {
				
				case 1: {
					
					//show all students
					System.out.println("----Student List----");
					students.forEach(S -> System.out.println(" : " + S));
					break;
				}
				case 2: {
					
					//sorting
					System.out.println("----After sorting names----");
					Collections.sort(students);
					students.forEach(S -> System.out.println(" : " + S));
					break;
				}
				case 3: {
					//searching
					System.out.println("---Searching---");
					System.out.println("Enter student's name: ");
					sc.nextLine();
					String inputName = sc.nextLine();
					int studentIndex = students.indexOf(inputName);
					boolean status = students.contains(inputName);
					System.out.println((status)
						? "=> Student name: " + inputName + ", Position: " + studentIndex
						: "=> The student you have input doesn't exist ");
					break;
				}
				case 4: {
					//inserting new student
					System.out.println("Enter new student name: ");
					sc.nextLine();
					String newS = sc.nextLine();
					if(!students.contains(newS)) {
						students.add(newS);
						System.out.println("New Student had been added. Name: " + newS);
					}
//					else {
//						System.out.println("New Student had been added. Name: " + newS + "1");
//					}
					break;
				}
				case 5: {
					//searching start letter K/k
					System.out.println("---Showing students names starting with 'K' or 'k'--- ");
					for(String data: students) {
						if(data.toLowerCase().contains("k")) {
							System.out.println(data);
						}
					}
					break;
				}
				case 6: {
					//removing students names which end with G/g
					System.out.println("---After removing students whose name ends with 'G' or 'g' ---");
//					for(String g: students) {
//						if(g.toLowerCase().contains("g")) {
//							System.out.println(students);
//						}
//					}
					ArrayList<String> removal = new ArrayList<>();
					students.forEach(stu -> {
						if(stu.toLowerCase().endsWith("g")) {
							removal.add(stu);
						}
					});
//					System.out.println(removal.size());
					if(removal.size() > 0 ) {
						students.removeIf(s -> (s.endsWith("G")) || (s.endsWith("g")));
						System.out.println(students);
					}
					
					break;
				}
				case 7: {
					//clearing
					System.out.println("---List Cleared---");
					System.out.println("..................");
					System.out.println("..................");
					System.out.println("..................");
					break;
				}
			
		}}} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Invalid number!");
		}
	}
}
