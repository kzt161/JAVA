package day7;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter Number1:  ");
			var num1 = sc.nextInt();
			System.out.print("Enter Number2: " );
			var num2 = sc.nextInt();
			
			if(num2 == 0) {
				return;
			}
			var result = num1/num2;
			//create exception obj
			//ArithmeticException obj = new ArithmeticException();
			//throw
			//throw obj;
			System.out.println("Result: " + result);
			
			sc.close();
		}
		
		catch(NullPointerException ex) {
			
		}
		catch(ArithmeticException obj) {
			System.out.println("invalid input. Divided by zero");
		}
		catch(Exception e) {
			System.out.println("Other case");
		}finally {
			System.out.println("It is always excute.");
		}
		
		System.out.println("outside the try catch block");
	}

}
