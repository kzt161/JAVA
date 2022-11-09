package day3;

public class JavaMethods {
		
	int num1 = 100;	//instance field
	static int num2 = 200;	//static field
	
	static void staticMethod() {
		//num1 = 300; //can't access because it is instance data
		num2 = 300; //can access because it is static data
		staticMethod2();	//ok because it is static data
		//this.num1 = 300;
	}
	
	void instanceMethod1() {
		System.out.println("This is instance Method");
		num1 = 300;
		num2 = 400;
		staticMethod2();
	}
	
	static void staticMethod2() {
		System.out.println("This is statiic Method 2");
	}
	
}
