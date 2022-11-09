package day8;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your mark: ");
			int mark = sc.nextInt();
			
			validMark(mark);
		}
		catch(InvalidMarkException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void validMark(int mark) throws InvalidMarkException{
		if(mark>=0 && mark<=100) {
			System.out.println("Your mark is: " + mark);
		}else {
			throw new InvalidMarkException("You had inputted invalid mark!");
		}
	}
}

class InvalidMarkException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidMarkException(String msg) {
		super(msg);
	}
}
