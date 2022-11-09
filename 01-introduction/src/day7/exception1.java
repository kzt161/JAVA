package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception1 {

	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name: ");
		var name = br.readLine();
		System.out.println("Enter Salary: ");
		var salary = Integer.parseInt(br.readLine());
		
		System.out.println("Your name: " + name);
		System.out.println("Salary: " + salary);
		
	}

}
