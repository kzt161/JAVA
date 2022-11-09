package day12.assignment4;

public class Cube implements Shape{
	
	private int x;
	
	public Cube(int x) {
		this.x = x;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 6 * x * x;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return x * x * x;
	}
	
	
}
