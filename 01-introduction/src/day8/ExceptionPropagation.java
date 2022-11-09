package day8;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();
	}

	private static void test3() {
		// TODO Auto-generated method stub
		test2();
	}

	private static void test2() {
		// TODO Auto-generated method stub
		test1();
	}

	private static void test1() {
		// TODO Auto-generated method stub
		System.out.println("100/0 = " + 100/0);
	}

}

class Testing{
	int [] numbers = new int[5];
	
	public Testing(String data[]) {
		
	}
}
