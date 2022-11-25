package day10_pkg1;

public class B {

	void test() {
		A obj = new A();
		//obj.a = 20; //private nk out side the class phyik ny loh 
		obj.b = 20;//ok default
		obj.c = 20;//ok protected
		obj.d = 20;//ok public
		
		obj.set_A_value(20);
		System.out.println("a = " + obj.view_A_value());
	}
	
	public static void main(String [] args) {
		new B().test();
	}
}
