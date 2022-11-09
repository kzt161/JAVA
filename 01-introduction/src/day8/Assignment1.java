package day8;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you want to type: ");
		int arrNum = sc.nextInt();
		
		String[] strArr = new String[arrNum];
		int[] intArr = new int[arrNum];
		for(int i=0; i < arrNum; i++) {
			System.out.println("Enter any number: ");
			String inputNum = sc.next();
			intArr[i]= Integer.parseInt(strArr[i]);
		}
		System.out.println(Arrays.toString(strArr));
		
		
	}
}
