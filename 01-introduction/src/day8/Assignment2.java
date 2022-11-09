package day8;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			String[] division= {null, "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL", "MM", "NN"};
			String nrcDivision = null;
			System.out.println("Enter your NRCNO: ");
			String str = sc.nextLine();
			
			//Township
			int startT = str.indexOf("/");
			int endT   = str.indexOf("(");
			//Number
			int startN = str.indexOf(")");
			//division
			int startD = str.indexOf("");
			int endD   = str.indexOf("/");
			String township = str.substring(startT+1, endT);
			System.out.println("Township: " + township);
			
			String number = str.substring(startN+1);
			System.out.println("Number: " + number);
			
			int D = Integer.parseInt(str.substring(startD, endD));
			System.out.println("Division: " + division[D]);
			
		}catch(NumberFormatException e){
			System.out.println("NRC is Incorrect.");
		}
		
	}

}
