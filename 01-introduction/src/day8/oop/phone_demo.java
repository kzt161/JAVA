package day8.oop;

public class phone_demo {
	
	public static void main(String[]args) {
		
		phone phone1 = new phone("mi", "black");
		phone1.brand = "mi";
		
		phone phone2 = new phone("samsung", "white");
		phone2.brand = "samsung";
		
		System.out.println("Phone1's price: " + phone1.price);
		System.out.println("Phone2's price: " + phone2.price);
	}
}
