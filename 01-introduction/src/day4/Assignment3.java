package day4;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bedtime=0;
		int waketime=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("When do u go to bed: ");
		int bt = sc.nextInt();
		System.out.println("When do u get up: ");
		int wt = sc.nextInt();
		
		if(bt <= 12) {
			int st = (wt - bt);
			System.out.println("Number of sleep-time hours: " + st);
		}
		if(bt >= 12) {
			int st = ((24-bt)+wt);
			System.out.println("Number of sleep-time hours: " + st);
			 
			 if(st >= 5 && st <= 8) {
					System.out.println("You take care your health well!");
				}
				if(st < 5 ) {
					System.out.println("You are very hardworking!");
				}
				if(st > 8) {
					System.out.println("You are abnormal!");
				}
		}
		
	}
}
