package day3;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//create
				Scanner sc = new Scanner(System.in);
				
				//operate
				System.out.println("Enter Full Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Email: ");
				String email = sc.nextLine();
				System.out.println("Enter Phone: ");
				String phone = sc.nextLine();
				System.out.println("Enter Education: ");
				String edu = sc.nextLine();
				System.out.println("Enter income: ");
				double income = sc.nextDouble();
				System.out.println("Enter Age: ");
				int age = sc.nextInt();
				
				
				System.out.println("----Profile----");
				System.out.println("Full Name: " + name);
				System.out.println("Email: " + email);
				System.out.println("Phone: " + phone);
				System.out.println("Education: " + edu);
				System.out.println("Income" + income);
				System.out.println("Age" + age);
				
				//close
				sc.close();
			
	}

}
