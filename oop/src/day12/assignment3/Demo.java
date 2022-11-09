package day12.assignment3;

public class Demo {
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(50, 500, "blue");
		String color = rec.getColor();
		System.out.println("Colour of rectangle: " + color);
		rec.displayArea();
		
	}
}
