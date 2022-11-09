package day8.oop;

public class phone {

	//fields
	String brand = new String();
	String color;
	int price;
	
	//constructor
	public phone(String brand, String color) {
		this.brand = brand;
		this.color = color;
		System.out.println("This is arg constructor.");
	}
	
	public phone() {
		System.out.println("This is default constructor.");
	}
	
	//methods
	public void call() {
		System.out.println("calling processing at here!");
	}
	public void takeCamera() {
		System.out.println("Taking photo at here!");
	}
	//block apaw ka key twy yk ta phoe htae tk akhr th3
	//instance block
	{
		System.out.println("This is instance block");
		if(brand.equals("mi"))
				price = 100;
		if(brand.equals("samsung"))
				price = 200;
	}
	
	//static block
	static {
		System.out.println("This is static block");
	}
}
