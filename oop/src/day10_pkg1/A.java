package day10_pkg1;

public class A {
	
	private int a = 10;
	int b = 10;
	protected int c = 10;
	public int d = 10;
	
//	public void setA(int input) {
//		this.a = input;
//	}
	
	public void set_A_value(int input) {
		this.a = input;
	}
	
	public int view_A_value() {
		return this.a;
	}
	
//	public int get(A) {
//		return this.a;
//	}
	
	public void test() {
		a = 20;
		b = 20;
		c = 10;
		d = 10;
	}
}
