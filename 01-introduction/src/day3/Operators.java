package day3;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100, num2 = 200;
		
		System.out.println("100 + 200 = " + (num1 + num2));
		System.out.println("100 == 200 ? " + (num1 == num2));
		System.out.println("100 > 50 && 200 < 300 ? " + (num1 > 50 && num2 < 300));
		
		int result = (num1 > num2) ? num2 : num1;
		System.out.println("result: " + result);
		
		num1 += 20; // num1 = num1 + 20
		System.out.println("num1 = " + num1);
	}

}
