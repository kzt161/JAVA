package day7;

import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter salary: ");
			int salary = Integer.parseInt(sc.nextLine());
			if(salary == 0) {
				return;
			}
			System.out.println("Your salary is " + salary);
		}
		finally {
			sc.close();
			System.out.println("Finally block excuted.");
		}
	}

}
