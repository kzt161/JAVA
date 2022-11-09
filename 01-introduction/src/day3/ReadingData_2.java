package day3;

import java.util.Scanner;

public class ReadingData_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create
		Scanner sc = new Scanner(System.in);
		
		//operate
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine(); //primitive type twy phk pe nextLine chg chin yin htae pyy ya dl
		System.out.println("Enter bonus: ");
		int bonus = Integer.parseInt(sc.nextLine());
		//int bonus = sc.nextInt();
		
		System.out.println("----Profile----");
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
		System.out.println("Age: " + age);
		System.out.println("Bonus: " + bonus);
		
		//close
		sc.close();
	}

}
