package day12.assignment4;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (Math.pow(radius, 2));
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
