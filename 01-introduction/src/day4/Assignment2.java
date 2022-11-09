package day4;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,
			positiveNumbers=0,
			negativeNumbers=0,
			zeros=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to type: ");
		int no = sc.nextInt();
		
		for(int i=1; i<=no; i++) {
			System.out.println("Enter any number: ");
			int n = sc.nextInt();
			
			if(n>0) {
				positiveNumbers++;
			}if(n<0) {
				negativeNumbers++;
			}if(n==0) {
				zeros++;
			}
		}	
			System.out.println("Numbers of zero: " + zeros);
			System.out.println("Numbers of positive numbers: " + positiveNumbers);
			System.out.println("Numbers of negative numbers: " + negativeNumbers);
			
		
	}

}
