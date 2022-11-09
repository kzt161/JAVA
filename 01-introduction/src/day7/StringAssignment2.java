package day7;

import java.util.Scanner;

public class StringAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give one formal sentense: ");
		String str = sc.nextLine();
		
		if(str.contains("?")) {
			String arr[] = str.split(" ",2);
			System.out.println("the first word of the sentence: " + arr[0]);
			
		}else {
			System.out.println("Thank you for your information ^-^");
		}
	}

}
