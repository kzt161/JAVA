package day7;

import java.util.Scanner;

public class StringAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your NRCNO: ");
		String str = sc.nextLine();
		//Township
		int startT = str.indexOf("/");
		int endT   = str.indexOf("(");
		//Number
		int startN = str.indexOf(")");
		
		
		String township = str.substring(startT+1, endT);
		System.out.println("Township: " + township);
		
		String number = str.substring(startN+1);
		System.out.println("Number: " + number);
		
	}

}
