package day4;

import java.util.Scanner;

public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		
		int rno_1 = 1;
		int rno_2 = 2;
		//enum
		enum rnos {
			Rno1,
			Rno2
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter language name: ");
		var language = sc.nextLine();
		
		if(language.equals("java")) { //java mhr == nk m sit bl .= nk sit ya dl
			System.out.println("java is a compiled language");
		}else if (language.equals("php")) {
			System.out.println("php is a interpretting language");
		}else {
			System.out.println("other language model");
		}
		
		sc.close();
	}
}
