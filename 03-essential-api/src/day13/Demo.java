package day13;

public class Demo {
	
	public static void main(String[] args) {
		
		//without using Lambda expression
		Operation add = new Addition();
		Operation div = new Division();
		Operation sub = new Operation() {

			@Override
			public int calculate(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 - num2;
			}
		};
		System.out.println("100 + 200 = " + add.calculate(100, 200));
		System.out.println("100 /  20 = " + div.calculate(100, 20));
		System.out.println("100 - 200 = " + sub.calculate(100, 200));
		
		//using lambda expression
		System.out.println("----------------------");
		Operation add1 = (a, b) -> a + b;
		Operation div1 = (num1, num2) -> num1 / num2;
		Operation sub1 = (x, y) -> x - y;
		
		System.out.println("100 - 200 = " + add1.calculate(100, 200));
		System.out.println("100 / 20  = " + div1.calculate(100, 20));
	}
}
