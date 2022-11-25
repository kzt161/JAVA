package day12.assignment4;

public class PolymorphismTesting {
	
	public static void main(String[] args) {
		
		Shape[] arr = new Shape[2];
		
		arr[0] = new Cube(3);
		arr[1] = new Circle(3);
		
		
		for(int i = 0; i < arr.length; i++) {
			
			double A = arr[i].area();
			double V = arr[i].volume();
			
			String area = String.format("%.2f", A);
			String volume = String.format("%.2f", V);
			
			System.out.println("Area of " + arr[i].getName() + " is: " + area);
			System.out.println("Volume of " + arr[i].getName() + " is: " + volume);
			
			
		}
	}
	
}
