package day7;

public class JavaError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		display(num);
	}
	
	private static void display(int i) {
		System.out.println("Num: " + i);
		display(i); //100
	}

}

//m lo at bl obj dwy m sout poh
