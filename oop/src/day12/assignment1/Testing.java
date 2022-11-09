package day12.assignment1;

import java.util.Scanner;

public class Testing {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students's detail do you want to enter: ");
		int qty = sc.nextInt();
		Student[] data = new Student[qty];
		for(int i = 0; i < qty; i++) {
			System.out.println("Enter Student ID: ");
			int stuID = sc.nextInt();
			System.out.println("Enter Student name: ");
			String stuName = sc.next();
			System.out.println("Enter Mark: ");
			int stuMark = sc.nextInt();
			
			data[i] = new Student(stuID, stuName, stuMark);
		}
		
		//display Student's details
		System.out.println("---Students's Details---");
		int a = 1;
		for(int i = 0; i < qty; i++) {
			System.out.println("Student " + a + "'s details");
			a++;
			data[i].display();
		}
		
		//finding student by id
		System.out.println("Enter Student's ID that you want to find: ");
		int inputID = sc.nextInt();
		boolean status = false;
		for(int i = 0; i < qty; i++) {
			if(inputID == data[i].getstudentId()) {
				data[i].display();
				status = true;
				break;
			}
		}if(!status) {
			System.err.println("Student ID " + inputID + " is not available.");
		}
		
		//Maximum Mark
		int total = 0;
		int max = 0;
		String maxMarkStudent = "John";
		for(int i =0; i < qty; i++) {
			total += data[i].getmark();
			if(max < data[i].getmark()) {
				max = data[i].getmark();
				maxMarkStudent = data[i].getname();
				System.out.println("Student whose mark is maximum: " + maxMarkStudent + ". With mark: " + max);
			}
		}
		
		//Average Mark
		double averageMark = total / qty ;
		String avgMark = String.format("%.2f", averageMark);
		System.out.println("Average mark: " + avgMark);
		
	}
	
}
