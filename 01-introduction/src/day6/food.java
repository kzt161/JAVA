package day6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] menus = {null,"Pizza", "Burger", "Milk Tea", "Spicy Noodle"};
		String [] town = {null, "AA", "BB", "CC", "DD"};
		int [] min = { 15, 10, 20, 25};
 		
		LocalDate cdate = LocalDate.now();
		LocalTime ctime = LocalTime.now();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****Available Menu*****");
		System.out.println("1. Pizza");
		System.out.println("2. Burger");
		System.out.println("3. Milk Tea");
		System.out.println("4. Spicy Noodle");
		
		System.out.println("Please choose item: ");
		int ip1 = sc.nextInt(); 
		
		if(ip1 >= 1 && ip1 <=4) {
			System.out.println("*****Deliverable Townships*****");
			System.out.println("AA (15min)");
			System.out.println("BB (10min)");
			System.out.println("CC (20min)");
			System.out.println("DD (25min)");
			System.out.println("Please choose township: ");
			int township = sc.nextInt();
			
			if(township >=1 && township <=4) {
				System.out.println("*****Order type*****");
				System.out.println("1. Order now");
				System.out.println("2. Preorder");
				System.out.println("Please choose your option: ");
				int order = sc.nextInt();
				
				if(order == 1) {
					System.out.println("Your Order Information");
                    System.out.println("Item name: " + menus[ip1]);
                    System.out.println("Address: " + town[township]);
                    System.out.println("Duration: " + min[township-1]);
                    System.out.println("Arrival Time: " + ctime.plusMinutes(min[township-1]));
                    System.out.println("Thank you for Ordering from us");
					}if(order == 2) {
							System.out.println("Enter Delivery Date (dd): ");
							int days = sc.nextInt();
							
							System.out.println("*****Your Order Information");
							System.out.println("Item name: " + menus[ip1]);
							System.out.println("Address: " + town[township]);
//							System.out.println("Arrival Date: " + cdate.plusDays());
//							System.out.println("Arrival Date: " + Local);
					}
			}else {
				System.out.println("The number you choose is not the option.");
			}
		}else {
			System.out.println("The number you choose is not the option.");
		}
	}

}
